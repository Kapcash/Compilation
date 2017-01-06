package sprint3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import sprint2.QuadImp;
import sprint2.ThreeAddressCode;

public class CS_Translator {

	private ThreeAddressCode code;
	private StringBuilder stb = new StringBuilder();
	private int k = 0;
	private LinkedList<CS_Function> funcList = new LinkedList<CS_Function>();
	private LinkedList<String> reads = new LinkedList<String>();

	// C# GENERAL

	private final static String imports = "using System;\nusing System.Collections.Generic;\nusing static Tree.BinTree;\n";
	private final static String projectName = "namespace BinTreeProject";
	private final static String className = "class Program";
	private final static String mainFunctionName = "static void Main()";
	private final static String typeName = "Queue<Tree.BinTree>";

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
			throw new CS_TranslatorException("Erreur dans les �tiquettes");
		Iterator<QuadImp> it = list.iterator();
		QuadImp quad = it.next();
		CS_Function f = new CS_Function(quad.getReponse());
		funcList.add(f);
		iterateList(it, f);
	}

	public String findLabelOfThisFunction(String E) throws CS_TranslatorException {
		HashMap<String, LinkedList<QuadImp>> map = code.getCode3Addr();
		Iterator<Map.Entry<String, LinkedList<QuadImp>>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, LinkedList<QuadImp>> pair = it.next();
			if (pair.getValue().getFirst().getReponse().equals(E))
				return (String) pair.getKey();
		}
		throw new CS_TranslatorException("Erreur dans les �tiquettes");
	}

	private void codeMain() {
		rightShift();
		Iterator<String> ite = reads.iterator();
		ArrayList<String> readToBinTree = new ArrayList<String>();
		String nameFonction = null;
		String executerFonction = null;
		while (ite.hasNext()) {
			String it = ite.next();
			if (it.contains("function")) {
				if (readToBinTree.size() > 0) {

					write("Queue<Tree.BinTree> input = new Queue<Tree.BinTree>();");
					write("Queue<Tree.BinTree> output = new Queue<Tree.BinTree>();");
					Iterator<String> ite2 = readToBinTree.iterator();
					while (ite2.hasNext()) {
						String it2 = ite2.next();
						write("Tree.BinTree " + it2 + " = new Tree.BinTree(\"" + it2 + "\", null, null);");
						write("input.Enqueue(" + it2 + ");");
					}
					write(executerFonction);
				}
				nameFonction = it.split(" ")[1];
				executerFonction = nameFonction + "(input, output);";
			} else {
				readToBinTree.add(it);
			}
		}
		if (readToBinTree.size() > 0) {
			write("Queue<Tree.BinTree> input = new Queue<Tree.BinTree>();");
			write("Queue<Tree.BinTree> output = new Queue<Tree.BinTree>();");
			Iterator<String> ite2 = readToBinTree.iterator();
			while (ite2.hasNext()) {
				String it2 = ite2.next();
				write("Tree.BinTree " + it2 + " = new Tree.BinTree(\"" + it2 + "\", null, null);");
				write("input.Enqueue(" + it2 + ");");
			}
			write(executerFonction);
		}
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
				f.write("Tree.BinTree " + quad.getReponse() + " = input.Dequeue();");
				reads.add(quad.getReponse());
				break;
			case WRITE:
				f.write("output.Enqueue(" + quad.getReponse() + ");");
				break;
			case NOP:
				f.write("((Action)(() => { }))();");
				break;

			// LOOPS
			case IF:
				iterateList(code.getCode3Addr().get(quad.getEtiquette()).iterator(), f);
				f.write("if(Tree.isTrue(" + code.getCode3Addr().get(quad.getEtiquette()).getLast().getReponse()
						+ "))");
				f.write(lAccolade);
				f.rightShift();
				iterateList(code.getCode3Addr().get(quad.getArg1()).iterator(), f);
				f.leftShift();
				if (code.getCode3Addr().get(quad.getArg2())!= null) {
					f.write(rAccolade + "else" + lAccolade);
					f.rightShift();
					iterateList(code.getCode3Addr().get(quad.getArg2()).iterator(), f);
					f.leftShift();
				}
				f.write(rAccolade);
				break;
			case WHILE:
				iterateList(code.getCode3Addr().get(quad.getEtiquette()).iterator(), f);
				f.write("while(Tree.isTrue(" + code.getCode3Addr().get(quad.getEtiquette()).getLast().getReponse()
						+ "))");
				f.write(lAccolade);
				f.rightShift();
				iterateList(code.getCode3Addr().get(quad.getArg1()).iterator(), f);
				iterateList(code.getCode3Addr().get(quad.getEtiquette()).iterator(), f);
				f.leftShift();
				f.write(rAccolade);
				break;
			case FOR:
				f.write("for(" + "expr" + ")");
				f.write(lAccolade);
				f.rightShift();
				iterateList(code.getCode3Addr().get(quad.getEtiquette()).iterator(), f);
				f.leftShift();
				f.write(rAccolade);
				break;
			case DECL:
				f.write("Tree.BinTree " + quad.getReponse() + " = new Tree.BinTree (\""+quad.getReponse()+"\", null, null);");
				break;
			case AFF:
				f.write(quad.getReponse() + " = " + quad.getArg1() + ";");
				break;
			case AND:
				f.write(quad.getReponse() + " = evaluate(\"AND\"," + quad.getArg1() + "," + quad.getArg2() + ");");
				break;
			case OR:
				f.write(quad.getReponse() + " = evaluate(\"OR\"," + quad.getArg1() + "," + quad.getArg2() + ");");
				break;
			case EQ:
				f.write(quad.getReponse() + " = evaluate(\"EQ\"," + quad.getArg1() + "," + quad.getArg2() + ");");
				break;
			// FUNCTION USE
			case PUSH:
				f.write("inParams.Enqueue(" + quad.getArg1() + ");");
				break;
			case CALL:
				f.write(quad.getEtiquette() + "(inParams,outParams);");
				iterateCode(findLabelOfThisFunction(quad.getEtiquette()));
				break;
			case POP:
				f.write(quad.getArg1() + " = outParams.Dequeue();");
				break;
			// WHILE FUNCTION
			case CONS:
				f.write("outParams.Enqueue(Tree.cons(inParams));");
				break;
			case LIST:
				f.write("outParams.Enqueue(Tree.list(inParams));");
				break;
			case HD:
				f.write(quad.getReponse() + " = Tree.head(" + quad.getArg1() + ");");
				break;
			case TL:
				f.write(quad.getReponse() + " = Tree.tail(" + quad.getArg1() + ");");
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
			reads.add("function " + name);
			body = new StringBuilder();
			this.params = typeName + " input, " + typeName + " output";
			this.returns = "void";
			write(typeName + " inParams = new " + typeName + "();");
			write(typeName + " outParams = new " + typeName + "();");
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
				throw new CS_TranslatorException("Il manque un " + (k < 0 ? "� gauche" : "� droite"));
			}
			CS_Translator.this.newLine();
			CS_Translator.this.write("private " + getReturns() + " " + getName() + "(" + getParams() + ")");
			CS_Translator.this.write(lAccolade);
			CS_Translator.this.write2(body.toString());
			CS_Translator.this.write(rAccolade);
		}

	}
}
