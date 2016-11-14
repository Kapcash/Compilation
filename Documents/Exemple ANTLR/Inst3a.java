/**
 * This class implements a 3 adresses code (TAC) statement. The operands are 
 * denoted A,B,C. The op-code gives the semantic of the statement. 
 * Opcodes are defined in the interface CGConstants. 
 * Some of the TAC statements do not use the three operands. If it is the case, 
 * the missing operands are set to null in the constructor. 
 * 
 * @author MLB
 *
 */

class Inst3a implements CGConstants{ 
	
    private int code_op;
    private Operand3a op_a;
    private Operand3a op_b;
    private Operand3a op_c;

    /**
     * The constructor
     * @param op : integer (see CGConstants)
     * @param a : Operand3a
     * @param b : Operand3a or null
     * @param c : Operand3a or null
     */
public Inst3a ( int op, Operand3a a, Operand3a b, Operand3a c)
    {
	code_op = op;
	op_a = a;
	op_b = b;
	op_c = c;

    }
/**
 * no comment
 * @return int
 */
public int getOp()
    {
	return code_op;
    }
/**
 * no comment
 * @return Operand3a
 */
public Operand3a getA()
    {
	return op_a;
    }
/**
 * no commment
 * @return Operand3a
 */
public Operand3a getB()
    {
	return op_b;
    }
/**
 * no comment
 * @return Operand3a
 */
public Operand3a getC()
    {
	return op_c;
    }

/**
 * no comment
 * @param o: Operand3a
 */
public void setA(Operand3a o){
	op_a = o;
}
/**
 * no comment
 * @param o : Operand3a
 */
public void setB(Operand3a o){
	op_b = o;
}

/**
 * no comment
 * @param o : Operand3a
 */
public void setC(Operand3a o){
	op_c = o;
}

/**
 * method for robustifying the toString method. If an operand is missing (null)
 * a "####" is returned in place of the name. Otherwise, the name, as defined by
 * the method getName3a is returned. 
 * @param x : the operand 
 * @return : a printable string
 */
private String the_Name(Operand3a x){
	if (x==null) return "####";
	else return x.getName3a();
}

/**
 * Print a TAC instruction.
 * This method is put here for debug purpose only.
 * TAC with type information  is just an intermediate 
 * representation of the program. The printed form lack some 
 * information to be completely equivalent to the source program
 */
	 public String toString(){
		switch(code_op)
			 {
		    case TAC_ADD:
				  return (" "+the_Name(op_a)+
							 " = "+
							 the_Name(op_b)+
							 " + "+
							 the_Name(op_c));
		    case TAC_SUB:
				  return (" "+the_Name(op_a)+
							 " = "+
							 the_Name(op_b)+
							 " - "+
							 the_Name(op_c));
		    case TAC_MUL:
				  return (" "+the_Name(op_a)+
							 " = "+
							 the_Name(op_b)+
							 " * "+
							 the_Name(op_c));
		    case TAC_DIV:
				  return (" "+the_Name(op_a)+
							 " = "+
							 the_Name(op_b)+
							 " / "+
							 the_Name(op_c));
		    case TAC_NEG:
				  return (" "+the_Name(op_a)+
							 " = "+" - "+
							 the_Name(op_b));
			 case TAC_COPY:
				  return (" "+the_Name(op_a)+
							 " = "+
							 the_Name(op_b));
			 case TAC_GOTO:
				  return (" goto "+
							 the_Name(op_a));
				  
		    case TAC_IFZ:
				  return (" ifz "+
							 the_Name(op_a)+
							 " goto "+
							 the_Name(op_b));
		    case TAC_IFNZ:
				  return (" ifnz "+
							 the_Name(op_a)+
							 " goto "+
							 the_Name(op_b));
			 case TAC_ARG:
				  return (" arg "+
							 the_Name(op_a));
			 case TAC_CALL:
				  if (op_a!=null)
						return (" "+the_Name(op_a)+
								  " =  call "+
								  the_Name(op_b));
				  else
						return (" call "+
								  the_Name(op_b));
			 case TAC_RETURN:
				  return (" return "+
							 the_Name(op_a));
			 case TAC_LABEL:
				  return (" label "+
							 the_Name(op_a));
			 case TAC_VAR:
				  return (" var "+
							 the_Name(op_a));
			 case TAC_BEGINFUNC:
				  return (" beginfunc ");
			 case TAC_ENDFUNC:
				  return (" endfunc ");
			 case TAC_TABVAR:
				  return (" "+the_Name(op_a)+
							 " = "+
							 the_Name(op_b)+
							 " [ "+
							 the_Name(op_c)+
							 " ]");
							 
		    case TAC_VARTAB:
				  return (" "+the_Name(op_a)+
							 " [ "+
							 the_Name(op_b)+
							 " ] = "+
							 the_Name(op_c));
		    default:
				  return (" unknown TAC opcode ");
			 }
	 }
	 
	 public void print(){
		 System.out.println(this.toString());
	 }
 
} // en class Inst3a
