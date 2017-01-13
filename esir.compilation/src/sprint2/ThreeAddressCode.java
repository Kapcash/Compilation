package sprint2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Stack;

public class ThreeAddressCode {

	private HashMap<String, LinkedList<QuadImp>> code3Addr = new HashMap<String, LinkedList<QuadImp>>();
	private ExprTree tree = null;
	private int treeLevel = 0;
	private static final boolean DISPLAY_EXPR_TREE = true;

	private Stack<LinkedList<QuadImp>> stack = new Stack<LinkedList<QuadImp>>();

	private String getEtiquetteName(int i) {
		return "L" + i;
	}

	public int getSize(){
		return code3Addr.size();
	}

	//TOUT SUR LES ETIQUETTES

	public String getEtiquette() {
		return getEtiquetteName(code3Addr.size());
	}

	public String getFutureEtiquette() {
		return getEtiquetteName(code3Addr.size() + 1);
	}

	public String getPreviousEtiquette() {
		return getEtiquetteName(code3Addr.size() - 1);
	}

	public void nouvelleEtiquette() {
		stack.push(new LinkedList<QuadImp>());
	}

	public void finEtiquette() {
		code3Addr.put(getEtiquette(), stack.pop());
	}

	//TOUT SUR LE CODE 3@

	public void addIn3Addr(QuadImp q) {
		stack.lastElement().addLast(q);
	}

	public void addIn3Addr(OP op, String label, String writeAddr, String readAddr1, String readAddr2){
		addIn3Addr(new QuadImp(new OPCode<OP, String>(op, label), writeAddr, readAddr1, readAddr2));
	}

	//GENERAL

	public void fun(String writeAddr){
		addIn3Addr(OP.FUN, "", writeAddr, "","");
	}

	public void read(String writeAddr){
		addIn3Addr(OP.READ, "", writeAddr, "","");
	}

	public void write(String writeAddr){
		addIn3Addr(OP.WRITE, "", writeAddr, "","");
	}

	public void decl(String writeAddr){
		addIn3Addr(OP.DECL, "", writeAddr, "","");
	}

	public void aff(String writeAddr, String readAddr){
		addIn3Addr(OP.AFF, "", writeAddr, readAddr,"");
	}

	//NATIVE FUNCTION

	public void hd(String writeAddr, String readAddr){
		addIn3Addr(OP.HD, "", writeAddr, readAddr,"");
	}

	public void tl(String writeAddr, String readAddr){
		addIn3Addr(OP.TL, "", writeAddr, readAddr,"");
	}

	public void cons(String writeAddr){
		addIn3Addr(OP.CONS, "", writeAddr, "","");
	}

	public void list(String writeAddr){
		addIn3Addr(OP.LIST, "", writeAddr, "","");
	}

	//LOGIC

	public void not(String writeAddr, String readAddr){
		addIn3Addr(OP.NOT, "", writeAddr, readAddr,"");
	}

	public void and(String writeAddr, String readAddr1, String readAddr2){
		addIn3Addr(OP.AND, "", writeAddr, readAddr1, readAddr2);
	}

	public void or(String writeAddr, String readAddr1, String readAddr2){
		addIn3Addr(OP.OR, "", writeAddr, readAddr1, readAddr2);
	}

	public void eq(String writeAddr, String readAddr1, String readAddr2){
		addIn3Addr(OP.EQ, "", writeAddr, readAddr1, readAddr2);
	}

	//FUNCTION

	public void call(String label){
		addIn3Addr(OP.CALL, label, "","","");
	}

	public void push(String readAddr) {
		if (!readAddr.equals("root")){
			addIn3Addr(OP.PUSH, "", "",readAddr,"");
		}
	}

	public void pop(String writeAddr) {
		addIn3Addr(OP.POP, "", writeAddr,"","");
	}

	public void nop() {
		addIn3Addr(OP.NOP, "", "","","");
	}

	//LOOPS
	public void whileLoop(String condition, String body){
		addIn3Addr(OP.WHILE, condition, "", body, "");
	}

	public void forLoop(String condition, String body){
		addIn3Addr(OP.FOR, condition, "", body, "");
	}

	public void forEachLoop(String condition, String body){
		addIn3Addr(OP.FOREACH, condition, "", body, "");
	}

	//CONDITION
	public void ifCond(String condition, String body){
		ifElseCond(condition,body,"");
	}

	public void ifElseCond(String condition, String bodyIf, String bodyElse){
		addIn3Addr(OP.IF, condition, "", bodyIf, bodyElse);
	}


	public HashMap<String, LinkedList<QuadImp>> getCode3Addr() {
		return code3Addr;
	}

	public void setCode3Addr(HashMap<String, LinkedList<QuadImp>> code3Addr) {
		this.code3Addr = code3Addr;
	}

	public void addLevel() {
		treeLevel++;
	}

	public void subLevel() {
		tree.incIndex(treeLevel);
		treeLevel--;
	}

