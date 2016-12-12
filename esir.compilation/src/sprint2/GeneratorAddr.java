package sprint2;

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
import com.google.inject.Injector;
import com.google.inject.Provider;

import esir.compilation.WhileCompStandaloneSetup;
import esir.compilation.whileComp.Affectation;
import esir.compilation.whileComp.Command;
import esir.compilation.whileComp.Commands;
import esir.compilation.whileComp.Definition;
import esir.compilation.whileComp.Expr;
import esir.compilation.whileComp.ExprAnd;
import esir.compilation.whileComp.ExprEq;
import esir.compilation.whileComp.ExprNot;
import esir.compilation.whileComp.ExprOr;
import esir.compilation.whileComp.ExprSimple;
import esir.compilation.whileComp.For;
import esir.compilation.whileComp.Foreach;
import esir.compilation.whileComp.Function;
import esir.compilation.whileComp.If;
import esir.compilation.whileComp.Lexpr;
import esir.compilation.whileComp.Not;
import esir.compilation.whileComp.Program;
import esir.compilation.whileComp.Read;
import esir.compilation.whileComp.While;
import esir.compilation.whileComp.Write;

public class GeneratorAddr {

	private static final String PREFIXE = "X";

	// MAIN //
	public static void main(String[] args) {
		System.out.println("Constructing symbole table.");
		Injector injector = new WhileCompStandaloneSetup().createInjectorAndDoEMFRegistration();
		GeneratorAddr main = injector.getInstance(GeneratorAddr.class);
		try {
			main.createSymTable("../exemple4.wh", "./");
		} catch (SymTableException symEx) {
			System.out.println("[SYMTABLE ERROR] : " + symEx.getMessage());
		} catch (ThreeAddressCodeException codeEx) {
			System.out.println("[ADDRCODE ERROR] : " + codeEx.getMessage());
		} catch (CS_TranslatorException transEx) {
			System.out.println("[TRANSLATOR ERROR] : " + transEx.getMessage());
		}
	}
	// ---- //

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	/**
	 * List of declared functions in the Program
	 */
	HashMap<String, DefFun> funList = new HashMap<String, DefFun>();
	ThreeAddressCode code3Addresses = new ThreeAddressCode();

