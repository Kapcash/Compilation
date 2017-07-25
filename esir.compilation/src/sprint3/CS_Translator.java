package sprint3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import sprint2.GeneratorAddr;
import sprint2.QuadImp;
import sprint2.ThreeAddressCode;
import utilitaires.Constante;

public class CS_Translator extends Translator{

	private LinkedList<CS_Function> funcList = new LinkedList<CS_Function>();
	private LinkedList<String> reads = new LinkedList<String>();
	private int nbWrites = 0;
	private String nameMainFonction;

	// C# GENERAL

	private final static String imports = "using System;\nusing System.Collections.Generic;\n";
	private final static String projectName = "namespace BinTreeProject";
	private final static String className = "class Program";
	private final static String mainFunctionName = "static void Main(string[] args)";
	

	// Utils
	private final static String lAccolade = "{";
	private final static String rAccolade = "}";
	
	public CS_Translator(ThreeAddressCode code) {
		super(code);
	}

	public void translate() throws CS_TranslatorException {

		write(imports);
		newLine();

		write(projectName);
		write(lAccolade); // Project BEGIN

		rightShift();
		write(className);
		write(lAccolade); // Class BEGIN

		rightShift();
		
		writeSymbs();

		iterateCode();

		writeFunction();

		write(mainFunctionName);
		write(lAccolade);
		codeMain();
		write(rAccolade);

		leftShift();
		write(rAccolade); // Class END
		leftShift();

		write(rAccolade); // Project END

	}

	public void iterateCode() throws CS_TranslatorException {
		HashMap<String, LinkedList<QuadImp>> map = code.getCode3Addr();
		iterateCode("L" + (map.size() - 1));
	}

	public void iterateCode(String E) throws CS_TranslatorException {
		HashMap<String, LinkedList<QuadImp>> map = code.getCode3Addr();
		LinkedList<QuadImp> list = map.get(E);
		if (list == null)
			throw new CS_TranslatorException("Erreur dans les étiquettes");
		Iterator<QuadImp> it = list.iterator();
		QuadImp quad = it.next();
		String fName = quad.getReponse();
		if(isFunctionAlreadyDeclared(fName))
			return;
		CS_Function f = new CS_Function(quad.getReponse());
		funcList.add(f);
		if(inMainFunction)
			nameMainFonction = quad.getReponse();
		iterateList(it, f);
	}

	private boolean isFunctionAlreadyDeclared(String fName) {
		Iterator<CS_Function> it = funcList.iterator();
		while (it.hasNext()) {
			if(it.next().name.equals(fName))
				return true;
		}
		return false;
	}