	public void addToExpression(String s, HashMap<String, DefFun> funList)throws ThreeAddressCodeException {
		if (tree == null) {
			tree = new ExprTree("root", funList, 1);
			treeLevel++;
			tree.add(s, funList, treeLevel);
			//tree = new ExprTree(s, funList, 1);
		} else {
			tree.add(s, funList, treeLevel);
		}
		if(DISPLAY_EXPR_TREE){
			System.out.println(tree);
		}
	}

	public List<String> inlineExpression(GeneratorAddr generatorAddr, DefFun f) throws ThreeAddressCodeException {

		boolean ended = false;
		int maxLoop = 100; //StackOverflow
		int loopCounter = 0;

		while(!ended && maxLoop>loopCounter){
			ExprTree.iterate(tree, this, generatorAddr, f);

//			System.out.println("TREE:"+tree);
			if(tree.children!=null && tree.children.length==0){ //Si pas de petit-fils (variable seule)
				break;
			}

			for (int i = 0; i < tree.children.length; i++) {
				ExprTree array_element = tree.children[i];		
				if(array_element.children.length!=0){		//root's children
					ended = false;
					break;
				}
				ended = true;
			}
			loopCounter++;
		}
		if(loopCounter==maxLoop){
			throw new ThreeAddressCodeException("Expression simplication problem");
		}

		ArrayList<String> vars = new ArrayList<String>();
		if(tree.children.length==0){
			vars.add(tree.getHead());
		} else {
			for (int i = 0; i < tree.children.length; i++) {
				vars.add(tree.children[i].getHead());		
			}
		}

		ExprTree.nb = 0;
		tree = null;

		return vars;
	}

	//TOSTRING
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Iterator<Entry<String, LinkedList<QuadImp>>> iter = code3Addr.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, LinkedList<QuadImp>> entry = iter.next();

			sb.append(entry.getKey() + ":\t");
			Iterator<QuadImp> iter2 = entry.getValue().iterator();
			if (iter2.hasNext()) {
				sb.append(iter2.next() + "\n");
			}
			while (iter2.hasNext()) {
				sb.append("\t" + iter2.next().toString() + "\n");
			}

			if (iter.hasNext()) {
				sb.append('\n');
			}
		}
		return sb.toString();
	}
	
