package traductionTest;

import static org.junit.Assert.*;

import org.junit.Test;

import sprint2.GeneratorAddr;

public class TableDesSymbolesTest {
	
	private static final String origineFilePath = "testUnitaire/traductionTest/Fichier_TestTDS_Original/";
	private static final String resultFilePath = "testUnitaire/traductionTest/Fichier_TestTDS_Resultat/";
	
	String[] args = new String[2];

	@Test
	public void test() {
		args[0] = origineFilePath+"affMultiple.wh";
		args[1] = resultFilePath+"affMultiple.tds";
		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);

		assertTrue(true);
	}
}