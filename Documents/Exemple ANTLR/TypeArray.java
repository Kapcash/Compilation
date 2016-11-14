class TypeArray extends Type {
	 private int dimension;
	 
    public TypeArray (Type t, int dim){
		  super("ARRAY", 4*dim);
		  _type_expression.addSubType(t);
		  dimension = dim;
    }

    public int GetDim(){
		  return dimension;
    }
}

