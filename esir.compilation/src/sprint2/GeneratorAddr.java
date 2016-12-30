package sprint2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;
import com.google.inject.Provider;

import esir.compilation.WhileCompStandaloneSetup;
import esir.compilation.whileComp.Affectation;
import esir.compilation.whileComp.Command;
import esir.compilation.whileComp.Commands;
import esir.compilation.whileComp.Definition;
import esir.compilation.whileComp.Expr;
//import esir.compilation.whileComp.ExprAnd;
//import esir.compilation.whileComp.ExprEq;
//import esir.compilation.whileComp.ExprNot;
//import esir.compilation.whileComp.ExprOr;
import esir.compilation.whileComp.ExprSimple;
import esir.compilation.whileComp.For;
import esir.compilation.whileComp.Foreach;
import esir.compilation.whileComp.Function;
import esir.compilation.whileComp.If;
import esir.compilation.whileComp.Lexpr;
import esir.compilation.whileComp.Nop;
import esir.compilation.whileComp.Not;
import esir.compilation.whileComp.Program;
import esir.compilation.whileComp.Read;
import esir.compilation.whileComp.While;
import esir.compilation.whileComp.Write;
import sprint3.CS_Translator;
import sprint3.CS_TranslatorException;

public class GeneratorAddr {

	// SETTINGS
	private static final boolean DISPLAY_SYM_TABLE = true;
	private static final boolean DISPLAY_THREE_ADDR_CODE = true;
	private static final boolean DISPLAY_TRANSLATION = false;
	private static final boolean PRINT_TRANSLATION = false;

	// CONST
	private static final String VAR_PREFIXE = "X";
	private static final String INPUT_FILE = "../exemple.wh";
	private static final String OUTPUT_FILE = "../BinTreeProject/BinTreeProject/Program.cs";

	private static GeneratorAddr instance;

	/**
	 * List of declared functions in the Program <String, DefFun> = Name, (Symbs
	 * + Calls)
	 */
	HashMap<String, DefFun> funList = new HashMap<String, DefFun>();
	/**
	 * List of global symbols, undeclared <String, String> = symbole, null
	 */
	HashMap<String, String> symbs = new HashMap<String, String>();
	ThreeAddressCode code3Addresses = new ThreeAddressCode();

	/**
	 * MAIN Input : + args[0] = inputFilePath + args[1] = outputFilePath
	 */
	public static void main(String[] args) {
		GeneratorAddr main = GeneratorAddr.getInstance();
		main.launchGeneration(args);
	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	// ---- //

	public static GeneratorAddr getInstance() {
		if (instance == null) {
			return new WhileCompStandaloneSetup().createInjectorAndDoEMFRegistration().getInstance(GeneratorAddr.class);
		} else {
			return instance;
		}
	}

	/**
	 * Input : + args[0] = inputFilePath + args[1] = outputFilePath
	 */
	public void launchGeneration(String[] args) {
		System.out.println("Compiling program.");

		try {
			if (args.length > 0)
				createSymTable(args[0], args[1]);
			else
				createSymTable(INPUT_FILE, OUTPUT_FILE);

		} catch (SymTableException symEx) {
			System.out.println("[SYMTABLE ERROR] : " + symEx.getMessage());
		} catch (ThreeAddressCodeException codeEx) {
			System.out.println("[ADDRCODE ERROR] : " + codeEx.getMessage());
		} catch (CS_TranslatorException transEx) {
			System.out.println("[TRANSLATOR ERROR] : " + transEx.getMessage());
		}
	}

	/**
	 * Starting the symbols table generation
	 * 
	 * @param inputFilePath
	 *            File path to examinate
	 * @param outputFilePath
	 *            Output file path
	 * @throws SymTableException
	 *             Error when creating the symbols table
	 * @throws ThreeAddressCodeException
	 *             Error when creating the code generator
	 * @throws CS_TranslatorException
	 */
	public void createSymTable(String inputFilePath, String outputFilePath)
			throws SymTableException, ThreeAddressCodeException, CS_TranslatorException {
		// Load the resource
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createFileURI(inputFilePath), true);

		// Validate the resource
		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			for (Issue issue : list) {
				System.err.println(issue);
			}
			return;
		}

		TreeIterator<EObject> tree = resource.getAllContents();
		while (tree.hasNext()) {
			EObject next = tree.next();
			if (next instanceof Program) {
				discoverFunctions((Program) next); // Just read the function's
													// names
				iterateAST((Program) next); // Start to discover all the program
			}
		}

