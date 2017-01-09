package traductionTest;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

import org.junit.Test;

import sprint2.GeneratorAddr;
import sprint2.OP;
import sprint2.QuadImp;
import sprint2.SymTableException;
import sprint2.ThreeAddressCode;
import sprint2.ThreeAddressCodeException;
import sprint3.CS_TranslatorException;
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
		try{
			tds.launchGeneration(args);
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}
		
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
		try{
			tds.launchGeneration(args);
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}
		
		ThreeAddressCode threeAddressCode = tds.getCode3Addresses();
		HashMap<String, LinkedList<QuadImp>> quartet3Adresses = threeAddressCode.getCode3Addr();

		assertTrue(true);
	}
	
	@Test
	public void nbEtiquetteNopTest() {
		verifNbEtiquette("0_NopTest");
	}
	
	@Test
	public void nbEtiquetteAffectation1Test() {
		verifNbEtiquette("1_Affectation1Test");
	}
	
	@Test
	public void nbEtiquetteAffectation2Test() {
		verifNbEtiquette("1_Affectation2Test");
	}
	
	@Test
	public void nbEtiquetteConsTest() {
		verifNbEtiquette("2_ConsTest");
	}
	
	@Test
	public void nbEtiquetteListTestTest() {
		verifNbEtiquette("3_ListTest");
	}
	
	@Test
	public void nbEtiquetteHdTest() {
		verifNbEtiquette("4_HdTest");
	}
	
	@Test
	public void nbEtiquetteTlTest() {
		verifNbEtiquette("5_TlTest");
	}
	
	@Test
	public void nbEtiquetteIfTest() {
		verifNbEtiquette("6_IfTest");
	}
	
	@Test
	public void nbEtiquetteIfSimpleTest() {
		verifNbEtiquette("6_IfTestSimple");
	}
	
	@Test
	public void nbEtiquetteWhileTest() {
		verifNbEtiquette("7_WhileTest");
	}
	
	@Test
	public void nbEtiquetteForTest() {
		verifNbEtiquette("8_ForTest");
	}
	
	@Test
	public void nbEtiquetteFunMultTest() {
		verifNbEtiquette("9_FunMultTest");
	}
	
	@Test
	public void nbEtiquetteMixedTest() {
		verifNbEtiquette("10_MixedTest");
	}
	
	@Test
	public void nbEtiquetteExempleTest() {
		verifNbEtiquette("exemple");
	}
	
	@Test
	public void nbEtiquetteExemple2Test() {
		verifNbEtiquette("exemple2");
	}
	
	@Test
	public void nbEtiquetteExemple3Test() {
		verifNbEtiquette("exemple3");
	}
	
	@Test
	public void nbEtiquetteExemple4Test() {
		verifNbEtiquette("exemple4");
	}
	
	@Test
	public void nbEtiquetteExemple5Test() {
		verifNbEtiquette("exemple5");
	}
	
	@Test
	public void nbEtiquetteExemple6Test() {
		verifNbEtiquette("exemple6");
	}
	
	/*Utilitaires*/
	public void verifNbEtiquette(String nomProgSansExtension) {
		args[0] = origineFilePath+nomProgSansExtension+".wh";
		args[1] = resultFilePath+nomProgSansExtension+".cs";
		GeneratorAddr tds = GeneratorAddr.getInstance();
		try{
			tds.launchGeneration(args);
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}
		
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
					nbEtiquetteAttendu +=2;
					continue;
				}
				if (quadImp.getOperateur().getOpe().equals(OP.FOR)){
					nbEtiquetteAttendu +=2;
					continue;
				}
				if (quadImp.getOperateur().getOpe().equals(OP.FOREACH)){
					nbEtiquetteAttendu +=2;
					continue;
				}
				if (quadImp.getOperateur().getOpe().equals(OP.IF)){
					nbEtiquetteAttendu +=2;
					continue;
				}
				if (quadImp.getOperateur().getOpe().equals(OP.ELSE)){
					nbEtiquetteAttendu ++;
					continue;
				}
			}
		}
		
		assertTrue(Utilitaires.printErr("Le nombre d'étiquette généré est de "+nbEtiquette+" au lieu de "+nbEtiquetteAttendu),
				nbEtiquette == nbEtiquetteAttendu);
	}
}
