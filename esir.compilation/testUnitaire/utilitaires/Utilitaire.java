package utilitaires;

import static org.junit.Assert.assertTrue;

public class Utilitaire {

	public static String printErr(String errText){
		return "(Err : "+errText+ " !)";
	}
	
	public static void sayValid(){
		System.out.print(".");
	}
	
	public static void sayInvalid(){
		System.out.print("|");
	}
	
	public static void assertT(String message, boolean condition){
		assertTrue(printErr(message), condition);
		if(Constante.TEST_TRACE){
			Utilitaire.sayValid();
		}
	}
	
	public static void assertT(boolean condition){
		assertTrue(condition);
		if(Constante.TEST_TRACE){
			Utilitaire.sayValid();
		}
	}
}
