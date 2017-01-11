package sprint2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
import esir.compilation.whileComp.impl.ExprImpl;
import esir.compilation.whileComp.impl.ExprSimpleImpl;
import sprint3.CS_Translator;
import sprint3.CS_TranslatorException;
import utilitaires.Constante;

public class GeneratorAddr {

	// SETTINGS
	public static boolean DISPLAY_SYM_TABLE = false;
	public static boolean DISPLAY_THREE_ADDR_CODE = true;
	public static boolean DISPLAY_TRANSLATION = true;
	public static boolean PRINT_TRANSLATION = false;
	// CONST
	private static final String VAR_PREFIXE = "X";
	private static final String INPUT_FILE = "../fib.wh";
	private static final String OUTPUT_FILE = "../BinTreeProject/BinTreeProject/Program.cs";
	private static final String OUTPUT_XML_FILE = "";

	private static final boolean isDebugMode = Constante.DEBUG_TRACE;


	private static GeneratorAddr instance;

	/**
	 * List of declared functions in the Program <String, DefFun> = Name, (Symbs + Calls)
	 */
	private static HashMap<String, DefFun> funList = new HashMap<String, DefFun>();
	/**
	 * List of global symbols, undeclared <String, String> = symbole, null
	 */
	private static HashMap<String, String> symbs = new HashMap<String, String>();
	private ThreeAddressCode code3Addresses = new ThreeAddressCode();

