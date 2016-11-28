package sprint2;

import java.util.HashMap;

public class DefFun{
	int in, out;
	HashMap<String,String> vars;
	
	public DefFun(){
		in = 0;
		out = 0;
		vars = new HashMap<String,String>();
	}
	
	public void addVar(String var,String val){
		
		vars.put(var,(val ==null)? "nil" : val);
	}
	
	@Override
	public String toString() {
		return "Input = "+in+", Output = "+out+"Vars : "+vars.toString();
	}
	
	/* GETTERS & SETTERS */
	
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