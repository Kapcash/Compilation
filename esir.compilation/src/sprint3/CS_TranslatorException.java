package sprint3;

public class CS_TranslatorException extends Exception {

	public CS_TranslatorException(String message) {
		super("[TRANSLATOR ERROR] : "+message);
	}

}
