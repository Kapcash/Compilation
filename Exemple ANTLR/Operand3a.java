/**
 * Abstract class for implementing the TAC operands. This class defines has the 
 * minimal set of attributes for (assembler) code generation. The abstract 
 * methods defined in the interface are also necessary for assembler code 
 * generation. They might be usefull for type checking and  TAC generation.
 * 
 * The offset attribute is set and used by the assembler code generator. It represents
 * the address of the operand relative to the top of the activation block.
 *  
 * @author MLB
 *
 */
public abstract class Operand3a implements CGinterface{
	private int offset;
	
/**
 * a simple constructor: set the offset to zero
 */
	public Operand3a(){
		offset = 0;
	}
	
/**
 * set the address of the operand
 * @param off : int
 */	
	public void setOffset( int off){
		offset = off;
	}
/**
 * 
 * @return : the address
 */
	public int getOffset(){
		return offset;
	}
}