	/**
	 * Starting the symbols table generation
	 * @param string
	 *            File path to examinate
	 * @param sortie
	 *            Output file path
	 * @throws SymTableException
	 *             Error when creating the symbols table
	 * @throws ThreeAddressCodeException
	 *             Error when creating the code generator
	 * @throws CS_TranslatorException
	 */
	private void createSymTable(String string, String sortie)
			throws SymTableException, ThreeAddressCodeException, CS_TranslatorException {
		// Load the resource
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createFileURI(string), true);

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
			if (next instanceof Program)
				iterateAST((Program) next); // Parcours l'AST du 'Program'
		}

		checkSymbolsUsage(); 	// Check all the symbols usage (undeclared function
								// for example)
		displaySymTable(); 		// Print the symbols table
		System.out.println(code3Addresses);
		System.out.println("Symboles Table correctly generated.");

		// Translator
		CS_Translator translator = new CS_Translator(code3Addresses);
		translator.translate();
		//System.out.println(translator);
		
		/*
		 * ACTIVER L'ECRITURE EN C#
		 * 
		 * try( PrintWriter out = new PrintWriter(
		 * "../C# Project/ProjectCOMP/ProjectCOMP/Program.cs" ) ){
		 * out.println(translator.toString()); } catch (FileNotFoundException e)
		 * { e.printStackTrace(); }
		 */
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

		boolean fun = funList.containsKey(fName);
		if (fun) { // Function already existing
			throw new SymTableException("Function '" + fName + "' already declared !");
		} else {
			DefFun def = new DefFun(fName);
			funList.put(fName, def); // Adding a new blank function
										// (DefFun)
			code3Addresses.addIn3Addr(new QuadImp(new OPCode<OP, String>(OP.FUN, ""), fName, "", ""));
			iterateAST(f.getDefinition(), def);
		}
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
			f.updateVar(v, null);
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
			f.updateVar(v, null);
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

		if (vals.size() != affs.size())
			throw new ThreeAddressCodeException("Affectation error !");

		Iterator<String> itAff = affs.iterator();
		Iterator<Expr> itVal = vals.iterator();

		int i = 0;
		String val;
		String var;

		while (itVal.hasNext()) {
			iterateAST(itVal.next(), f); // For Expr
			// TODO : Update val because now it is 'Expr', not only Variable
			// TODO : Declare vars used in temp (Y0, Y1 and co.)
			int k =code3Addresses.inlineExpression();
			val = "Y"+(k < 0 ? 0 : k);
			var = PREFIXE + i++;
			varDeclaration(f, var);
			code3Addresses.addIn3Addr(new QuadImp(new OPCode<OP, String>(OP.AFF, ""), var, val, ""));
			//f.updateVar(var, val);
		}

		i = 0;
		while (itAff.hasNext()) {
			var = itAff.next();
			val = PREFIXE + i++;
			varDeclaration(f, var);
			code3Addresses.addIn3Addr(new QuadImp(new OPCode<OP, String>(OP.AFF, ""), var, val, ""));
			f.updateVar(var, val);
		}
	}

	// Expr
	private void iterateAST(Expr exp, DefFun f) throws SymTableException{
		ExprSimple expSimp = exp.getExprsimple();
		iterateAST(expSimp, f);

		ExprAnd exprAnd = exp.getExprAnd();
		if (exprAnd != null)
			iterateAST(exprAnd, f);
	}

	// ExprSimple
	private void iterateAST(ExprSimple ex, DefFun f) throws SymTableException{
		String val = ex.getValeur();
		String operator = ex.getOpe();
		Expr exp = ex.getExpr();
		Lexpr exprs = ex.getLexpr();
		if (operator != null) {
			switch (operator) {
			case "cons":
				code3Addresses.addToExpression(OP.CONS.name());
				break;
			case "hd":
				code3Addresses.addToExpression(OP.HD.name());
				break;
			case "tl":
				code3Addresses.addToExpression(OP.TL.name());
				break;
			case "list":
				// TODO
				break;
			default:
				break;
			}
		} else {
			if (val != null) {
				code3Addresses.addToExpression(val);
			}
		}
		if (isSymbole(val)) { // Symbole
			f.updateSyms(val,exprs);
		}
		if (isVariable(val)) { // Variable
			f.updateVar(val, null);
		}
		if (exp != null) { // Expr
			iterateAST(exp, f);
		}
		if (exprs != null) { // Lexpr
			iterateAST(exprs, f);
		}
	}
	
	// ExprAnd
	private void iterateAST(ExprAnd ex, DefFun f) throws SymTableException  {
		ExprAnd exprAnd = ex.getExprAnd();
		if (exprAnd != null)
			iterateAST(exprAnd, f);

		ExprOr exprOr = ex.getExprOr();
		if (exprOr != null)
			iterateAST(exprOr, f);
	}

	// ExprOr
	private void iterateAST(ExprOr ex, DefFun f) throws SymTableException {

		ExprOr exprOr = ex.getExprOr();
		if (exprOr != null)
			iterateAST(exprOr, f);

		ExprNot exprNot = ex.getExprNot();
		if (exprNot != null)
			iterateAST(exprNot, f);
	}

	// ExprNot
	private void iterateAST(ExprNot ex, DefFun f) throws SymTableException {
		Not not = ex.getNot();
		/*
		 * if(not != null) iterateAST(exprNot,f);
		 */

		ExprEq exprEq = ex.getExprEq();
		if (exprEq != null)
			iterateAST(exprEq, f);
	}

	//ExprEq
	private void iterateAST(ExprEq ex, DefFun f) throws SymTableException {
		iterateAST(ex.getExprSimple1(), f);
		iterateAST(ex.getExprSimple2(), f);
	}

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
		code3Addresses.addIn3Addr(new QuadImp(new OPCode<OP, String>(OP.WHILE, code3Addresses.getEtiquette()), "",
				whCmd.getExpr().toString(), ""));
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
		for (String f : funList.keySet()) {
			System.out.println(f + " : " + funList.get(f) + "\n");
		}
	}
	
	/**
	 * Check the symbols usages :
	 *  - if called symbols are declared functions
	 *  - if they are called with correct input number
	 * @throws SymTableException Throws a SymTable Error if the program is not correct according to the symbols
	 */
	private void checkSymbolsUsage() throws SymTableException {
		for (DefFun f : funList.values()) {
			// Checking symbols usage after generating all the symbols table
			for (String symbol : f.getSymbs().keySet()) {
				Lexpr lexpr = f.getSymbs().get(symbol);
				int expectedParameters = funList.get(symbol).getIn();
				int nbOfParameters = ((lexpr!=null) ? countExprs(lexpr) : 0);
				//Check if the function exists
				if (!funList.containsKey(symbol)){
					throw new SymTableException("Symbol '" + symbol + "' used but not corresponding to any declared function !");
				}
				//Check if the function is called with the correct parameters number
				else if(nbOfParameters != expectedParameters){
					throw new SymTableException("The function "+symbol+" is called with "+nbOfParameters+", expected "+expectedParameters);
				}
			}
		}
	}
	
	/**
	 * Count the number of Expr in an Lexpr
	 * Used to count the number of parameter of a called function (symbol)
	 * @param exprs The Lexpr to count
	 * @return Return the total number of Expr in the Lexpr
	 */
	private int countExprs(Lexpr exprs){
		int ret = 1; //There is at least one Expr
		if(exprs.getLexpr() != null){
			ret += countExprs(exprs.getLexpr());
		}
		return ret;
	}

	/**
	 * Checks if a string is considered as a Symbol (starts with a lowercase char)
	 * @param str The string to check the type
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
	 * Checks if a string is considered as a Variable (starts with an uppercase char)
	 * @param str The string to check the type
	 * @return Return true if the string is considered as a Variable in WHILE
	 */
	private boolean isVariable(String str) {
		if (str == null)
			return false;
		String firstChar = str.substring(0, 1);
		return firstChar.equals(firstChar.toUpperCase()); // Is uppercase ->
															// Variable
	}
	
	private void varDeclaration(DefFun f, String v) {
		if (!f.alreadyExisting(v))
			code3Addresses.addIn3Addr(new QuadImp(new OPCode<OP, String>(OP.DECL, ""), v, "", ""));
	}
}
