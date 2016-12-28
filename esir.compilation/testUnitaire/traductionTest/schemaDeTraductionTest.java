package traductionTest;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import sprint2.DefFun;
import sprint2.GeneratorAddr;

public class SchemaDeTraductionTest {

	private static final String origineFilePath = "testUnitaire/traductionTest/Fichier_TestSDT_Original/";
	private static final String resultFilePath = "testUnitaire/traductionTest/Fichier_TestSDT_Resultat/";
	
	String cheminFichierEntree = null;
	String cheminFichierSortie = null;
	
	String[] args = {cheminFichierEntree, cheminFichierSortie};

	@Test
	public void test() {
		args[0] = origineFilePath+"test1.wh";
		args[1] = resultFilePath+"test1.whc";	
		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
		
		assertTrue(true);
	}

}
