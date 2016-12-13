package sprint2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import esir.compilation.whileComp.Lexpr;

public class DefFun{
	int in, out;
	String funName;
	HashMap<String,String> vars;
	HashMap<String,Lexpr> calls;
	boolean isParamVar;

	public DefFun(String functionName){
		funName = functionName;
		in = 0;
		out = 0;
		vars = new HashMap<String,String>();
		calls = new HashMap<String,Lexpr>();
	}

	public void updateVar(String var,String val){
		vars.put(var,(val == null)? "nil" : val);
	}

	public void updateCalls(String symb, Lexpr exprs){
		calls.put(symb,exprs);
	}

	public boolean alreadyExisting(String var){
		return vars.keySet().contains(var);
	}

	@Override
	public String toString(){
		return "Input: "+in+", Output: "+out+"\nVariables: "+vars.toString()+"\nSymbols: "+calls.keySet().toString();
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

	public HashMap<String,Lexpr> getSymbs() {
		return calls;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((funName == null) ? 0 : funName.hashCode());
		result = prime * result + in;
		result = prime * result + (isParamVar ? 1231 : 1237);
		result = prime * result + out;
		result = prime * result + ((calls == null) ? 0 : calls.hashCode());
		result = prime * result + ((vars == null) ? 0 : vars.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		DefFun other = (DefFun) obj;
		
		if (funName == null) {
			if (other.funName != null)
				return false;
		} else if (!funName.equals(other.funName))
			return false;
		
		if (in != other.in
				|| isParamVar != other.isParamVar
				|| out != other.out)
			return false;
		
		if (calls == null) {
			if (other.calls != null)
				return false;
		} else if (!calls.equals(other.calls))
			return false;
		
		if (vars == null) {
			if (other.vars != null)
				return false;
		} else if (!vars.equals(other.vars))
			return false;
		return true;
	}

}
