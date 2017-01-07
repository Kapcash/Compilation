package sprint2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Stack;

public class ThreeAddressCode {

	private HashMap<String, LinkedList<QuadImp>> code3Addr = new HashMap<String, LinkedList<QuadImp>>();
	private ExprTree tree = null;
	private int treeLevel = 0;

	@SuppressWarnings("rawtypes")
	private Stack<LinkedList> stack = new Stack<LinkedList>();

	private String getEtiquetteName(int i) {
		return "L" + i;
	}
	
	int getSize(){
		return code3Addr.size();
	}
	
	//TOUT SUR LES ETIQUETTES

	String getEtiquette() {
		return getEtiquetteName(code3Addr.size());
	}

	String getFutureEtiquette() {
		return getEtiquetteName(code3Addr.size() + 1);
	}

	String getPreviousEtiquette() {
		return getEtiquetteName(code3Addr.size() - 1);
	}
	

	void nouvelleEtiquette() {
		stack.push(new LinkedList<QuadImp>());
	}

	@SuppressWarnings("unchecked")
	void finEtiquette() {
		code3Addr.put(getEtiquette(), stack.pop());
	}
	
	//TOUT SUR LE CODE 3@

	@SuppressWarnings("unchecked")
	void addIn3Addr(QuadImp q) {
		stack.lastElement().addLast(q);
	}
	
	void addIn3Addr(OP op, String label, String writeAddr, String readAddr1, String readAddr2){
		addIn3Addr(new QuadImp(new OPCode<OP, String>(op, label), writeAddr, readAddr1, readAddr2));
	}
	
	void aff(String writeAddr, String readAddr){
		addIn3Addr(OP.AFF, "", writeAddr, readAddr,"");
	}
	
	void hd(String writeAddr, String readAddr){
		addIn3Addr(OP.HD, "", writeAddr, readAddr,"");
	}
	
	void tl(String writeAddr, String readAddr){
		addIn3Addr(OP.TL, "", writeAddr, readAddr,"");
	}
	
	void cons(String writeAddr){
		addIn3Addr(OP.CONS, "", writeAddr, "","");
	}
	
	void list(String writeAddr){
		addIn3Addr(OP.LIST, "", writeAddr, "","");
	}
	
	void not(String writeAddr, String readAddr){
		addIn3Addr(OP.NOT, "", writeAddr, readAddr,"");
	}
	
	void and(String writeAddr, String readAddr1, String readAddr2){
		addIn3Addr(OP.AND, "", writeAddr, readAddr1, readAddr2);
	}
	
	void or(String writeAddr, String readAddr1, String readAddr2){
		addIn3Addr(OP.OR, "", writeAddr, readAddr1, readAddr2);
	}
	
	void eq(String writeAddr, String readAddr1, String readAddr2){
		addIn3Addr(OP.EQ, "", writeAddr, readAddr1, readAddr2);
	}
	
	void call(String label){
		addIn3Addr(OP.CALL, label, "","","");
	}
	
	void push(String readAddr) {
		addIn3Addr(OP.PUSH, "", "",readAddr,"");
	}
	
	void pop(String writeAddr) {
		addIn3Addr(OP.POP, "", writeAddr,"","");
	}
	
	void nop() {
		addIn3Addr(OP.NOP, "", "","","");
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

	public void addToExpression(String s, HashMap<String, DefFun> funList) {
		if (tree == null) {
//			tree = new ExprTree("root", funList, 1);
//			treeLevel++;
//			tree.add(s, funList, treeLevel);
			tree = new ExprTree(s, funList, 1);
		} else {
			tree.add(s, funList, treeLevel);
		}
		
		//System.out.println(tree);
	}

	public int inlineExpression(GeneratorAddr generatorAddr, DefFun f) throws ThreeAddressCodeException {

		int k = 0;
		if (tree.children.length == 0) { // Simplification interdite
			generatorAddr.code3Addresses.aff("Y0", tree.getHead());
		} else {
			while (tree.children.length != 0) {
				ExprTree.iterate(tree, this, generatorAddr, f);
			}

			k = ExprTree.nb;
			k--;
		}

		ExprTree.nb = 0;
		tree = null;
		return k;
	}

	// PRIVATE CLASS EXPRTREE

	private static class ExprTree {
		private String head;
		private ExprTree[] children;
		private boolean full;
		static int nb = 0;
		private int index = 0;
		private int level = 1;

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

		public void add(String s, HashMap<String, DefFun> funList, int level) {
			if (level == this.level) {
				children[index] = new ExprTree(s, funList, level);
				index++;
			} else {
				if (children[index] == null) {
					children[index] = new ExprTree(s, funList, level);
					if (children[index].full)
						index++;
				} else {
					children[index].add(s, funList, level);
				}

			}
		}

		public static void iterate(ExprTree tree, ThreeAddressCode threeAddressCode, GeneratorAddr generatorAddr,
				DefFun f) {
			if (tree.simplify()) {

				String varName = "Y" + nb++;
				generatorAddr.varDeclaration3Addr(f, varName);

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
					} else if (generatorAddr.funList.containsKey(tree.getHead())) {
						threeAddressCode.call(tree.getHead());
						int out = generatorAddr.funList.get(tree.getHead()).out;
						for (int i = 0; i < out; i++) {
							generatorAddr.varDeclaration3Addr(f, varName);
							threeAddressCode.pop(varName);
							System.out.println("faire remonter "+varName);
							if (i < out - 1)
								varName = "Y" + nb++;
						}
					} else {
						threeAddressCode.push(tree.getHead());
					}

				}

				tree.clear(varName);

			} else {
				for (int i = 0; i < tree.children.length; i++) {
					if (tree.children[i] != null)
						if (tree.isOperation(tree.children[i].getHead()))
							iterate(tree.children[i], threeAddressCode, generatorAddr, f);
				}
			}

		}

		public boolean simplify() {
			for (int i = 0; i < children.length; i++) {
				if (children[i] == null)
					continue;
				if (isOperation(children[i].getHead()))
					return false;
			}
			return true;
		}

		public void clear(String newVar) {
			setHead(newVar);
			children = new ExprTree[0];
		}

		public String getHead() {
			return head;
		}

		public void setHead(String head) {
			this.head = head;
		}

		private boolean isOperation(String s) {
			// TODO Ajouter funList pour les calls
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
			return head.equals("root");
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("BinTree [head=");
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