	public String findLabelOfThisFunction(String E) throws CS_TranslatorException {
		HashMap<String, LinkedList<QuadImp>> map = code.getCode3Addr();
		Iterator<Map.Entry<String, LinkedList<QuadImp>>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, LinkedList<QuadImp>> pair = it.next();
			if (pair.getValue().getFirst().getReponse().equals(E))
				return (String) pair.getKey();
		}
		throw new CS_TranslatorException("Erreur dans les étiquettes");
	}

	protected void writeSymbs(){
		write("//Here the symbs used in the while code");
		write("static BinTree nil = new BinTree(\"nil\", null, null);");
		GeneratorAddr.getInstance().getSymbs().forEach((key, value) -> {
			write("private static BinTree " + key + " = new BinTree (\""+key+"\", null, null);");
		});
		write("");
	}
	
	protected void codeMain() {
		rightShift();
		Iterator<String> iteReads = reads.iterator();
		int incrementArgs = 0;
		write("Queue<BinTree> inParams = new Queue<BinTree>();");
		write("Queue<BinTree> outParams = new Queue<BinTree>();");
		while (iteReads.hasNext()) {
			String it = iteReads.next();
			write("if(args.Length > "+incrementArgs+"){");
			rightShift();
			write("BinTree " + it + " = BinTree.convertStrToBinTree(args["+incrementArgs+"]);");
			write("inParams.Enqueue(" + it + ");");
			leftShift();
			write("}");
			write("else{");
			rightShift();
			write("BinTree " + it + " = new BinTree(\""+it+"\", null, null);");
			write("inParams.Enqueue(" + it + ");");
			leftShift();
			write("}");
			incrementArgs++;
		}
		write(nameMainFonction + "(inParams, outParams);");
		for (int i = 0; i < nbWrites; i++) {
			write("BinTree resTree = outParams.Dequeue();");
			write("Console.WriteLine(resTree.DisplayTree());");
			write("Console.WriteLine(\"Equivalent en nombre : \"+BinTree.convertBinTreeToInt(resTree));");
		}
		
		if(Constante.DEBUG_TRACE){ 			//Only for visual studio running
			write("Console.ReadLine();"); 	//Useless for command line running
		}
		leftShift();
	}

	protected void writeFunction() throws CS_TranslatorException {
		for (Iterator<CS_Function> iterator = funcList.iterator(); iterator.hasNext();) {
			CS_Function cs_Function = (CS_Function) iterator.next();
			cs_Function.printFunction(this);
		}
	}

	@Override
	protected void translate_function(QuadImp quad) {
		funcList.add(new CS_Function(quad.getReponse()));
	}

	@Override
	protected void translate_nop(Function f) {
		f.write("((Action)(() => { }))();");
	}

	@Override
	protected void translate_foreach_1(QuadImp quad, Function f) {
		f.write("while(BinTree.isTrue(" + code.getCode3Addr().get(quad.getEtiquette()).getLast().getReponse()+ "))");
		f.write(lAccolade);
		f.rightShift();
	}

	@Override
	protected void translate_foreach_2(QuadImp quad, Function f) {
		f.write(code.getCode3Addr().get(quad.getArg1()).getLast().getArg1() + " = " + code.getCode3Addr().get(quad.getArg1()).getLast().getReponse() + ";");
		f.leftShift();
		f.write(rAccolade);
	}

	@Override
	protected void translate_affectation(QuadImp quad, Function f) {
		f.write(quad.getReponse() + " = " + quad.getArg1() + ";");
	}

	@Override
	protected void translate_and(QuadImp quad, Function f) {
		f.write(quad.getReponse() + " = BinTree.evaluate(\"AND\"," + quad.getArg1() + "," + quad.getArg2() + ");");
	}

	@Override
	protected void translate_or(QuadImp quad, Function f) {
		f.write(quad.getReponse() + " = BinTree.evaluate(\"OR\"," + quad.getArg1() + "," + quad.getArg2() + ");");
	}

	@Override
	protected void translate_eq(QuadImp quad, Function f) {
		f.write(quad.getReponse() + " = BinTree.evaluate(\"EQ\"," + quad.getArg1() + "," + quad.getArg2() + ");");
	}

	@Override
	protected void translate_pop(QuadImp quad, Function f) {
		f.write(quad.getReponse() + " = outParams.Dequeue();");
	}

	@Override
	protected void translate_call(QuadImp quad, Function f) {
		f.write(quad.getEtiquette() + "(inParams,outParams);");
		inMainFunction = false;
	}

	@Override
	protected void translate_push(QuadImp quad, Function f) {
		f.write("inParams.Enqueue(" + quad.getArg1() + ");");
	}

	@Override
	protected void translate_cons(QuadImp quad, Function f) {
		f.write(quad.getReponse() + " = (BinTree.cons(inParams));");
	}

	@Override
	protected void translate_list(QuadImp quad, Function f) {
		f.write(quad.getReponse() + " = (BinTree.list(inParams));");		
	}

	@Override
	protected void translate_hd(QuadImp quad, Function f) {
		f.write(quad.getReponse() + " = BinTree.head(" + quad.getArg1() + ");");		
	}

	@Override
	protected void translate_tl(QuadImp quad, Function f) {
		f.write(quad.getReponse() + " = BinTree.tail(" + quad.getArg1() + ");");
	}

	@Override
	protected void translate_if_1(QuadImp quad, Function f) {
		f.write("if(BinTree.isTrue(" + code.getCode3Addr().get(quad.getEtiquette()).getLast().getReponse()+ "))");
		f.write(lAccolade);
		f.rightShift();
	}
}