	/**
	 * MAIN Input : + args[0] = inputFilePath + args[1] = outputFilePath
	 */
	public static void main(String[] args) throws SymTableException, ThreeAddressCodeException, CS_TranslatorException {
		GeneratorAddr main = GeneratorAddr.getInstance();
		main.launchGeneration(args);
	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	// ---- //

	/**
	 * Get the singleton instance of the GeneratorAddr
	 * @return The unique instance of the GeneratorAddr
	 */
	public static GeneratorAddr getInstance() {
		if (instance == null) {
			return new WhileCompStandaloneSetup().createInjectorAndDoEMFRegistration().getInstance(GeneratorAddr.class);
		} else {
			return instance;
		}
	}

	/**
	 * Start the generation of SymTable + 3@ code + traduction
	 * @param args args[0] = inputFilePath, args[1] = outputFilePath
	 */
	public void launchGeneration(String[] args) throws SymTableException, ThreeAddressCodeException, CS_TranslatorException {
		if(isDebugMode){System.out.println("Compiling program.");}
		resetGenerator(); //Reseting the generator before starting another generation
		if (args.length > 0)
			createSymTable(args[0], args[1]);
		else
			createSymTable(INPUT_FILE, OUTPUT_FILE);
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
			EObject next = tree.next(); //AST
			if (next instanceof Program) {
				discoverFunctions((Program) next); // Just read the function's names and inputs / outputs
				iterateAST((Program) next); // Start to discover all the program
			}
		}

		checkSymbolsUsage(); // Check all the symbols usage

		// Translator
		CS_Translator translator = new CS_Translator(code3Addresses);
		translator.translate();

		//Printing on console
		if (DISPLAY_SYM_TABLE) {
			displaySymTable(); 		// Print the symbols table
		}
		if (DISPLAY_THREE_ADDR_CODE) {
			System.out.println(code3Addresses); // Print the 3@ code
		}
		if (DISPLAY_TRANSLATION) {	// Print C# code generated
			System.out.println(translator);
		}
		if (PRINT_TRANSLATION) { 	// Write C# code generated in a file
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
	 * @param prog The WHILE Program to discover
	 * @throws SymTableException A function is declared twice with a single name
	 */
	private void discoverFunctions(Program prog) throws SymTableException {
		for (Function f : prog.getFunctions()) { //Going through all functions of the Program
			String fName = f.getFunction();
			Definition def = f.getDefinition();
			boolean existingFunction = funList.containsKey(fName);
			if (existingFunction) { // Function already existing
				throw new SymTableException("Function '" + fName + "' already declared!");
			} else {
				DefFun defFun = new DefFun(fName);
				defFun.setIn(def.getRead().getVariable().size()); 	//Set nb input
				defFun.setOut(def.getWrite().getVariable().size()); //Set nb output
				funList.put(fName, defFun); // Adding a new blank function
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
		System.out.println(fName);
		code3Addresses.nouvelleEtiquette();

		DefFun def = new DefFun(fName);
		funList.put(fName, def); // Adding a new blank function
		// (DefFun)
		code3Addresses.fun(fName);
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
		if(hasDuplicates(varsR)){
			throw new SymTableException("Function '" + f.getFunName() + "' contains duplicates variables in Read statement!");
		}

		f.setIn(varsR.size()); //Get inputs
		for (String v : varsR) {
			f.updateVar(v); //Add the var to the SymTable
			// New 3@ <READ, v, , >
			code3Addresses.read(v);
		}
	}

	// Write
	private void iterateAST(Write write, DefFun f) throws SymTableException {
		EList<String> varsW = write.getVariable();
		if(hasDuplicates(varsW)){
			throw new SymTableException("Function '" + f.getFunName() + "' contains duplicates variables in Write statement!");
		}

		f.setOut(varsW.size()); //Get outputs
		for (String v : varsW) {
			//varDeclaration3Addr(f, v); // New 3@ <DECL, v, , >
			code3Addresses.write(v);	//New 3@ <WRITE, v, , >
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
		if (obj instanceof Affectation) { 			// Affectation
			iterateAST((Affectation) obj, f);
		} else if (obj instanceof Nop) { 			// Nop
			code3Addresses.nop();
		} else if (obj instanceof While) { 			// While
			iterateAST((While) obj, f);
		} else if (obj instanceof For) { 		// For
			iterateAST((For) obj, f);
		} else if (obj instanceof Foreach) { 	// Foreach
			iterateAST((Foreach) obj, f);
		} else if (obj instanceof If) { 		// If
			iterateAST((If) obj, f);
		}
		else {
		}
		//code3Addresses.finEtiquette();
	}

	// Affectation
	private void iterateAST(Affectation affCmd, DefFun f) throws SymTableException, ThreeAddressCodeException {
		EList<String> affs = affCmd.getAffectations(); 	//Left side
		EList<Expr> vals = affCmd.getValeurs();			// Right side

		checkAffUsage(affCmd);

		Iterator<String> itAff = affs.iterator();
		Iterator<Expr> itVal = vals.iterator();

		int i = 0;
		String val, var;

		// Right side to evaluate before
		while (itVal.hasNext()) {
			iterateAST(itVal.next(), f); // For Expr
			List<String> list = code3Addresses.inlineExpression(this, f);
			Iterator<String> it = list.iterator();
			while (it.hasNext()) {
				val = it.next();
				var = VAR_PREFIXE + (i++);
				varDeclaration3Addr(f, var);
				code3Addresses.aff(var, val);
			}
		}

		i = 0;
		// Left side 
		while (itAff.hasNext()) {
			var = itAff.next();
			val = VAR_PREFIXE + (i++);
			f.updateVar(var);
			varDeclaration3Addr(f, val);
			code3Addresses.aff(var, val);

		}
	}

	// Expr
	private void iterateAST(Expr exp, DefFun f) throws SymTableException, ThreeAddressCodeException {
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
	// @see WhileComp.xtext ExprSimple
	private void iterateAST(ExprSimple ex, DefFun f) throws SymTableException, ThreeAddressCodeException {
		String val = ex.getValeur();
		String operator = ex.getOpe();
		Expr exp = ex.getExpr();
		Lexpr exprs = ex.getLexpr();
		Expr ex1 = ex.getEx1();
		Expr ex2 = ex.getEx2();
		Not n = ex.getN();
		String call = ex.getCall();

		if (isVariable(val)) { // Variable
			f.updateVar(val);
		}

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
				varDeclaration3Addr(f, val);
				code3Addresses.addToExpression(val, funList);
			}
			if( call != null){
				//System.out.println(call);
				code3Addresses.addToExpression(call, funList);
			}
		}
		if (isSymbole(val)) { // Symbole
			symbs.put(val, "");
		}
		if(call != null && exprs != null){ //Fun call
			f.updateCalls(call, exprs);
		}
		if (exp != null) { // Expr
			iterateAST(exp, f);
		}
		if (exprs != null) { // Lexpr (arguments of command)
			iterateAST(exprs, f);
		}
		if (ex1 != null) { // operation Expr1
			iterateAST(ex1, f);
		}
		if (ex2 != null) { // operation Expr2
			iterateAST(ex2, f);
		}
	}

	// Lexpr (Recursive)
	private void iterateAST(Lexpr lexp, DefFun f) throws SymTableException, ThreeAddressCodeException {
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
		String etiquetteCond = code3Addresses.getEtiquette();
		code3Addresses.nouvelleEtiquette(); //LC
		iterateAST(whCmd.getExpr(), f);	//Condition
		code3Addresses.inlineExpression(this, f);
		code3Addresses.finEtiquette();

		code3Addresses.nouvelleEtiquette(); //LB
		Commands cmds = whCmd.getCommands();
		iterateAST(cmds, f); 	//While body
		code3Addresses.finEtiquette();
		// New 3@ <WHILE LC, , LB, >, LC = condition, LB = body
		code3Addresses.whileLoop(etiquetteCond, code3Addresses.getPreviousEtiquette());
	}

	// For
	private void iterateAST(For forCmd, DefFun f) throws SymTableException, ThreeAddressCodeException {
		Expr forCond = forCmd.getExpr();
		String forCondOpe = forCond.getExprsimple().getOpe();
		//Condition checking
		if(forCondOpe != null){
			if(forCondOpe == "and" || forCondOpe == "or" || forCondOpe == "=?"){
				System.out.println("Erreur d'expression dans la boucle for");
				return;
			}
		}

		String etiquetteCond = code3Addresses.getEtiquette();
		code3Addresses.nouvelleEtiquette(); //Condition LC
		iterateAST(forCond, f);
		code3Addresses.inlineExpression(this, f);
		code3Addresses.finEtiquette();

		code3Addresses.nouvelleEtiquette();  //Body LB
		Commands cmds = forCmd.getCommands();
		iterateAST(cmds, f);
		Expr expression = new ExprImpl();
		ExprSimple expre = new ExprSimpleImpl();
		expre.setOpe("tl");
		expre.setExpr(forCond);
		expression.setExprsimple(expre);
		iterateAST(expression, f);
		code3Addresses.inlineExpression(this, f);
		code3Addresses.finEtiquette();
		// New 3@ <FOR LC, , LB, >
		code3Addresses.forLoop(etiquetteCond,code3Addresses.getPreviousEtiquette());
	}

	// Foreach
	private void iterateAST(Foreach forEachCmd, DefFun f) throws SymTableException, ThreeAddressCodeException {
		Expr var = forEachCmd.getExpr1();
		String nomVar = var.getExprsimple().getValeur();
		Expr Cond = forEachCmd.getExpr2();
		String forCondOpe = Cond.getExprsimple().getOpe();
		//Condition checking
		if(forCondOpe != null){
			if(forCondOpe == "and" || forCondOpe == "or" || forCondOpe == "=?"){
				System.out.println("Erreur d'expression dans la boucle foreach");
				return;
			}
		}

		if(nomVar == null){
			System.out.println("Erreur d'expression dans la boucle foreach");
			return;
		}

		String etiquetteCond = code3Addresses.getEtiquette();
		code3Addresses.nouvelleEtiquette(); //Condition LC
		iterateAST(Cond, f);
		code3Addresses.inlineExpression(this, f);
		code3Addresses.finEtiquette();

		code3Addresses.nouvelleEtiquette();  //Body LB
		Expr expression = new ExprImpl();
		ExprSimple expre = new ExprSimpleImpl();
		expre.setOpe("hd");
		expre.setExpr(Cond);
		expression.setExprsimple(expre);
		iterateAST(expression, f);
		List<String> list = code3Addresses.inlineExpression(this, f);
		code3Addresses.aff(nomVar, list.get(0));

		Commands cmds = forEachCmd.getCommands();
		iterateAST(cmds, f);

		Expr expressionbis = new ExprImpl();
		ExprSimple exprebis = new ExprSimpleImpl();
		exprebis.setOpe("tl");
		exprebis.setExpr(Cond);
		expressionbis.setExprsimple(exprebis);
		iterateAST(expressionbis, f);
		code3Addresses.inlineExpression(this, f);

		code3Addresses.finEtiquette();
		// New 3@ <FOR LC, , LB, >
		code3Addresses.forEachLoop(etiquetteCond,code3Addresses.getPreviousEtiquette());

	}

	// If
	private void iterateAST(If ifCmd, DefFun f) throws SymTableException, ThreeAddressCodeException {
		//Cond
		String etiquetteCond = code3Addresses.getEtiquette();
		code3Addresses.nouvelleEtiquette(); //Condition LC
		iterateAST(ifCmd.getExpr(), f);
		List<String> list = code3Addresses.inlineExpression(this, f);
		code3Addresses.finEtiquette();

		// Then
		code3Addresses.nouvelleEtiquette(); //L1
		Commands cmds1 = ifCmd.getCommands1();
		iterateAST(cmds1, f);
		String etiquetteCode = code3Addresses.getEtiquette();
		// Else
		Commands cmds2 = ifCmd.getCommands2();
		if(cmds2 != null){
			code3Addresses.finEtiquette();
			code3Addresses.nouvelleEtiquette(); //L2
			iterateAST(cmds2, f);
			code3Addresses.finEtiquette();
			code3Addresses.ifElseCond(etiquetteCond,etiquetteCode, code3Addresses.getPreviousEtiquette());
		}else{
			code3Addresses.finEtiquette();
			code3Addresses.ifCond(etiquetteCond, code3Addresses.getPreviousEtiquette());
		}

	}

	// TOOLS //

	/**
	 * Reset the static maps of the Generator
	 */
	private void resetGenerator(){
		funList = new HashMap<String, DefFun>();
		symbs = new HashMap<String, String>();
	}

	/**
	 * Check the symbols usages : - if called symbols are declared functions -
	 * if they are called with correct input number
	 * 
	 * @throws SymTableException
	 *             Throws a SymTable Error if the program is not correct
	 *             according to the symbols
	 */
	public void checkSymbolsUsage() throws SymTableException {
		// Symbols as function (calls, declaration)
		for (DefFun f : funList.values()) {
			// Checking symbols usage after generating all the symbols table
			for (String symbol : f.getCalls().keySet()) {
				Lexpr lexpr = f.getCalls().get(symbol);
				// Check if the function exists
				if (!funList.containsKey(symbol)) {
					throw new SymTableException("Symbol '" + symbol + "' used but not corresponding to any declared function!");
				}
				int expectedParameters = funList.get(symbol).getIn();
				int nbOfParameters = ((lexpr != null) ? countExprs(lexpr) : 0);
				// Check if the function is called with the correct parameters number
				if (nbOfParameters != expectedParameters) {
					throw new SymTableException("The function " + symbol + " is called with " + nbOfParameters + ", expected " + expectedParameters);
				}
			}
		}
	}

	/**
	 * Check if the multiple affectations are correctly used
	 * @param aff The affectation to check
	 * @throws SymTableException If there is to the same number of left variables and right values returned
	 */
	public void checkAffUsage(Affectation aff) throws SymTableException {
		EList<String> affs = aff.getAffectations(); 	//Left side
		EList<Expr> vals = aff.getValeurs();			// Right side
		int nbIn = affs.size();
		int nbOut = 0;
		for(Expr val : vals){
			ExprSimple simp = val.getExprsimple();
			if(simp.getCall() != null){
				nbOut += funList.get(simp.getCall()).getOut();
			}
			else{
				nbOut++;
			}
		}
		//Final condition IN == OUT
		//System.out.println("CHECK AFF : IN="+nbIn+" OUT="+nbOut);
		if(nbIn != nbOut){
			throw new SymTableException("There is "+nbIn+" inputs but "+nbOut+" outputs in this affectation.");
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
		String fun = "";
		try {
			fun = exprs.getExpr().getExprsimple().getValeur();
		} catch (NullPointerException nullEx){ /* Nothing */ }
		if (funList.containsKey(fun)) {
			ret += funList.get(fun).getOut();
		}
		return ret;
	}

	/**
	 * Checks if there is duplicates in a collection
	 * @param coll The collection to check
	 * @return True if the collection contains duplicates, false else.
	 */
	private <T> boolean hasDuplicates(Collection<T> coll ){
		boolean ret = false;
		Set<T> set = new HashSet<T>(coll);
		if(coll.size() > set.size()){
			ret = true;
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
		if (str == null || str.equals("nil")){ return false; }
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
		if (str == null){ return false;	}
		String firstChar = str.substring(0, 1);
		return firstChar.equals(firstChar.toUpperCase()); // Is uppercase -> Variable
	}

	public void varDeclaration3Addr(DefFun f, String v) {
		if(isVariable(v)){
			if (!f.alreadyExisting(v)) {
				if (!f.tempAlreadyExisting(v)) {
					f.updateTempVars(v);
				}
			}
		}
	}

	// GETTERS //
	public HashMap<String, DefFun> getFunList() {
		return funList;
	}

	public HashMap<String, String> getSymbs() {
		return symbs;
	}

	public ThreeAddressCode getCode3Addresses() {
		return code3Addresses;
	}
	// ------- //

	/**
	 * Print the final symbols table (Lists + XML)
	 */
	private void displaySymTable() {
		System.out.println();
		System.out.println("Symboles globaux : \n" + symbs.keySet() + "\n");
		for (String f : funList.keySet()) {
			System.out.println(f + " : " + funList.get(f) + "\n");
		}
		System.out.println("Symboles Table correctly generated.");
		System.out.println("\n" + writeSymTableXML(OUTPUT_XML_FILE));
	}
	
	/**
	 * Write in a file and a string an XML representation of the Symbole Table.
	 * Used espacially for tests
	 * 
	 * @param outputPath
	 *            Output file where to write the XML format of the Symbole Table
	 * @return An XML string representation of the Symbole table
	 */
	public String writeSymTableXML(String outputPath) {
		String ret = "";
		ret += "<tds>\n\t<symboles>";
		for (String s : symbs.keySet()) {
			ret += "\n\t\t<sym>" + s + "</sym>";
		}
		ret += "\n\t</symboles>\n\t<functions>";
		for (String f : funList.keySet()) {
			DefFun deffun = funList.get(f);
			ret += "\n\t\t<function>";
			ret += "\n\t\t\t<name>" + f + "</name>";
			HashMap<String, Integer> vars = deffun.getVars();
			ret += "\n\t\t\t<vars>";
			for (String var : vars.keySet()) {
				ret += "\n\t\t\t\t<var>\n\t\t\t\t\t<vname>" + var + "</vname>";
				ret += "\n\t\t\t\t\t<value>" + vars.get(var) + "</value>";
				ret += "\n\t\t\t\t</var>";
			}
			ret += "\n\t\t\t</vars>";
			HashMap<String, Lexpr> calls = deffun.getCalls();
			ret += "\n\t\t\t<calls>";
			for (String call : calls.keySet()) {
				ret += "\n\t\t\t\t<f>" + call + "</f>";
			}
			ret += "\n\t\t\t</calls>";
			ret += "\n\t\t</function>";
		}
		ret += "\n\t</functions>\n</tds>";

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
}
