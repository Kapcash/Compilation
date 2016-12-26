package traductionTest;

import static org.junit.Assert.*;

import org.junit.Test;

import sprint2.GeneratorAddr;

public class code3AdressesTests {

	private static final String origineFilePath = "testUnitaire/traductionTest/Fichier_TestC3A_Original/";
	private static final String resultFilePath = "testUnitaire/traductionTest/Fichier_Test_Resultat/";
	
	String cheminFichierEntree = null;
	String cheminFichierSortie = null;
	
	String[] args = {cheminFichierEntree, cheminFichierSortie};

	@Test
	public void test() {
		args[0] = origineFilePath+"test1.wh";
		args[1] = resultFilePath+"test1.whc";	
		GeneratorAddr.main(args);

		assertTrue(true);
	}
}
