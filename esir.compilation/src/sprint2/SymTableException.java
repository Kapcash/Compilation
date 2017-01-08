package sprint2;

@SuppressWarnings("serial")
public class SymTableException extends Exception{
	public SymTableException(String message) {
        super("[SYMTABLE ERROR] : "+message);
    }
}
