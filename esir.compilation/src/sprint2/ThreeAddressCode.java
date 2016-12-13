package sprint2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

import org.eclipse.xtext.xbase.lib.IteratorExtensions;

import java.util.Map.Entry;

public class ThreeAddressCode {
	
	private HashMap<String, LinkedList<QuadImp>> code3Addr = new HashMap<String,LinkedList<QuadImp>>();
	private ExprTree tree = null;

	@SuppressWarnings("rawtypes")
	private Stack<LinkedList> stack = new Stack<LinkedList>();
	
	
	private String getEtiquetteName(int i){
		return "L"+i;
	}
	
	String getEtiquette(){
		return getEtiquetteName(code3Addr.size());
	}
	
	String getFutureEtiquette(){
		return getEtiquetteName(code3Addr.size()+1);
	}
	
	String getPreviousEtiquette(){
		return getEtiquetteName(code3Addr.size()-1);
	}

	@SuppressWarnings("unchecked")
	void addIn3Addr(QuadImp q) {
		stack.lastElement().addLast(q);
	}

	void nouvelleEtiquette() {
		stack.push(new LinkedList<QuadImp>());
	}

	@SuppressWarnings("unchecked")
	void finEtiquette() {
		code3Addr.put(getEtiquette(), stack.pop());
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Iterator<Entry<String,LinkedList<QuadImp>>> iter = code3Addr.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String,LinkedList<QuadImp>> entry = iter.next();
			
			sb.append(entry.getKey()+":\t");
			Iterator<QuadImp> iter2 = entry.getValue().iterator();
			if(iter2.hasNext()){
				sb.append(iter2.next()+"\n");
			}
			while (iter2.hasNext()) {
				sb.append("\t"+iter2.next().toString()+"\n");
			}
			
			if (iter.hasNext()) {
				sb.append('\n');
			}
		}
		return sb.toString();
	}
	
	public HashMap<String, LinkedList<QuadImp>> getCode3Addr() {
		return code3Addr;
	}

	public void setCode3Addr(HashMap<String, LinkedList<QuadImp>> code3Addr) {
		this.code3Addr = code3Addr;
	}
	
	public void addToExpression(String s,  HashMap<String, DefFun> funList){
		if(tree==null){
			tree = new ExprTree(s,funList);
		}else{
			tree.add(s,funList);
		}
		System.out.println(tree);
	}
	
	public int inlineExpression(GeneratorAddr generatorAddr, DefFun f) throws ThreeAddressCodeException{
		if(!tree.full)
			throw new ThreeAddressCodeException("Probleme dans l'expression");
		
		while(tree.children.length!=0){
			ExprTree.iterate(tree,this,generatorAddr,f);
		}
		int k =ExprTree.nb;
		ExprTree.nb=0;
		tree = null;
		return k;
	}
	
	private static class ExprTree{
		private String head;
		private ExprTree[] children;
		private boolean full;
		static int nb = 0;
		
		public ExprTree(String head, HashMap<String, DefFun> funList) {
			super();
			setHead(head);
			//TODO prendre en comptre les func
			if(isBinaryOperation(head))
				children = new ExprTree[2];
			else if(isUnaryOperation(head))
				children = new ExprTree[1];
			else if(funList.containsKey(head)){
				children = new ExprTree[funList.get(head).in];
				System.out.println(funList.get(head).in);
			}else{
				children = new ExprTree[0];
				full=true;
			}
				
		}
		
		public void add(String s, HashMap<String, DefFun> funList) {
			for (int i = 0; i < children.length; i++) {
				
				if(children[i]==null){
					children[i] = new ExprTree(s, funList);
					full = areChildrenFull();
					return;
				}else{
					if(!children[i].full){
						children[i].add(s,funList);
						full = areChildrenFull();
						return;
					}	
				}
			}		
		}
		
		public static void iterate(ExprTree tree, ThreeAddressCode threeAddressCode, GeneratorAddr generatorAddr, DefFun f){
			if(tree.children.length!=0){
				if(tree.simplify()){
					QuadImp q = null;
					
					if(OP.HD.name().equals(tree.getHead()))
						q = new QuadImp(new OPCode<OP, String>(OP.HD, ""), "", "", "");
					else if(OP.TL.name().equals(tree.getHead()))
						q = new QuadImp(new OPCode<OP, String>(OP.TL, ""), "", "", "");
					else if(OP.CONS.name().equals(tree.getHead()))
						q = new QuadImp(new OPCode<OP, String>(OP.CONS, ""), "", "", "");
					else
						q = new QuadImp(new OPCode<OP, String>(OP.CALL, ""), "", "", "");
					
					for (int i = 0; i < tree.children.length; i++) {
						if(i==0)
							q.setArg1(tree.children[i].getHead());
						if(i==1)
							q.setArg2(tree.children[i].getHead());
					}
					String varName = "Y"+nb++;
					generatorAddr.varDeclaration(f, varName);
					q.setReponse(varName);
					threeAddressCode.addIn3Addr(q);
					tree.clear(varName);
					
				}else{
					for (int i = 0; i < tree.children.length; i++) {
						iterate(tree.children[i],threeAddressCode,generatorAddr,f );
					}	
				}			
			}
		}
		
		public boolean simplify(){
			for (int i = 0; i < children.length; i++) {
				if(children[i].children.length!=0)
					return false;
			}
			return true;
		}
		
		public void clear(String newVar){
			setHead(newVar);
			children = new ExprTree[0];
		}

		public String getHead() {
			return head;
		}

		public void setHead(String head) {
			this.head = head;
		}
		
		private boolean isOperation(String s){
			//TODO
			return isBinaryOperation(s)&&isUnaryOperation(s);
		}
		
		private boolean isBinaryOperation(String s){
			//TODO
			if(OP.CONS.name().equals(s))
				return true;
			return false;
		}
		
		private boolean isUnaryOperation(String s){
			//TODO
			if(OP.TL.name().equals(s))
				return true;
			if(OP.HD.name().equals(s))
				return true;
			return false;
		}
		
		private boolean areChildrenFull(){
			boolean b = true;
			for (int i = 0; i < children.length; i++) {
				if(children[i]==null)
					return false;
				b = b && children[i].full;
			}
			return b;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("BinTree [head=");
			builder.append(head);
			if(children.length>0){
				builder.append(", children=");
				builder.append(Arrays.toString(children));	
			}
			builder.append(", full=");
			builder.append(full);
			builder.append("]");
			return builder.toString();
		}		
		
	}
}
