package traductionTest;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.LinkedList;

import org.junit.Test;

import sprint2.GeneratorAddr;
import sprint2.QuadImp;
import sprint2.ThreeAddressCode;
import utilitaires.Utilitaires;

public class Code3AdressesTests {

	private static final String origineFilePath = "testUnitaire/traductionTest/Fichier_TestC3A_Original/";
	private static final String resultFilePath = "testUnitaire/traductionTest/Fichier_TestC3A_Resultat/";
	
	String cheminFichierEntree = null;
	String cheminFichierSortie = null;
	
	String[] args = {cheminFichierEntree, cheminFichierSortie};

	@Test
	public void nopTest() {
		args[0] = origineFilePath+"0_NopTest.wh";
		args[1] = resultFilePath+"0_NopTest.cs";
		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
		
		ThreeAddressCode a = tds.getCode3Addresses();
		System.out.println(a);

		assertTrue(true);
	}
	
	@Test
	public void affectation1Test() { // TODO : En stand by
		HashMap<String, LinkedList<QuadImp>> quartet3AdressesAttendu = new HashMap<>();
		LinkedList<QuadImp> quartetCode3adresses = new LinkedList<QuadImp>();
		
		//QuadImp fun = new QuadImp("FUN", "affect1Test", null, null);
		
		args[0] = origineFilePath+"1_Affectation1Test.wh";
		args[1] = resultFilePath+"1_Affectation1Test.cs";
		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
		
		ThreeAddressCode threeAddressCode = tds.getCode3Addresses();
		HashMap<String, LinkedList<QuadImp>> quartet3Adresses = threeAddressCode.getCode3Addr();
		


		assertTrue(true);
	}
	
	@Test
	public void nbEtiquette1Test() {
		args[0] = origineFilePath+"nomProg.wh";
		args[1] = resultFilePath+"nomProg.cs";
		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
		
		ThreeAddressCode threeAddressCode = tds.getCode3Addresses();
		HashMap<String, LinkedList<QuadImp>> mapEtiquetteQuartet3Adresses = threeAddressCode.getCode3Addr();
		int nbEtiquette = mapEtiquetteQuartet3Adresses.size();
		
		int nbEtiquetteAttendu = 1;
		assertTrue(Utilitaires.printErr("Le nombre d'étiquette généré est de "+nbEtiquette+" au lieu de "+nbEtiquetteAttendu),
				nbEtiquette == nbEtiquetteAttendu);
	}
}
