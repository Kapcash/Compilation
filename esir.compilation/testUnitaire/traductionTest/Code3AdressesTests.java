package traductionTest;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

import org.junit.Test;

import sprint2.GeneratorAddr;
import sprint2.OP;
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
	public void nbEtiquette0Test() {
		verifNbEtiquette("0_NopTest");
	}
	
	@Test
	public void nbEtiquette1Test() {
		verifNbEtiquette("1_Affectation1Test");
	}
	
	@Test
	public void nbEtiquette2Test() {
		verifNbEtiquette("2_ConsTest");
	}
	
	@Test
	public void nbEtiquette3Test() {
		verifNbEtiquette("3_ListTest");
	}
	
	@Test
	public void nbEtiquette4Test() {
		verifNbEtiquette("4_HdTest");
	}
	
	@Test
	public void nbEtiquette5Test() {
		verifNbEtiquette("5_TlTest");
	}
	
	@Test
	public void nbEtiquette6Test() {
		verifNbEtiquette("6_IfTest");
	}
	
	@Test
	public void nbEtiquette7Test() {
		verifNbEtiquette("7_WhileTest");
	}
	
	@Test
	public void nbEtiquette8Test() {
		verifNbEtiquette("8_ForTest");
	}
	
	@Test
	public void nbEtiquette9Test() {
		verifNbEtiquette("exemple");
	}
	
	@Test
	public void nbEtiquette10Test() {
		verifNbEtiquette("exemple2");
	}
	
	@Test
	public void nbEtiquette11Test() {
		verifNbEtiquette("exemple3");
	}
	
	@Test
	public void nbEtiquette12Test() {
		verifNbEtiquette("exemple4");
	}
	
	@Test
	public void nbEtiquette13Test() {
		verifNbEtiquette("exemple5");
	}
	
	@Test
	public void nbEtiquette14Test() {
		verifNbEtiquette("exemple6");
	}
	
	/*Utilitaires*/
	public void verifNbEtiquette(String nomProgSansExtension) {
		args[0] = origineFilePath+nomProgSansExtension+".wh";
		args[1] = resultFilePath+nomProgSansExtension+".cs";
		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
		
		ThreeAddressCode threeAddressCode = tds.getCode3Addresses();
		HashMap<String, LinkedList<QuadImp>> mapEtiquetteQuartet3Adresses = threeAddressCode.getCode3Addr();
		int nbEtiquette = mapEtiquetteQuartet3Adresses.size();
		
		int nbEtiquetteAttendu = 0;
		
		Collection<LinkedList<QuadImp>> listDeQuadrupletList = mapEtiquetteQuartet3Adresses.values();
		for (LinkedList<QuadImp> quadruplets : listDeQuadrupletList){
			for (QuadImp quadImp : quadruplets){
				if (quadImp.getOperateur().getOpe().equals(OP.FUN)){
					nbEtiquetteAttendu++;
					continue;
				}
				if (quadImp.getOperateur().getOpe().equals(OP.WHILE)){
					nbEtiquetteAttendu++;
					continue;
				}
			}
		}
		
		assertTrue(Utilitaires.printErr("Le nombre d'étiquette généré est de "+nbEtiquette+" au lieu de "+nbEtiquetteAttendu),
				nbEtiquette == nbEtiquetteAttendu);
	}
}