// -------------------------------------------- //
// ---------- PRIVATE CLASS EXPRTREE ---------- //
// -------------------------------------------- //
	
	private static class ExprTree {
		private String head;
		private ExprTree[] children;
		private boolean full;
		static int nb = 0;
		private int index = 0;
		private int level = 1;
		private ExprTree parent;

		public ExprTree(String head, HashMap<String, DefFun> funList, int level) {
			super();
			setHead(head);
			this.level = level;
			if (isListOperation(head)) {
				children = new ExprTree[4];// max 4 elements dans un cons ou list
			} else if (isUnaryOperation(head))
				children = new ExprTree[1];
			else if (isBinaryOperation(head))
				children = new ExprTree[2];
			else if (isRoot(head))
				children = new ExprTree[1];
			else if (funList.containsKey(head)) {
				children = new ExprTree[funList.get(head).getIn()];
			} else {
				children = new ExprTree[0];
				full = true;
			}
		}

		public ExprTree(String head, HashMap<String, DefFun> funList, int level, ExprTree parent) {
			this(head,funList,level);
			this.parent= parent;
		}

		

		public void incIndex(int treeLevel) {
			if (this.children.length >= this.index)
				return;
			if (this.children[index] != null)
				if (this.children[index].level == treeLevel) {
					if (isListOperation(this.getHead()))
						this.children[index].full = true;
					this.index++;
				} else {
					this.children[index].incIndex(treeLevel);
				}

		}
		
		public void updateFull(){
			for (int i = 0; i < children.length; i++) {
				if(children[i] == null ){
					return;
				}
				if(!children[i].full ){
					return;
				}
			}
			this.full = true;
			if(parent != null)
				parent.updateFull();
		}

		public void add(String s, HashMap<String, DefFun> funList, int level) throws ThreeAddressCodeException {
			try{
				if (level == this.level && !full) {
					children[index] = new ExprTree(s, funList, level,this);
					if(index == children.length-1){
						full = true;
					}
					index++;
					updateFull();
				} else {
					if (children[index] == null) {
						children[index] = new ExprTree(s, funList, level,this);
						if(index == children.length-1 && children[index].full){
							full = true;
						}
						if (children[index].full){
							index++;
							updateFull();
						}
							
					} else {
						if(children[index].full){
							index++;
							children[index] = new ExprTree(s, funList, level);
							if(index == children.length-1 && children[index].full){
								full = true;
							}
							if (children[index].full){
								index++;
								updateFull();
							}
						}else{
							children[index].add(s, funList, level);
						}
					}
				}
			}catch (Exception e) {
				e.printStackTrace();
				throw new ThreeAddressCodeException("Impossible to add : " + s);
			}
		}

		public static void iterate(ExprTree tree, ThreeAddressCode threeAddressCode, GeneratorAddr generatorAddr,
				DefFun f) {
			if (tree.simplify(generatorAddr.getFunList())) {

				String varName = "Y" + nb++;
				generatorAddr.varDeclaration3Addr(f, varName);
				boolean isFunctionHas1Return = true;

				if (OP.HD.name().equals(tree.getHead()))
					threeAddressCode.hd(varName, tree.children[0].getHead());
				else if (OP.TL.name().equals(tree.getHead()))
					threeAddressCode.tl(varName, tree.children[0].getHead());
				else if (OP.NOT.name().equals(tree.getHead()))
					threeAddressCode.not(varName, tree.children[0].getHead());
				else if (OP.AND.name().equals(tree.getHead())) {
					threeAddressCode.and(varName, tree.children[0].getHead(), tree.children[1].getHead());
				} else if (OP.OR.name().equals(tree.getHead())) {
					threeAddressCode.or(varName,tree.children[0].getHead(), tree.children[1].getHead());
				} else if (OP.EQ.name().equals(tree.getHead())) {
					threeAddressCode.eq(varName,tree.children[0].getHead(), tree.children[1].getHead());
				} else {


					for (int i = 0; i < tree.children.length; i++) {
						if (tree.children[i] == null)
							break;
						threeAddressCode.push(tree.children[i].getHead());
					}

					if (OP.CONS.name().equals(tree.getHead())) {
						threeAddressCode.cons(varName);
					}

					else if (OP.LIST.name().equals(tree.getHead())) {
						threeAddressCode.list(varName);
					} else if (generatorAddr.getFunList().containsKey(tree.getHead())) {
						threeAddressCode.call(tree.getHead());
						int out = generatorAddr.getFunList().get(tree.getHead()).getOut();
						String[] vars = new String[out];
						for (int i = 0; i < out; i++) {
							generatorAddr.varDeclaration3Addr(f, varName);
							threeAddressCode.pop(varName);
							vars[i] = varName;
							if (i < out - 1)
								varName = "Y" + nb++;
						}
						if(out!=1){
							isFunctionHas1Return = false;
							tree.clear(vars,generatorAddr.getFunList());
						}

					} else {
						threeAddressCode.push(tree.getHead());
					}

				}
				if(isFunctionHas1Return)
					tree.clear(varName);

			} else {
				for (int i = 0; i < tree.children.length; i++) {
					if (tree.children[i] != null)
						if (tree.isOperation(tree.children[i].getHead(),generatorAddr.getFunList()))
							iterate(tree.children[i], threeAddressCode, generatorAddr, f);
				}
			}

		}

		public boolean simplify(HashMap<String, DefFun> funList) {
			if(head.equals("root")){ //If trop simple
				if(children[0].full){
					return false;
				}
			}
			for (int i = 0; i < children.length; i++) {
				if (children[i] == null)
					continue;
				if (isOperation(children[i].getHead(),funList))
					return false;
			}
			return true;
		}

		private boolean isOperation(String head, HashMap<String, DefFun> funList) {
			return (funList.get(head)!=null)|| isOperation(head);
		}

		public void clear(String newVar) {
			setHead(newVar);
			children = new ExprTree[0];
		}

		public void clear(String[] newVar, HashMap<String, DefFun> funList) {
			//System.out.println(this.parent);
			int i;
			for (i = 0; i < parent.children.length; i++) {
				if(parent.children[i].equals(this))
					break;
			}
			parent.children = specialConcat(parent.children,newVar,i,funList);
			//System.out.println(this.parent);
		}

		public static ExprTree[] specialConcat(ExprTree[] a, String[] b, int index, HashMap<String, DefFun> funList) {
			int aLen = a.length;
			int bLen = b.length;

			ExprTree[] c = new ExprTree[aLen+bLen-1];
			int indexA = 0;
			for (int i = 0; i < c.length; i++) {
				if(i!=index){
					c[i]=a[indexA];
					indexA++;
				}else if(i==index){
					for (int j = 0; j < b.length; j++) {
						ExprTree t = new ExprTree(b[j], funList, a[0].level);
						c[i]= t;
						if(j <b.length-1)
							i++;
					}
					indexA++;
				}
			}
			return c;
		}

		public String getHead() {
			return head;
		}

		public void setHead(String head) {
			this.head = head;
		}

		private boolean isOperation(String s) {
			return isListOperation(s) || isUnaryOperation(s) || isBinaryOperation(s) || isRoot(s);
		}

		private boolean isListOperation(String s) {
			if (OP.CONS.name().equals(s))
				return true;
			if (OP.LIST.name().equals(s))
				return true;
			return false;
		}

		private boolean isUnaryOperation(String s) {
			if (OP.TL.name().equals(s))
				return true;
			if (OP.HD.name().equals(s))
				return true;
			if (OP.NOT.name().equals(s))
				return true;
			return false;
		}

		public boolean isBinaryOperation(String s) {
			if (OP.AND.name().equals(s) || OP.OR.name().equals(s) || OP.EQ.name().equals(s)) {
				return true;
			} else {
				return false;
			}
		}

		private boolean isRoot(String head) {
			if(head.equals("root"))
				return true;
			return false;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("ExprTree [head=");
			builder.append(head);
			if (children.length > 0) {
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
