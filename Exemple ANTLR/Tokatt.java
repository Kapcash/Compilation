
class Tokatt extends Operand3a{

    public String name;
    public int scope;
    public Type type;
    public Tokatt label;
    public int offset;
    public int value;
    public boolean param;
    

    public Tokatt(String n){
		  name = n.substring(1,n.length()-1);
		  scope = -1;
		  type = TypeSystem.T_c_text;
		  label = SymbDistrib.newLabelText();
		  offset = -1;
		  value = -1;
		  param = false;
    }

    public Tokatt( Type t, String n, int sc){ // pour les variables
		  name = n;
		  scope = sc;
		  type = t;
		  label = null;
		  offset = -1;
		  value = -1;
		  param = false;
    }
    public Tokatt (int v){ // pour les entiers constants
		  name = "";
		  scope = -1;
		  type = TypeSystem.TypeConstInteger();
		  label = null;
		  offset = -1;
		  value = v;
		  param = false;
    }

	 public Tokatt (String n, Type t){ // pour labels et temporaires
		  name = n;
		  scope = -1;
		  type = t;
		  label = null;
		  offset = -1;
		  value = -1;
		  param = false;
	 }

 
    	public String toString(){
		  if (value < 0)
				return name;
		  else return String.valueOf(value);
    	}
	
	
	
	// abstract methods inherited from CGinterface
	public String getChain(){
		return name;
	}
	
	public String getName3a(){
		if (type == TypeSystem.T_c_text){
			return label.name;}
		else
			if(type == TypeSystem.T_c_integer)
				return String.valueOf(value);
			else
				return name;
	}
	
	public int getScope(){
		return scope;
	}
	
	public int getSize(){
		return type.getSize();
	}
	
	public boolean isArray(){
		return type.typeExpression().getName().equals( "ARRAY");
	}
	
	public boolean isConstInteger(){
		return (type == TypeSystem.T_c_integer);
	}
	
	public boolean isLabel(){
		return (type == TypeSystem.T_label || type == TypeSystem.T_c_text );
	}
	
	public boolean isText(){
		return (type == TypeSystem.T_c_text);
	}
	
	public boolean isPointer(){
		return (type == TypeSystem.T_pointer);
	}
	
	public boolean isVarInteger(){
		return (type == TypeSystem.T_integer);
	}
	
	public boolean isParam(){
		return param;
	}
	
	public void setParam(){
		param=true;
	}
}
