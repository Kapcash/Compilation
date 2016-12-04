package sprint2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class DefFun{
	int in, out;
	String funName;
	HashMap<String,String> vars;
	List<String> symbs;
	boolean isParamVar;
	
	public DefFun(String functionName){
		funName = functionName;
		in = 0;
		out = 0;
		vars = new HashMap<String,String>();
		symbs = new LinkedList<String>();
	}
	
	public void updateVar(String var,String val){
		vars.put(var,(val == null)? "nil" : val);
	}
	
	public void updateSyms(String symb){
		symbs.add(symb);
	}
	
	public boolean alreadyExisting(String var){
		return vars.keySet().contains(var);
	}
	
	@Override
	public String toString(){
		return "Input: "+in+", Output: "+out+"\nVariables: "+vars.toString()+"\nSymbols: "+symbs.toString();
	}
	
	/* GETTERS & SETTERS */
	
	public String getFunName() {
		return funName;
	}

	public void setFunName(String funName) {
		this.funName = funName;
	}

	public int getIn() {
		return in;
	}

	public void setIn(int in) {
		this.in = in;
	}

	public int getOut() {
		return out;
	}

	public void setOut(int out) {
		this.out = out;
	}

	public HashMap<String,String> getVars() {
		return vars;
	}
	
	public List<String> getSymbs() {
		return symbs;
	}

}
