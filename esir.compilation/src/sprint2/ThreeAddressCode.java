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
	
	public void addToExpression(String s){
		if(tree==null){
			tree = new ExprTree(s);
		}else{
			tree.add(s);
		}
	}
	
	public void inlineExpression() throws ThreeAddressCodeException{
		if(!tree.full)
			throw new ThreeAddressCodeException("Probleme dans l'expression");
		int k =0;
		
		while(tree.children.length!=0){
			tree.iterate(k);
			k++;
		}
		tree = null;
	}
	
	private class ExprTree{
		private String head;
		private ExprTree[] children;
		private boolean full;
		private int nb = 0;
		
		public ExprTree(String head) {
			super();
			setHead(head);
			//TODO prendre en comptre les func
			if(isBinaryOperation(head))
				children = new ExprTree[2];
			else if(isUnaryOperation(head))
				children = new ExprTree[1];
			else{
				children = new ExprTree[0];
				full=true;
			}
				
		}
		
		public void add(String s) {
			for (int i = 0; i < children.length; i++) {
				
				if(children[i]==null){
					children[i] = new ExprTree(s);
					full = areChildrenFull();
					return;
				}else{
					if(!children[i].full){
						children[i].add(s);
						full = areChildrenFull();
						return;
					}	
				}
			}		
		}
		
		public boolean iterate(int k){
			if(children.length==0){
//				System.out.println(getHead());
			}else{
				if(simplify()){
					QuadImp q = null;
					q = new QuadImp(new OPCode<OP, String>(OP.HD, ""), "", "", "");
					
					System.out.println(head);
					for (int i = 0; i < children.length; i++) {
						if(i==0)
							q.setArg1(children[i].getHead());
						if(i==1)
							q.setArg2(children[i].getHead());
					}
					String varName = "Y"+k;//TODO  name beuged
					q.setReponse(varName);
					addIn3Addr(q);
					clear(varName);
					nb++;
					return true;
				}else{
					for (int i = 0; i < children.length; i++) {
						children[i].iterate(k);
					}	
				}			
			}
			return false;
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
