package esir.compilation.generator;

@SuppressWarnings("serial")
public class ErrorException extends Exception{
	public ErrorException(String message) {
        super("[PP ERROR] : "+message);
    }
}
