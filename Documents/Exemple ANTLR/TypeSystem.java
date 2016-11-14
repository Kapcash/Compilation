class TypeSystem {
	// constant types are created as static attributes of the TypeSystem
	static final public Type T_integer = new Type("INTEGER", 4),
			T_c_integer = new Type("C_INTEGER", 4), T_c_text = new Type("TEXT",
					-1), T_label = new Type("LABEL", -1), T_pointer = new Type(
					"POINTER", 4), T_error = new Type("ERROR", -1),
			T_void = new Type("VOID", 0); 

	static public Type TypeInteger() {
		return T_integer;
	}

	static public Type TypeVoid() {
		return T_void;
	}

	static public Type TypePointer() {
		return T_pointer;
	}

	static public Type TypeConstInteger() {
		return T_c_integer;
	}

	static public Type TypeLabel() {
		return T_label;
	}





	/**
	 * verif du type de deux operandes d'une operation binaire entiere
	 */

	public static Type CheckBinOp(Type t1, Type t2) {
		if (t1 == T_integer && t2 == T_integer)
			return T_integer;
		else
			return T_error;
	}


	
}// end TypeSystem
