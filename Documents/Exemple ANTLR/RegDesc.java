import java.io.PrintStream;


public class RegDesc implements CGConstants {
	private Operand3a memory;
	// memory associated with register
	private boolean modified;
	// true if the content of memory is different from those of the register
	private int regNumber;
	
	public RegDesc(int regNumber){
		this.memory = null;
		this.modified = false;
		this.regNumber = regNumber;
	}
	
	public Operand3a getMemory(){
		return memory;
	}
	
	public boolean getModif(){
		return modified;
	}
	
	public int getRegNumber(){
		return this.regNumber;
	}
	
	/**
	 * if cleared, the register is no more associated with a variable
	 */
	public void clear(){
		memory = null;
		modified = false;		
	}
	
	/**
	 * dump the register content in the associated memory, if different
	 */ 
	public void spill(int n, PrintStream out){
		if (modified) {		
			out.println(R_INDENT +"sw  $"+ n +","+ memory.getOffset() +"($"+ R_STACK +")");
			modified = false;
		}
	}
	
	/**
	 * set the attributes
	 */
	public void set(Operand3a mem, boolean mod){
		memory = mem;
		modified = mod;
	}
	
}
