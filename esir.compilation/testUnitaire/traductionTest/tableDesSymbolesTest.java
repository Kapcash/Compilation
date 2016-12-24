package traductionTest;

import static org.junit.Assert.*;

import org.junit.Test;

import sprint2.GeneratorAddr;

public class tableDesSymbolesTest {
	
	private static final String origineFilePath = "testUnitaire/traductionTest/Fichier_Test_Original/";
	private static final String resultFilePath = "testUnitaire/traductionTest/Fichier_Test_Resultat/";
	
	String cheminFichierEntree = null;
	String cheminFichierSortie = null;
	
	String[] args = {cheminFichierEntree, cheminFichierSortie};

	@Test
	public void test() {
		args[0] = origineFilePath+"testIf1.whpp";
		args[1] = resultFilePath+"testIf1.whpp";	
		GeneratorAddr.main(args);
		
		assertTrue(true);
	}
	
}

