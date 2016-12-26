package sprint3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import sprint2.QuadImp;
import sprint2.ThreeAddressCode;

public class CS_Translator {

	private ThreeAddressCode code;
	private StringBuilder stb = new StringBuilder();
	private int k = 0;
	private LinkedList<CS_Function> funcList = new LinkedList<CS_Function>();

	// C# GENERAL
	private final static String imports = "using System;\nusing System.Collections.Generic;";
	private final static String projectName = "namespace ProjectCOMP";
	private final static String className = "class Program";
	private final static String mainFunctionName = "static void Main(String[] args)";
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
		write(lAccolade);				//Project BEGIN

		rightShift();
		write(className);		
		write(lAccolade);				//Class BEGIN

		rightShift();
		write(mainFunctionName);
		write(lAccolade);

		iterateCode();

		write(rAccolade);
		
		writeFunction();
		
		leftShift();
		write(rAccolade);				//Class END
		leftShift();

		write(rAccolade);				//Project END
		
	}
	
	public void iterateCode() throws CS_TranslatorException{
		HashMap<String, LinkedList<QuadImp>> map = code.getCode3Addr();
		LinkedList<QuadImp> list = map.get("L"+(map.size()-1));
		if(list==null)
			throw new CS_TranslatorException("Erreur dans les étiquettes");
		Iterator<QuadImp> it = list.iterator();
		QuadImp quad = it.next();
		funcList.add(new CS_Function(quad.getReponse()));
		iterateList(it);
	}

	private void iterateList(Iterator<QuadImp> it) {
		while(it.hasNext()){
			QuadImp quad = it.next();
			CS_Function f = funcList.getLast();
			switch (quad.getOperateur().getOpe()) {
			case FUN:
				funcList.add(new CS_Function(quad.getReponse()));
				break;
			case READ:
				//TODO Choix de la queue expliquée => https://www.tutorialspoint.com/csharp/csharp_queue.htm
				f.write("BinTree "+quad.getReponse()+" = input.Dequeue();");
//				int i=0;
//				while(i<Integer.parseInt(quad.getArg1())){
//					f.write("BinTree r"+i+" = input["+i+"];");
//					i++;
//				}
				break;
			case WRITE:
				f.write("output.Enqueue("+quad.getReponse()+");");
				break;
			case NOP:
				f.write("((Action)(() => { }))();");
				break;
				
			// LOOPS
			case IF:
				f.write("if("+"true"+")");
				f.write(lAccolade);
				f.rightShift();
				iterateList(code.getCode3Addr().get(quad.getEtiquette()).iterator());
				f.leftShift();
				f.write(rAccolade);
				break;
			case WHILE:
				f.write("while("+"true"+")");
				f.write(lAccolade);
				f.rightShift();
				iterateList(code.getCode3Addr().get(quad.getEtiquette()).iterator());
				f.leftShift();
				f.write(rAccolade);
				break;
			case FOR:
				f.write("for("+"expr"+")");
				f.write(lAccolade);
				f.rightShift();
				iterateList(code.getCode3Addr().get(quad.getEtiquette()).iterator());
				f.leftShift();
				f.write(rAccolade);
				break;
			case DECL:
				f.write("BinTree "+quad.getReponse()+";");
				break;
			case AFF:
				f.write(quad.getReponse()+" = "+quad.getArg1()+";");
				break;
			//FUNCTION USE
			case PUSH:
				f.write("inParams.Enqueue("+quad.getArg1()+");");
				break;
			case POP:
				f.write(quad.getArg1()+" = outParams.Dequeue();");
				break;	
			//WHILE FUNCTION
			case CONS:
				f.write("cons(inParams,outParams);");
				break;
			case LIST:
				f.write("list(inParams,outParams);");
				break;
			case HD:
				f.write(quad.getReponse()+" = hd("+quad.getArg1()+");");
				break;
			case TL:
				f.write(quad.getReponse()+" = tl("+quad.getArg1()+");");
				break;
			default:
				
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
		for(int i =0;i<j;i++){
			tab();
		}
	}
	
	private void tab() {
		stb.append(tab);
	}
	
	private void leftShift(){
		k--;
	}
	
	private void rightShift(){
		k++;
	}

	@Override
	public String toString() {
		return stb.toString();
	}
	
	private class CS_Function{
		private String name;
		private String params;
		private String returns;
		private StringBuilder body;
		private int k = 3;
		
		public CS_Function(String name) {
			super();
			this.name = name;
			body = new StringBuilder();
			this.params = typeName+" input, "+typeName+" output";
			this.returns  = "void";
			write(typeName+" inParams = new "+typeName+"();");
			write(typeName+" outParams = new "+typeName+"();");
		}
		
		private void write(String s) {
			tab(k);
			body.append(s);	
			newLine();
		}
		
		private void tab(int j) {
			for(int i =0;i<j;i++){
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
		
		private void leftShift(){
			k--;
		}
		
		private void rightShift(){
			k++;
		}
		
		public void printFunction() throws CS_TranslatorException{
			if(k!=3){
				throw new CS_TranslatorException("Il manque un "+(k<0?"à gauche":"à droite"));
			}
			CS_Translator.this.newLine();
			CS_Translator.this.write("private "+getReturns()+" "+getName()+"("+getParams()+")");
			CS_Translator.this.write(lAccolade);
			CS_Translator.this.write2(body.toString());
			CS_Translator.this.write(rAccolade);
		}
			
		
	}
}
