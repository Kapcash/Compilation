package esir.compilation;

@SuppressWarnings("serial")
public class ErrorException extends Exception{
	public ErrorException(String message) {
        super("[PP ERROR] : "+message);
    }
}
