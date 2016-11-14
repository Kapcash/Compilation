

public interface CGinterface {
	/**
	 * Test if a TAC operand is an integer litteral
	 * @return a boolean
	 */
	public boolean isConstInteger();
	
	/**
	 * Test if a TAC_VAR is a parameter of a function
	 * @return a boolean
	 */
	public boolean isParam();
	
	/**
	 * Test if a TAC operand is an integer variable
	 * @return a boolean
	 */
	public boolean isVarInteger();
	/**
	 * Test if a TAC operand is an array
	 * @return a boolean
	 */
	public boolean isArray();
	/**
	 * Test if a TAC operand is a pointer
	 * When an array is passed as a parameter, the value of the the address 
	 * is passed to the subroutine. So it is a pointer.
	 * @return a boolean
	 */
	public boolean isPointer();
	/**
	 * Test if a TAC operand is a label
	 * @return a boolean
	 */
	public boolean isLabel();
	
	/**
	 * This method must return a printable  view of a TAC operand.
	 * Variable name for a variable, integer string for an integer.
	 * Recall that the TAC name of a function is the associated label!!  
	 * @return String
	 */
	public String getName3a();
	/**
	 * Text constants are implemented as pseudo TAC operands
	 * Their TAC name is the associated label. This method must return 
	 * the text itself. Do nothing serious for other kind of operands. 
	 * @return String
	 */
	public String getChain();
	/**
	 * Returns the scope of a TAC operand if not meaningless. 
	 * Othewise, should return -1.
	 * @return integer
	 */
	public int getScope();
	/**
	 * Returns the size (in bytes) of a TAC operand unless meaningless.
	 * -1 if not appropriate.
	 * @return
	 */
	public int getSize();
}