		checkSymbolsUsage(); // Check all the symbols usage (undeclared function
								// for example)

		if (DISPLAY_SYM_TABLE) {
			displaySymTable(); // Print the symbols table
			System.out.println("Symboles Table correctly generated.");
			System.out.println("\n" + writeSymTableXML(INPUT_FILE + "xml"));
		}
		if (DISPLAY_THREE_ADDR_CODE) {
			System.out.println(code3Addresses);
		}
		// Translator
		CS_Translator translator = new CS_Translator(code3Addresses);
		translator.translate();

		if (DISPLAY_TRANSLATION) {
			System.out.println(translator);
		}
		if (PRINT_TRANSLATION) {
			try (PrintWriter out = new PrintWriter(outputFilePath)) {
				out.println(translator.toString());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Initialize the function list just with the name of declared functions
	 * 
	 * @param prog
	 * @throws SymTableException
	 */
	private void discoverFunctions(Program prog) throws SymTableException {
		for (Function f : prog.getFunctions()) {
			String fName = f.getFunction();
			boolean fun = funList.containsKey(fName);
			if (fun) { // Function already existing
				throw new SymTableException("Function '" + fName + "' already declared !");
			} else {
				DefFun def = new DefFun(fName);
				funList.put(fName, def); // Adding a new blank function
			}
		}
	}

	// ITERATE ON THE AST

	// Program
	private void iterateAST(Program prog) throws SymTableException, ThreeAddressCodeException {
		for (Function f : prog.getFunctions()) {
			iterateAST(f);
		}
	}

	// Function
	private void iterateAST(Function f) throws SymTableException, ThreeAddressCodeException {
		String fName = f.getFunction();
		code3Addresses.nouvelleEtiquette();

		DefFun def = new DefFun(fName);
		funList.put(fName, def); // Adding a new blank function
		// (DefFun)
		code3Addresses.addIn3Addr(new QuadImp(new OPCode<OP, String>(OP.FUN, ""), fName, "", ""));
		iterateAST(f.getDefinition(), def);
		code3Addresses.finEtiquette();
	}

	// Definition
	private void iterateAST(Definition def, DefFun f) throws SymTableException, ThreeAddressCodeException {
		// Inputs
		iterateAST(def.getRead(), f);
		// Commands
		iterateAST(def.getCommands(), f);
		// Outputs
		iterateAST(def.getWrite(), f);
	}

	// Read
	public void iterateAST(Read read, DefFun f) throws SymTableException {
		EList<String> varsR = read.getVariable();
		f.setIn(varsR.size());
		for (String v : varsR) {
			if (f.alreadyExisting(v))
				throw new SymTableException(
						"Function '" + f.getFunName() + "', variable '" + v + "' already declared !");
			f.updateVar(v);
			code3Addresses.addIn3Addr(new QuadImp(new OPCode<OP, String>(OP.READ, ""), v, "", ""));
		}
	}

	// Write
	private void iterateAST(Write write, DefFun f) throws SymTableException {
		EList<String> varsW = write.getVariable();
		f.setOut(varsW.size());
		for (String v : varsW) {
			varDeclaration(f, v);
			code3Addresses.addIn3Addr(new QuadImp(new OPCode<OP, String>(OP.WRITE, ""), v, "", ""));
			f.updateVar(v);
		}
	}

	// Commands
	public void iterateAST(Commands coms, DefFun f) throws SymTableException, ThreeAddressCodeException {
		Command com = coms.getCommand();
		iterateAST(com, f); // First command of definition
		for (Command c : coms.getCommands()) { // Eventually other commands
			iterateAST(c, f);
		}
	}

	// Command
	private void iterateAST(Command com, DefFun f) throws SymTableException, ThreeAddressCodeException {
		EObject obj = com.getCommand();
		if (obj instanceof Affectation) { // Affectation
			iterateAST((Affectation) obj, f);
		} else if (obj instanceof Nop) { // Nop
			code3Addresses.addIn3Addr(new QuadImp(new OPCode<OP, String>(OP.NOP, ""), "", "", ""));
		} else {
			if (obj instanceof While) { // While
				iterateAST((While) obj, f);
			} else if (obj instanceof For) { // For
				iterateAST((For) obj, f);
			} else if (obj instanceof Foreach) { // Foreach
				iterateAST((Foreach) obj, f);
			} else if (obj instanceof If) { // If
				iterateAST((If) obj, f);
			} else {
			}
			code3Addresses.finEtiquette();
		}
	}

	// Affectation
	private void iterateAST(Affectation affCmd, DefFun f) throws SymTableException, ThreeAddressCodeException {
		EList<String> affs = affCmd.getAffectations();
		EList<Expr> vals = affCmd.getValeurs();

		/*
		 * Todo : Count the number of given values at the right of the
		 * affectation Could be called function with a return variable number.
		 * Florent gave up
		 */
		// if (vals.size() != affs.size())
		// throw new ThreeAddressCodeException("Affectation error !");

		Iterator<String> itAff = affs.iterator();
		Iterator<Expr> itVal = vals.iterator();

		int i = 0;
		String val, var;

		// Values to affect
		while (itVal.hasNext()) {
			iterateAST(itVal.next(), f); // For Expr
			int k = code3Addresses.inlineExpression(this, f);
			val = "Y" + k;
			var = VAR_PREFIXE + i++;
			varDeclaration(f, var);
			code3Addresses.addIn3Addr(new QuadImp(new OPCode<OP, String>(OP.AFF, ""), var, val, ""));
		}

		i = 0;
		// Affected variables
		while (itAff.hasNext()) {
			var = itAff.next();
			val = VAR_PREFIXE + i++;
			varDeclaration(f, var);
			code3Addresses.addIn3Addr(new QuadImp(new OPCode<OP, String>(OP.AFF, ""), var, val, ""));
			f.updateVar(var);
		}
	}

	// Expr
	private void iterateAST(Expr exp, DefFun f) throws SymTableException {
		// System.out.print("{");
		/*
		 * 
		 * ExprSimple expSimp = exp.getExprsimple(); iterateAST(expSimp, f);
		 * 
		 */
		// System.out.print("}");
		code3Addresses.addLevel();
		ExprSimple expS = exp.getExprsimple();
		if (expS != null)
			iterateAST(expS, f);
		code3Addresses.subLevel();
	}

	// ExprSimple
	private void iterateAST(ExprSimple ex, DefFun f) throws SymTableException {
		String val = ex.getValeur();
		String operator = ex.getOpe();
		Expr exp = ex.getExpr();
		Lexpr exprs = ex.getLexpr();
		Expr ex1 = ex.getEx1();
		Expr ex2 = ex.getEx2();
		Not n = ex.getN();

		if (operator != null) {
			switch (operator) {
			case "cons":
				code3Addresses.addToExpression(OP.CONS.name(), funList);
				break;
			case "hd":
				code3Addresses.addToExpression(OP.HD.name(), funList);
				break;
			case "tl":
				code3Addresses.addToExpression(OP.TL.name(), funList);
				break;
			case "list":
				code3Addresses.addToExpression(OP.LIST.name(), funList);
				break;
			case "and":
				code3Addresses.addToExpression(OP.AND.name(), funList);
				break;
			case "or":
				code3Addresses.addToExpression(OP.OR.name(), funList);
				break;
			case "=?":
				code3Addresses.addToExpression(OP.EQ.name(), funList);
				break;
			default:
				break;
			}
		} else {
			if (n != null) {
				code3Addresses.addToExpression(OP.NOT.name(), funList);
			}
			if (val != null) {
				System.out.println(val);
				code3Addresses.addToExpression(val, funList);
			}
		}
		if (isSymbole(val)) { // Symbole
			if (exprs != null) {
				f.updateCalls(val, exprs);
				// TODO : Check return number
			} else {
				this.symbs.put(val, "");
			}
		}
		if (isVariable(val)) { // Variable
			f.updateVar(val);
		}
		if (exp != null) { // Expr
			iterateAST(exp, f);
		}
		if (exprs != null) { // Lexpr
			iterateAST(exprs, f);
		}
		if (ex1 != null) { // Ex1
			iterateAST(ex1, f);
		}
		if (ex2 != null) { // Expr
			iterateAST(ex2, f);
		}
	}

	// // ExprAnd
	// private void iterateAST(ExprAnd ex, DefFun f) throws SymTableException {
	// code3Addresses.addLevel();
	// ExprAnd exprAnd = ex.getExprAnd();
	// if (exprAnd != null){
	// System.out.println("on est là");
	// code3Addresses.addToExpression(OP.AND.name(),funList);
	// iterateAST(exprAnd, f);
	// iterateAST(ex.getExprOr(), f);
	// }else{
	// iterateAST(ex.getExprOr(), f);
	// }
	// code3Addresses.subLevel();
	// }
	//
	// // ExprOr
	// private void iterateAST(ExprOr ex, DefFun f) throws SymTableException {
	// ExprOr exprOr = ex.getExprOr();
	// if (exprOr != null)
	// iterateAST(exprOr, f);
	//
	// ExprNot exprNot = ex.getExprNot();
	// if (exprNot != null)
	// iterateAST(exprNot, f);
	// }
	//
	// // ExprNot
	// private void iterateAST(ExprNot ex, DefFun f) throws SymTableException {
	// Not not = ex.getNot();
	// /* TODO
	// * if(not != null) iterateAST(exprNot,f);
	// */
	//
	// ExprEq exprEq = ex.getExprEq();
	// if (exprEq != null)
	// iterateAST(exprEq, f);
	// }
	//
	// //ExprEq
	// private void iterateAST(ExprEq ex, DefFun f) throws SymTableException {
	// iterateAST(ex.getExprSimple1(), f);
	// if(ex.getExprSimple2() != null){
	// iterateAST(ex.getExprSimple2(), f);
	// }
	// }

	// Lexpr
	private void iterateAST(Lexpr lexp, DefFun f) throws SymTableException {
		Expr exp = lexp.getExpr();
		Lexpr exprs = lexp.getLexpr();
		if (exp != null) {
			iterateAST(exp, f);
		}
		if (exprs != null) {
			iterateAST(exprs, f);
		}
	}

	// While
	private void iterateAST(While whCmd, DefFun f) throws SymTableException, ThreeAddressCodeException {
		iterateAST(whCmd.getExpr(), f);
		int k = code3Addresses.inlineExpression(this, f);
		String expr = "Y" + k;

		code3Addresses
				.addIn3Addr(new QuadImp(new OPCode<OP, String>(OP.WHILE, code3Addresses.getEtiquette()), "", expr, ""));
		code3Addresses.nouvelleEtiquette();
		Commands cmds = whCmd.getCommands();
		iterateAST(cmds, f);
	}

	// For
	private void iterateAST(For forCmd, DefFun f) throws SymTableException, ThreeAddressCodeException {
		code3Addresses.addIn3Addr(new QuadImp(new OPCode<OP, String>(OP.FOR, code3Addresses.getEtiquette()), "",
				forCmd.getExpr().toString(), ""));
		code3Addresses.nouvelleEtiquette();
		Commands cmds = forCmd.getCommands();
		iterateAST(cmds, f);
	}

	// Foreach
	private void iterateAST(Foreach forEachCmd, DefFun f) throws SymTableException, ThreeAddressCodeException {
		Commands cmds = forEachCmd.getCommands();
		iterateAST(cmds, f);
	}

	// If
	private void iterateAST(If ifCmd, DefFun f) throws SymTableException, ThreeAddressCodeException {
		QuadImp q = new QuadImp(new OPCode<OP, String>(OP.IF, code3Addresses.getFutureEtiquette()),
				ifCmd.getExpr().toString(), "", "");
		code3Addresses.addIn3Addr(q);
		// Then
		code3Addresses.nouvelleEtiquette();
		Commands cmds1 = ifCmd.getCommands1();
		iterateAST(cmds1, f);
		code3Addresses.finEtiquette();
		q.setArg2(code3Addresses.getFutureEtiquette());
		// Else
		code3Addresses.nouvelleEtiquette();
		Commands cmds2 = ifCmd.getCommands2();
		iterateAST(cmds2, f);
	}

	// TOOLS //

	/**
	 * Print the final symboles table
	 */
	private void displaySymTable() {
		System.out.println();
		System.out.println("Symboles globaux : \n" + symbs.keySet() + "\n");
		for (String f : funList.keySet()) {
			System.out.println(f + " : " + funList.get(f) + "\n");
		}
	}

	/**
	 * Write in a file and a string an XML representation of the Symbole Table.
	 * Used for tests
	 * 
	 * @param outputPath
	 *            Output file where to write the XML format of the Symbole Table
	 * @return An XML string representation of the Symbole table
	 */
	public String writeSymTableXML(String outputPath) {
		String ret = "";
		ret += "<symboles>";
		for (String s : symbs.keySet()) {
			ret += "\n\t<sym>" + s + "</sym>";
		}
		ret += "\n</symboles>\n<functions>";
		for (String f : funList.keySet()) {
			DefFun deffun = funList.get(f);
			ret += "\n\t<function>";
			ret += "\n\t\t<name>" + f + "</name>";
			HashMap<String, Integer> vars = deffun.getVars();
			ret += "\n\t\t<vars>";
			for (String var : vars.keySet()) {
				ret += "\n\t\t\t<var>\n\t\t\t\t<vname>" + var + "</vname>";
				ret += "\n\t\t\t\t<value>" + vars.get(var) + "</value>";
				ret += "\n\t\t\t</var>";
			}
			ret += "\n\t\t</vars>";
			HashMap<String, Lexpr> calls = deffun.getCalls();
			ret += "\n\t\t<calls>";
			for (String call : calls.keySet()) {
				ret += "\n\t\t\t<f>" + call + "</f>";
			}
			ret += "\n\t\t</calls>";
			ret += "\n\t</function>";
		}
		ret += "\n</functions>";

		if (outputPath != null && !outputPath.equals("")) {
			try {
				PrintWriter writer = new PrintWriter(outputPath, "UTF-8");
				writer.println(ret);
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return ret;
	}

	/**
	 * Check the symbols usages : - if called symbols are declared functions -
	 * if they are called with correct input number
	 * 
	 * @throws SymTableException
	 *             Throws a SymTable Error if the program is not correct
	 *             according to the symbols
	 */
	private void checkSymbolsUsage() throws SymTableException {
		// Symbols as function (calls, declaration)
		for (DefFun f : funList.values()) {
			// Checking symbols usage after generating all the symbols table
			for (String symbol : f.getCalls().keySet()) {
				Lexpr lexpr = f.getCalls().get(symbol);
				// Check if the function exists
				if (!funList.containsKey(symbol)) {
					throw new SymTableException(
							"Symbol '" + symbol + "' used but not corresponding to any declared function !");
				}
				int expectedParameters = funList.get(symbol).getIn();
				int nbOfParameters = ((lexpr != null) ? countExprs(lexpr) : 0);
				// Check if the function is called with the correct parameters
				// number
				if (nbOfParameters != expectedParameters) {
					throw new SymTableException("The function " + symbol + " is called with " + nbOfParameters
							+ ", expected " + expectedParameters);
				}
			}
		}
	}

	/**
	 * Count the number of Expr in an Lexpr Used to count the number of
	 * parameter of a called function (symbol)
	 * 
	 * @param exprs
	 *            The Lexpr to count
	 * @return Return the total number of Expr in the Lexpr
	 */
	private int countExprs(Lexpr exprs) {
		int ret = 1; // There is at least one Expr
		if (exprs.getLexpr() != null) {
			ret += countExprs(exprs.getLexpr());
		}
		// TODO : Sale, tres sale. Mais c'est trop complique a faire propre.
		// Tant pis. T_T
		String fun = "";
		try {
			fun = exprs.getExpr().getExprsimple().getValeur();
			System.out.println("FUN : " + fun);
		} catch (NullPointerException nullEx) {
			/* Nothing */}
		if (funList.containsKey(fun)) { //
			ret += funList.get(fun).getOut();
		}
		return ret;
	}

	/**
	 * Checks if a string is considered as a Symbol (starts with a lowercase
	 * char)
	 * 
	 * @param str
	 *            The string to check the type
	 * @return Return true if the string is considered as a Symbol in WHILE
	 */
	private boolean isSymbole(String str) {
		if (str == null || str.equals("nil"))
			return false;
		String firstChar = str.substring(0, 1);
		return firstChar.equals(firstChar.toLowerCase()); // Is lowercase ->
															// Symbole
	}

	/**
	 * Checks if a string is considered as a Variable (starts with an uppercase
	 * char)
	 * 
	 * @param str
	 *            The string to check the type
	 * @return Return true if the string is considered as a Variable in WHILE
	 */
	private boolean isVariable(String str) {
		if (str == null)
			return false;
		String firstChar = str.substring(0, 1);
		return firstChar.equals(firstChar.toUpperCase()); // Is uppercase ->
		// Variable
	}

	void varDeclaration(DefFun f, String v) {
		if (!f.alreadyExisting(v)) {
			code3Addresses.addIn3Addr(new QuadImp(new OPCode<OP, String>(OP.DECL, ""), v, "", ""));
		}
	}

	public HashMap<String, DefFun> getFunList() {
		return funList;
	}

	public void setFunList(HashMap<String, DefFun> funList) {
		this.funList = funList;
	}

	public HashMap<String, String> getSymbs() {
		return symbs;
	}

	public void setSymbs(HashMap<String, String> symbs) {
		this.symbs = symbs;
	}

	public ThreeAddressCode getCode3Addresses() {
		return code3Addresses;
	}

	public void setCode3Addresses(ThreeAddressCode code3Addresses) {
		this.code3Addresses = code3Addresses;
	}

}
