
class Type {
	 protected TypeExp _type_expression;
	 protected int _size;

    public Type(String name, int size){
			_size = size;
			_type_expression = new TypeExp(name);
    }

	 public TypeExp typeExpression(){
		  return _type_expression;
	 }

	 public int getSize(){
		  return _size;
    }
    
	 public void addSubType(Type t){
		  _type_expression.addSubType(t);
	 }

    public boolean isCompatible(Type t){
		  return _type_expression.isCompatible(t.typeExpression());
	 }
	
	public String toString(){
		return _type_expression.toString();
	}
}
