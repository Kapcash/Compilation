package sprint2;

import java.util.HashMap;
import java.util.HashSet;

import esir.compilation.whileComp.Lexpr;

public class DefFun{
	private int in, out;
	String funName;
	HashMap<String, VarCounter> vars;
	HashMap<String,Lexpr> calls;
	HashSet<String> tempVars;

	public DefFun(String functionName){
		funName = functionName;
		in = 0;
		out = 0;
		vars = new HashMap<String,VarCounter>();
		calls = new HashMap<String,Lexpr>();
		tempVars = new HashSet<String>();
	}
	
	public void updateReadVar(String var){
		if(alreadyExisting(var)){
			vars.put(var,vars.get(var).incrRC());
		} else {
			vars.put(var,new VarCounter(1, 0));
		}
	}
	
	public void updateWriteVar(String var){
		if(alreadyExisting(var)){
			vars.put(var,vars.get(var).incrWC());
		} else {
			vars.put(var,new VarCounter(0, 1));
		}
	}
	/*
	public void updateVar(String var){
		if(alreadyExisting(var)){
			vars.put(var,vars.get(var)+1);
		} else {
			vars.put(var,1);
		}
	}
	*/
	public void updateCalls(String symb, Lexpr exprs){
		calls.put(symb,exprs);
	}

	public boolean alreadyExisting(String var){
		return vars.containsKey(var);
	}
	
	public boolean tempAlreadyExisting(String var){
		return tempVars.contains(var);
	}
	
	public void updateTempVars(String var){
		tempVars.add(var);
	}

	@Override
	public String toString(){
		return "Input: "+in+", Output: "+out+"\nVariables: "+vars.toString()+"\nCalls: "+calls.keySet().toString();
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

	public void setOut(int out) throws SymTableException {
		if(out<=0){throw new SymTableException("A function can't have no return!");}
		this.out = out;
	}

	public HashMap<String, VarCounter> getVars() {
		return vars;
	}
	
	public HashSet<String> getTempVars() {
		return tempVars;
	}

	public HashMap<String,Lexpr> getCalls() {
		return calls;
	}

	/* Tests methods */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((funName == null) ? 0 : funName.hashCode());
		result = prime * result + in;
		result = prime * result + out;
		result = prime * result + ((calls == null) ? 0 : calls.hashCode());
		result = prime * result + ((vars == null) ? 0 : vars.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj){
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
