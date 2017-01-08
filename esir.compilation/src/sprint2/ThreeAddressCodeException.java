package sprint2;

@SuppressWarnings("serial")
public class ThreeAddressCodeException extends Exception {
	public ThreeAddressCodeException(String message) {
        super("[ADDRCODE ERROR] : "+message);
    }
}
