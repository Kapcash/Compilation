package sprint2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Map.Entry;

public class ThreeAddressCode {
	
	private HashMap<String, LinkedList<QuadImp>> code3Addr = new HashMap<String,LinkedList<QuadImp>>();

	@SuppressWarnings("rawtypes")
	private Stack<LinkedList> stack = new Stack<LinkedList>();
	
	
	private String getEtiquetteName(int i){
		return "L"+i;
	}
	
	private String getEtiquette(){
		return getEtiquetteName(code3Addr.size());
	}
	
	String getFutureEtiquette(){
		return getEtiquetteName(code3Addr.size()+1);
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
}
