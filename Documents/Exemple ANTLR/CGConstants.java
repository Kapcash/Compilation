
public interface CGConstants {
	
	public int WORD_SIZE = 4; /* 32 bits machine */
	/**
	 * Constants used in TAC: code op
	 * We put them here since there are shared by TAC and code generator
	 */
	 public static final 
	  int TAC_NILL=0,
	  TAC_ADD=1,          // a = b op c
	  TAC_SUB=2,
	  TAC_MUL=3,
	  TAC_DIV=4,
	  TAC_NEG=5,          // a = -b
	  TAC_COPY=6,         // a = b
	  TAC_GOTO=7,         // goto a
	  TAC_IFZ=8,          // ifz a goto b
	  TAC_IFNZ=9,         // ifnz a goto b
	  TAC_ARG=10,         // arg a
	  TAC_CALL=11,        // a = call b ou call b
	  TAC_RETURN=12,      // return a
	  TAC_TABVAR=13,      // a = b[c]
	  TAC_VARTAB=14,      // a[b] = c
	  TAC_LABEL=15,       // label a
	  TAC_VAR=16,         // var a
	  TAC_BEGINFUNC=17,
	  TAC_ENDFUNC=18;
	
	/** Constants for assembly code generation.
	 *  First we define some of the registers. We reserve
	 *  register R1 as the stack pointer and use registers R2 - R4 in the calling
	 *  and return sequences. */

	static String R_INDENT = "       ";
	
	static int R_ZERO  = 0;		 /* Constant zero */
	static int R_RES   = 2;		 /* Result reg and last reserved */

	static int R_ARG1  = 4;
	static int R_ARG2  = 5;
	static int R_ARG3  = 6;
	static int R_ARG4  = 7;
	static int R_GEN   = 8;		 /* First general purpose register */
	static int R_MAX   = 24; 	 /* 24 regs */
	
	//$25 is reserved for dynamic link 
	
	static int R_GP = 28;
	static int R_STACK = 29;		 /* Stack pointer */
	static int R_RET   = 31;		 /* Return address */

	static boolean R_MODIFIED = true; 		/* Entries for descriptors */
	static boolean R_UNMODIFIED = false;
}
