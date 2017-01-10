package sprint3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import sprint2.DefFun;
import sprint2.GeneratorAddr;
import sprint2.QuadImp;
import sprint2.ThreeAddressCode;

public class CS_Translator {

	private ThreeAddressCode code;
	private StringBuilder stb = new StringBuilder();
	private int k = 0;
	private LinkedList<CS_Function> funcList = new LinkedList<CS_Function>();
	private LinkedList<String> reads = new LinkedList<String>();
	private LinkedList<String> allDecls = new LinkedList<String>();
	private boolean inMainFunction = true;
	private int nbWrites = 0;
	private String nameMainFonction;

	// C# GENERAL

	private final static String imports = "using System;\nusing System.Collections.Generic;\n";
	private final static String projectName = "namespace BinTreeProject";
	private final static String className = "class Program";
	private final static String mainFunctionName = "static void Main(string[] args)";
	private final static String typeName = "Queue<BinTree>";

	// Utils
	private final static String lAccolade = "{";
	private final static String rAccolade = "}";
	private final static String newLine = "\n";
	private final static String tab = "\t";

	public CS_Translator(ThreeAddressCode code) {
		super();
		this.code = code;
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

/*	private void codeMain() {
//		rightShift();
//		Iterator<String> ite = reads.iterator();
//		ArrayList<String> readToBinTree = new ArrayList<String>();
//		String nameFonction = null;
//		String executerFonction = null;
//		int incrementArgs = 0;
//		while (ite.hasNext()) {
//			String it = ite.next();
//			if (it.contains("function")) {
//				if (readToBinTree.size() > 0) {
//					
//					write("Queue<BinTree> input = new Queue<BinTree>();");
//					write("Queue<BinTree> output = new Queue<BinTree>();");
//					
//					Iterator<String> ite2 = readToBinTree.iterator();
//					while (ite2.hasNext()) {
//						String it2 = ite2.next();
//						write("if(args.Length > "+incrementArgs+"){");
//						rightShift();
//						write("BinTree " + it2 + " = new BinTree(args["+incrementArgs+"], null, null);");
//						write("input.Enqueue(" + it2 + ");");
//						leftShift();
//						write("}");
//						write("else{");
//						rightShift();
//						write("BinTree " + it2 + " = new BinTree(\""+it2+"\", null, null);");
//						write("input.Enqueue(" + it2 + ");");
//						leftShift();
//						write("}");
//						incrementArgs++;
//					}
//					write("}");
//					write(executerFonction);
//				}
//				nameFonction = it.split(" ")[1];
//				executerFonction = nameFonction + "(input, output);";
//			} else {
//				readToBinTree.add(it);
//			}
//		}
//		if (readToBinTree.size() > 0) {
//			write("Queue<BinTree> input = new Queue<BinTree>();");
//			write("Queue<BinTree> output = new Queue<BinTree>();");
//			Iterator<String> ite2 = readToBinTree.iterator();
//			while (ite2.hasNext()) {
//				String it2 = ite2.next();
//				write("if(args.Length > "+incrementArgs+"){");
//				rightShift();
//				write("BinTree " + it2 + " = new BinTree(args["+incrementArgs+"], null, null);");
//				write("input.Enqueue(" + it2 + ");");
//				leftShift();
//				write("}");
//				write("else{");
//				rightShift();
//				write("BinTree " + it2 + " = new BinTree(\""+it2+"\", null, null);");
//				write("input.Enqueue(" + it2 + ");");
//				leftShift();
//				write("}");
//				
//				incrementArgs++;
//			}
//			write(executerFonction);
//		}
//		write("Console.WriteLine(output.Dequeue().DisplayTree());");
//		
//		write("Console.ReadLine();");
//		leftShift();
	}
*/	
	private void writeSymbs(){
		write("//Here the symbs used in the while code");
		write("static BinTree nil = new BinTree(\"nil\", null, null);");
		GeneratorAddr.getInstance().getSymbs().forEach((key, value) -> {
			write("private static BinTree " + key + " = new BinTree (\""+key+"\", null, null);");
		});
		write("");
	}
	
	private void codeMain() {
		rightShift();
		Iterator<String> iteReads = reads.iterator();
		int incrementArgs = 0;
		write("Queue<BinTree> input = new Queue<BinTree>();");
		write("Queue<BinTree> output = new Queue<BinTree>();");
		while (iteReads.hasNext()) {
			String it = iteReads.next();
			write("if(args.Length > "+incrementArgs+"){");
			rightShift();
			write("BinTree " + it + " = BinTree.convertStrToBinTree(args["+incrementArgs+"]);");
			write("input.Enqueue(" + it + ");");
			leftShift();
			write("}");
			write("else{");
			rightShift();
			write("BinTree " + it + " = new BinTree(\""+it+"\", null, null);");
			write("input.Enqueue(" + it + ");");
			leftShift();
			write("}");
			incrementArgs++;
		}
		write(nameMainFonction + "(input, output);");
		for (int i = 0; i < nbWrites; i++) {
			write("Console.WriteLine(output.Dequeue().DisplayTree());");
		}
		
		
		write("Console.ReadLine();");
		leftShift();
	}

	private void iterateList(Iterator<QuadImp> it, CS_Function f) throws CS_TranslatorException {
		while (it.hasNext()) {
			QuadImp quad = it.next();
			switch (quad.getOperateur().getOpe()) {
			case FUN:
				funcList.add(new CS_Function(quad.getReponse()));
				break;
			case READ:
				f.write("" + quad.getReponse() + " = input.Dequeue();");
				if(inMainFunction)
					reads.add(quad.getReponse());
				break;
			case WRITE:
				f.write("output.Enqueue(" + quad.getReponse() + ");");
				if(inMainFunction || f.name.equals(nameMainFonction)){
					nbWrites++;
					inMainFunction=true;
				}
					
				break;
			case NOP:
				f.write("((Action)(() => { }))();");
				break;

			// LOOPS
			case IF:
				iterateList(code.getCode3Addr().get(quad.getEtiquette()).iterator(), f);
				if(code.getCode3Addr().get(quad.getEtiquette()).getLast().getReponse().equals("")){
					f.write("if(BinTree.BinTree.isTrue(" + code.getCode3Addr().get(quad.getEtiquette()).getLast().getArg1()
							+ "))");
				}else{
					f.write("if(BinTree.BinTree.isTrue(" + code.getCode3Addr().get(quad.getEtiquette()).getLast().getReponse()
							+ "))");
				}
				f.write(lAccolade);
				f.rightShift();
				iterateList(code.getCode3Addr().get(quad.getArg1()).iterator(), f);
				f.leftShift();
				LinkedList<QuadImp> arg2 = code.getCode3Addr().get(quad.getArg2());
				if (arg2 != null && !arg2.equals("")) {
					f.write(rAccolade + "else" + lAccolade);
					f.rightShift();
					iterateList(code.getCode3Addr().get(quad.getArg2()).iterator(), f);
					f.leftShift();
				}
				f.write(rAccolade);
				break;
			case WHILE:
				iterateList(code.getCode3Addr().get(quad.getEtiquette()).iterator(), f);
				f.write("while(BinTree.isTrue(" + code.getCode3Addr().get(quad.getEtiquette()).getLast().getReponse()
						+ "))");
				f.write(lAccolade);
				f.rightShift();
				iterateList(code.getCode3Addr().get(quad.getArg1()).iterator(), f);
				iterateList(code.getCode3Addr().get(quad.getEtiquette()).iterator(), f);
				f.leftShift();
				f.write(rAccolade);
				break;
			case FOR:
				iterateList(code.getCode3Addr().get(quad.getEtiquette()).iterator(), f);
				f.write("while(BinTree.isTrue(" + code.getCode3Addr().get(quad.getEtiquette()).getFirst().getArg1()
						+ "))");
				f.write(lAccolade);
				f.rightShift();
				iterateList(code.getCode3Addr().get(quad.getArg1()).iterator(), f);
				//iterateList(code.getCode3Addr().get(quad.getEtiquette()).iterator(), f);
				f.write(code.getCode3Addr().get(quad.getArg1()).getLast().getArg1() + " = " + code.getCode3Addr().get(quad.getArg1()).getLast().getReponse() + ";");
				//System.out.println(allDecls);
				f.leftShift();
				f.write(rAccolade);
				break;
			
			case FOREACH:
				iterateList(code.getCode3Addr().get(quad.getEtiquette()).iterator(), f);
				f.write("while(BinTree.isTrue(" + code.getCode3Addr().get(quad.getEtiquette()).getLast().getReponse()
						+ "))");
				f.write(lAccolade);
				f.rightShift();
				iterateList(code.getCode3Addr().get(quad.getArg1()).iterator(), f);
				//iterateList(code.getCode3Addr().get(quad.getEtiquette()).iterator(), f);
				f.write(code.getCode3Addr().get(quad.getArg1()).getLast().getArg1() + " = " + code.getCode3Addr().get(quad.getArg1()).getLast().getReponse() + ";");
				f.leftShift();
				f.write(rAccolade);
				break;
				
			case DECL:
				//f.write("BinTree " + quad.getReponse() + " = new BinTree (\""+quad.getReponse()+"\", null, null);");
				/*
				Iterator<String> iteDecl = allDecls.iterator();
				Boolean dontContains = true;
				while(iteDecl.hasNext()){
					String decl = iteDecl.next();
					if(decl.equals(quad.getReponse()))
						dontContains = false;
				}
				if(dontContains){
					f.write("BinTree " + quad.getReponse() + " = new BinTree (\""+quad.getReponse()+"\", null, null);");
					allDecls.add(quad.getReponse());
				}
				else{
					f.write(quad.getReponse() + " = new BinTree (\""+quad.getReponse()+"\", null, null);");
				}
				*/

				break;
			case AFF:
				f.write(quad.getReponse() + " = " + quad.getArg1() + ";");
				break;
			case AND:
				f.write(quad.getReponse() + " = BinTree.evaluate(\"AND\"," + quad.getArg1() + "," + quad.getArg2() + ");");
				break;
			case OR:
				f.write(quad.getReponse() + " = BinTree.evaluate(\"OR\"," + quad.getArg1() + "," + quad.getArg2() + ");");
				break;
			case EQ:
				f.write(quad.getReponse() + " = BinTree.evaluate(\"EQ\"," + quad.getArg1() + "," + quad.getArg2() + ");");
				break;
			// FUNCTION USE
			case PUSH:
				f.write("inParams.Enqueue(" + quad.getArg1() + ");");
				break;
			case CALL:
				f.write(quad.getEtiquette() + "(inParams,outParams);");
				inMainFunction = false;
				iterateCode(findLabelOfThisFunction(quad.getEtiquette()));
				break;
			case POP:
				f.write(quad.getReponse() + " = outParams.Dequeue();");
				break;
			// WHILE FUNCTION
			case CONS:
				f.write(quad.getReponse() + " = (BinTree.cons(inParams));");
				break;
			case LIST:
				f.write(quad.getReponse() + " = (BinTree.list(inParams));");
				break;
			case HD:
				f.write(quad.getReponse() + " = BinTree.head(" + quad.getArg1() + ");");
				break;
			case TL:
				f.write(quad.getReponse() + " = BinTree.tail(" + quad.getArg1() + ");");
				break;
			default:
				f.write("// "+quad.getOperateur().getOpe().name()+" not implemented yet.");
				break;
			}
		}
	}

	private void writeFunction() throws CS_TranslatorException {
		for (Iterator<CS_Function> iterator = funcList.iterator(); iterator.hasNext();) {
			CS_Function cs_Function = (CS_Function) iterator.next();
			cs_Function.printFunction();
		}
	}

	private void write(String s) {
		tab(k);
		stb.append(s);
		newLine();
	}

	private void write2(String s) {
		stb.append(s);
	}

	private void newLine() {
		stb.append(newLine);
	}

	private void tab(int j) {
		for (int i = 0; i < j; i++) {
			tab();
		}
	}

	private void tab() {
		stb.append(tab);
	}

	private void leftShift() {
		k--;
	}

	private void rightShift() {
		k++;
	}

	@Override
	public String toString() {
		return stb.toString();
	}

	private class CS_Function {
		private String name;
		private String params;
		private String returns;
		private StringBuilder body;
		private int k = 3;

		public CS_Function(String name) {
			super();
			this.name = name;
			body = new StringBuilder();
			this.params = typeName + " input, " + typeName + " output";
			this.returns = "void";
			write(typeName + " inParams = new " + typeName + "();");
			write(typeName + " outParams = new " + typeName + "();");
			varDeclaration();
		}
		
		private void varDeclaration(){
			DefFun def = GeneratorAddr.getInstance().getFunList().get(name);
			if(def == null)
				return;
			write("//Here the var used in the while code");
			def.getVars().forEach((key, value) -> {
				write("BinTree " + key + " = new BinTree (\""+key+"\", null, null);");
			});
			write("");
			write("//Here the temp var used by the compiler");
			def.getTempVars().forEach((key) -> {
				write("BinTree " + key + " = new BinTree (\""+key+"\", null, null);");
			});
			write("");
		}

		private void write(String s) {
			tab(k);
			body.append(s);
			newLine();
		}

		private void tab(int j) {
			for (int i = 0; i < j; i++) {
				tab();
			}
		}

		private void tab() {
			body.append(tab);
		}

		private void newLine() {
			body.append(newLine);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getParams() {
			return params;
		}

		public void setParams(String params) {
			this.params = params;
		}

		public String getReturns() {
			return returns;
		}

		public void setReturns(String returns) {
			this.returns = returns;
		}

		public StringBuilder getBody() {
			return body;
		}

		public void setBody(StringBuilder body) {
			this.body = body;
		}

		private void leftShift() {
			k--;
		}

		private void rightShift() {
			k++;
		}

		public void printFunction() throws CS_TranslatorException {
			if (k != 3) {
				throw new CS_TranslatorException("Il manque un " + (k < 0 ? "à gauche" : "à droite"));
			}
			CS_Translator.this.newLine();
			CS_Translator.this.write("private static " + getReturns() + " " + getName() + "(" + getParams() + ")");
			CS_Translator.this.write(lAccolade);
			CS_Translator.this.write2(body.toString());
			CS_Translator.this.write(rAccolade);
		}

	}
}
