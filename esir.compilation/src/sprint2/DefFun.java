package sprint2;

import java.util.HashMap;

public class DefFun{
	int in, out;
	String funName;
	HashMap<String,String> vars;
	
	public DefFun(String functionName){
		funName = functionName;
		in = 0;
		out = 0;
		vars = new HashMap<String,String>();
	}
	
	public void updateVar(String var,String val){
		vars.put(var,(val == null)? "nil" : val);
	}
	
	public boolean alreadyExisting(String var){
		return vars.keySet().contains(var);
	}
	
	@Override
	public String toString() {
		return "Input:"+in+", Output:"+out+"\n"+vars.toString();
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

	public void setVars(HashMap<String,String> vars) {
		this.vars = vars;
	}
	
}
