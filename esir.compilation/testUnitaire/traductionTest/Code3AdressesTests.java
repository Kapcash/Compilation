package traductionTest;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import org.junit.Test;

import sprint2.GeneratorAddr;
import sprint2.OP;
import sprint2.OPCode;
import sprint2.QuadImp;
import sprint2.SymTableException;
import sprint2.ThreeAddressCode;
import sprint2.ThreeAddressCodeException;
import sprint3.CS_TranslatorException;
import utilitaires.Constante;
import utilitaires.Utilitaires;

public class Code3AdressesTests {
	
	private static final String origineFilePath = Constante.PATH+ "traductionTest/Fichier_TestC3A_Original/";
	private static final String resultFilePath =  Constante.PATH+ "traductionTest/Fichier_TestC3A_Resultat/";

	String cheminFichierEntree = null;
	String cheminFichierSortie = null;

	String[] args = {cheminFichierEntree, cheminFichierSortie};

	/*Les tests suivant verifient que le nombre d'etiquette genere est coherent*/

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

	/*Les tests suivant verifient que le code 3 adresses genere est coherent*/

	@Test
	public void nopTest() {
		HashMap<String, LinkedList<QuadImp>> mapEtiquetteQuadruplet3Adresses = getMapEtiquetteQuadruplet3Adresses("0_NopTest");

		boolean isMatch = false;
		Collection<LinkedList<QuadImp>> listeDeListeDeQuadruplets = mapEtiquetteQuadruplet3Adresses.values();
		for (LinkedList<QuadImp> quadruplets : listeDeListeDeQuadruplets){
			ListIterator<QuadImp> quadrupletIt = quadruplets.listIterator();
			QuadImp originalQuadruplet = null;
			QuadImp oracleQuadruplet = null;

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.FUN, ""), "nopTest", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "A", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.NOP, ""), "", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.WRITE, ""), "A", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		}

		assertTrue(Utilitaires.printErr("Le code 3 adresses genere est incorrect"), isMatch);
	}

	@Test
	public void affectation1Test() {
		HashMap<String, LinkedList<QuadImp>> mapEtiquetteQuadruplet3Adresses = getMapEtiquetteQuadruplet3Adresses("1_Affectation1Test");

		boolean isMatch = false;
		Collection<LinkedList<QuadImp>> listeDeListeDeQuadruplets = mapEtiquetteQuadruplet3Adresses.values();
		for (LinkedList<QuadImp> quadruplets : listeDeListeDeQuadruplets){
			ListIterator<QuadImp> quadrupletIt = quadruplets.listIterator();
			QuadImp originalQuadruplet = null;
			QuadImp oracleQuadruplet = null;

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.FUN, ""), "affect1Test", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "A", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "B", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "Y0", "B", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "X0", "Y0", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "A", "X0", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.WRITE, ""), "A", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		}

		assertTrue(Utilitaires.printErr("Le code 3 adresses genere est incorrect"), isMatch);
	}

	@Test
	public void affectation2Test() {
		HashMap<String, LinkedList<QuadImp>> mapEtiquetteQuadruplet3Adresses = getMapEtiquetteQuadruplet3Adresses("1_Affectation2Test");

		boolean isMatch = false;
		Collection<LinkedList<QuadImp>> listeDeListeDeQuadruplets = mapEtiquetteQuadruplet3Adresses.values();
		for (LinkedList<QuadImp> quadruplets : listeDeListeDeQuadruplets){
			ListIterator<QuadImp> quadrupletIt = quadruplets.listIterator();
			QuadImp originalQuadruplet = null;
			QuadImp oracleQuadruplet = null;

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.FUN, ""), "affect2Test", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "A", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "B", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "C", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "D", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "Y0", "B", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "X0", "Y0", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "A", "X0", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "Y0", "C", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "X0", "Y0", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "B", "X0", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "Y0", "D", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "X0", "Y0", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "C", "X0", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "Y0", "C", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "X0", "Y0", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "Y0", "D", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "X1", "Y0", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "A", "X0", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "B", "X1", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.WRITE, ""), "B", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		}

		assertTrue(Utilitaires.printErr("Le code 3 adresses genere est incorrect"), isMatch);
	}

	@Test
	public void consTest() {
		HashMap<String, LinkedList<QuadImp>> mapEtiquetteQuadruplet3Adresses = getMapEtiquetteQuadruplet3Adresses("2_ConsTest");

		boolean isMatch = false;
		Collection<LinkedList<QuadImp>> listeDeListeDeQuadruplets = mapEtiquetteQuadruplet3Adresses.values();
		for (LinkedList<QuadImp> quadruplets : listeDeListeDeQuadruplets){
			ListIterator<QuadImp> quadrupletIt = quadruplets.listIterator();
			QuadImp originalQuadruplet = null;
			QuadImp oracleQuadruplet = null;

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.FUN, ""), "consTest", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "A", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "B", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "C", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.PUSH, ""), "", "B", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.PUSH, ""), "", "C", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.CONS, ""), "Y0", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "X0", "Y0", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "A", "X0", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.WRITE, ""), "A", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		}
		assertTrue(Utilitaires.printErr("Le code 3 adresses genere est incorrect"), isMatch);
	}

	@Test
	public void listTest() {
		HashMap<String, LinkedList<QuadImp>> mapEtiquetteQuadruplet3Adresses = getMapEtiquetteQuadruplet3Adresses("3_ListTest");

		boolean isMatch = false;
		Collection<LinkedList<QuadImp>> listeDeListeDeQuadruplets = mapEtiquetteQuadruplet3Adresses.values();
		for (LinkedList<QuadImp> quadruplets : listeDeListeDeQuadruplets){
			ListIterator<QuadImp> quadrupletIt = quadruplets.listIterator();
			QuadImp originalQuadruplet = null;
			QuadImp oracleQuadruplet = null;

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.FUN, ""), "listTest", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "A", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "B", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "C", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "D", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.PUSH, ""), "", "B", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.PUSH, ""), "", "C", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.PUSH, ""), "", "D", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.LIST, ""), "Y0", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "X0", "Y0", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "A", "X0", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.WRITE, ""), "A", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		}

		assertTrue(Utilitaires.printErr("Le code 3 adresses genere est incorrect"), isMatch);
	}

	@Test
	public void hdTest() {
		HashMap<String, LinkedList<QuadImp>> mapEtiquetteQuadruplet3Adresses = getMapEtiquetteQuadruplet3Adresses("4_HdTest");

		boolean isMatch = false;
		Collection<LinkedList<QuadImp>> listeDeListeDeQuadruplets = mapEtiquetteQuadruplet3Adresses.values();
		for (LinkedList<QuadImp> quadruplets : listeDeListeDeQuadruplets){
			ListIterator<QuadImp> quadrupletIt = quadruplets.listIterator();
			QuadImp originalQuadruplet = null;
			QuadImp oracleQuadruplet = null;

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.FUN, ""), "hdTest", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "A", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.HD, ""), "Y0", "A", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "X0", "Y0", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "B", "X0", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.WRITE, ""), "B", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		}

		assertTrue(Utilitaires.printErr("Le code 3 adresses genere est incorrect"), isMatch);
	}

	@Test
	public void tlTest() {
		HashMap<String, LinkedList<QuadImp>> mapEtiquetteQuadruplet3Adresses = getMapEtiquetteQuadruplet3Adresses("5_TlTest");

		boolean isMatch = false;
		Collection<LinkedList<QuadImp>> listeDeListeDeQuadruplets = mapEtiquetteQuadruplet3Adresses.values();
		for (LinkedList<QuadImp> quadruplets : listeDeListeDeQuadruplets){
			ListIterator<QuadImp> quadrupletIt = quadruplets.listIterator();
			QuadImp originalQuadruplet = null;
			QuadImp oracleQuadruplet = null;

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.FUN, ""), "tlTest", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "A", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.TL, ""), "Y0", "A", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "X0", "Y0", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "B", "X0", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

			checkIt(quadrupletIt);
			originalQuadruplet = quadrupletIt.next();
			oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.WRITE, ""), "B", "", "");
			isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		}

		assertTrue(Utilitaires.printErr("Le code 3 adresses genere est incorrect"), isMatch);
	}

	@Test
	public void ifTest() {
		HashMap<String, LinkedList<QuadImp>> mapEtiquetteQuadruplet3Adresses = getMapEtiquetteQuadruplet3Adresses("6_IfTest");

		boolean isMatch = false;
		
		Collection<LinkedList<QuadImp>> etiquettes = mapEtiquetteQuadruplet3Adresses.values();
		Iterator<LinkedList<QuadImp>> etiquettesIt = etiquettes.iterator();

		/*Etiquette L0*/
		checkIt(etiquettesIt);
		LinkedList<QuadImp> quadruplets = etiquettesIt.next();
		
		ListIterator<QuadImp> quadrupletIt = quadruplets.listIterator();
		QuadImp originalQuadruplet = null;
		QuadImp oracleQuadruplet = null;

		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "Y0", "nil", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

		/*Etiquette L1*/
		checkIt(etiquettesIt);
		quadruplets = etiquettesIt.next();
		quadrupletIt = quadruplets.listIterator();
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.NOP, ""), "", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

		/*Etiquette L2*/
		checkIt(etiquettesIt);
		quadruplets = etiquettesIt.next();
		quadrupletIt = quadruplets.listIterator();
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.NOP, ""), "", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		/*Etiquette L3*/
		checkIt(etiquettesIt);
		quadruplets = etiquettesIt.next();
		quadrupletIt = quadruplets.listIterator();
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.FUN, ""), "ifTest", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "A", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.IF, "L0"), "", "L1", "L2");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.WRITE, ""), "A", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

		assertTrue(Utilitaires.printErr("Le code 3 adresses genere est incorrect"), isMatch);
	}

	@Test
	public void ifSimpleTest() {
		HashMap<String, LinkedList<QuadImp>> mapEtiquetteQuadruplet3Adresses = getMapEtiquetteQuadruplet3Adresses("6_IfTestSimple");

		boolean isMatch = false;
		
		Collection<LinkedList<QuadImp>> etiquettes = mapEtiquetteQuadruplet3Adresses.values();
		Iterator<LinkedList<QuadImp>> etiquettesIt = etiquettes.iterator();

		/*Etiquette L0*/
		checkIt(etiquettesIt);
		LinkedList<QuadImp> quadruplets = etiquettesIt.next();
		
		ListIterator<QuadImp> quadrupletIt = quadruplets.listIterator();
		QuadImp originalQuadruplet = null;
		QuadImp oracleQuadruplet = null;

		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "Y0", "nil", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

		/*Etiquette L1*/
		checkIt(etiquettesIt);
		quadruplets = etiquettesIt.next();
		quadrupletIt = quadruplets.listIterator();
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.NOP, ""), "", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		/*Etiquette L2*/
		checkIt(etiquettesIt);
		quadruplets = etiquettesIt.next();
		quadrupletIt = quadruplets.listIterator();
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.FUN, ""), "ifTest", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "A", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.IF, "L0"), "", "L1", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.WRITE, ""), "A", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

		assertTrue(Utilitaires.printErr("Le code 3 adresses genere est incorrect"), isMatch);
	}
	
	@Test
	public void whileTest() {
		HashMap<String, LinkedList<QuadImp>> mapEtiquetteQuadruplet3Adresses = getMapEtiquetteQuadruplet3Adresses("7_WhileTest");

		boolean isMatch = false;
		
		Collection<LinkedList<QuadImp>> etiquettes = mapEtiquetteQuadruplet3Adresses.values();
		Iterator<LinkedList<QuadImp>> etiquettesIt = etiquettes.iterator();

		/*Etiquette L0*/
		checkIt(etiquettesIt);
		LinkedList<QuadImp> quadruplets = etiquettesIt.next();
		
		ListIterator<QuadImp> quadrupletIt = quadruplets.listIterator();
		QuadImp originalQuadruplet = null;
		QuadImp oracleQuadruplet = null;

		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "Y0", "nil", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

		/*Etiquette L1*/
		checkIt(etiquettesIt);
		quadruplets = etiquettesIt.next();
		quadrupletIt = quadruplets.listIterator();
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "Y0", "A", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "X0", "Y0", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "B", "X0", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.NOP, ""), "", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		/*Etiquette L2*/
		checkIt(etiquettesIt);
		quadruplets = etiquettesIt.next();
		quadrupletIt = quadruplets.listIterator();
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.FUN, ""), "whileTest", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "A", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.WHILE, "L0"), "", "L1", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.WRITE, ""), "D", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

		assertTrue(Utilitaires.printErr("Le code 3 adresses genere est incorrect"), isMatch);
	}
	
	@Test
	public void forTest() {
		HashMap<String, LinkedList<QuadImp>> mapEtiquetteQuadruplet3Adresses = getMapEtiquetteQuadruplet3Adresses("8_ForTest");

		boolean isMatch = false;
		
		Collection<LinkedList<QuadImp>> etiquettes = mapEtiquetteQuadruplet3Adresses.values();
		Iterator<LinkedList<QuadImp>> etiquettesIt = etiquettes.iterator();

		/*Etiquette L0*/
		checkIt(etiquettesIt);
		LinkedList<QuadImp> quadruplets = etiquettesIt.next();
		
		ListIterator<QuadImp> quadrupletIt = quadruplets.listIterator();
		QuadImp originalQuadruplet = null;
		QuadImp oracleQuadruplet = null;

		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "Y0", "nil", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

		/*Etiquette L1*/
		checkIt(etiquettesIt);
		quadruplets = etiquettesIt.next();
		quadrupletIt = quadruplets.listIterator();
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "Y0", "A", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "X0", "Y0", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "B", "X0", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.NOP, ""), "", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		/*Etiquette L2*/
		checkIt(etiquettesIt);
		quadruplets = etiquettesIt.next();
		quadrupletIt = quadruplets.listIterator();
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.FUN, ""), "forTest", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "A", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.FOR, "L0"), "", "L1", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.WRITE, ""), "B", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

		assertTrue(Utilitaires.printErr("Le code 3 adresses genere est incorrect"), isMatch);
	}
	
	@Test
	public void affectationMultRetFonctionTest() {
		HashMap<String, LinkedList<QuadImp>> mapEtiquetteQuadruplet3Adresses = getMapEtiquetteQuadruplet3Adresses("11_DoubleFunction");

		boolean isMatch = false;
		
		Collection<LinkedList<QuadImp>> etiquettes = mapEtiquetteQuadruplet3Adresses.values();
		Iterator<LinkedList<QuadImp>> etiquettesIt = etiquettes.iterator();

		/*Etiquette L0*/
		checkIt(etiquettesIt);
		LinkedList<QuadImp> quadruplets = etiquettesIt.next();
		
		ListIterator<QuadImp> quadrupletIt = quadruplets.listIterator();
		QuadImp originalQuadruplet = null;
		QuadImp oracleQuadruplet = null;

		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.FUN, ""), "useTest", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "A", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.PUSH, ""), "", "A", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.CALL, "ifTest"), "", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.POP, ""), "Y0", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.POP, ""), "Y1", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "X0", "Y0", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "X1", "Y1", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "C", "X0", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "B", "X1", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.WRITE, ""), "B", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

		/*Etiquette L1*/
		checkIt(etiquettesIt);
		quadruplets = etiquettesIt.next();	
		quadrupletIt = quadruplets.listIterator();
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.AFF, ""), "Y0", "nil", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

		/*Etiquette L2*/
		checkIt(etiquettesIt);
		quadruplets = etiquettesIt.next();
		quadrupletIt = quadruplets.listIterator();
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.NOP, ""), "", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

		/*Etiquette L3*/
		checkIt(etiquettesIt);
		quadruplets = etiquettesIt.next();
		quadrupletIt = quadruplets.listIterator();
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.NOP, ""), "", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		/*Etiquette L4*/
		checkIt(etiquettesIt);
		quadruplets = etiquettesIt.next();
		quadrupletIt = quadruplets.listIterator();
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.FUN, ""), "ifTest", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.READ, ""), "A", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.IF, "L1"), "", "L2", "L3");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.WRITE, ""), "A", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);
		
		checkIt(quadrupletIt);
		originalQuadruplet = quadrupletIt.next();
		oracleQuadruplet = new QuadImp(new OPCode<OP, String>(OP.WRITE, ""), "B", "", "");
		isMatch = isMatch(originalQuadruplet, oracleQuadruplet);

		assertTrue(Utilitaires.printErr("Le code 3 adresses genere est incorrect"), isMatch);
	}
	
	/*Utilitaires*/
	private void checkIt(ListIterator<QuadImp> quadrupletIt){
		if(!quadrupletIt.hasNext()){
			assertTrue(Utilitaires.printErr("Il manque un quadruplet en C3A"), false);
			return;
		}
	}

	private void checkIt(Iterator<LinkedList<QuadImp>> listeQuadruplets) {
		if(!listeQuadruplets.hasNext()){
			assertTrue(Utilitaires.printErr("Il manque une etiquette C3A"), false);
			return;
		}
	}

	private boolean isMatch(QuadImp originalQuadruplet, QuadImp oracleQuadruplet){
		boolean isMatch = originalQuadruplet.equals(oracleQuadruplet);
		if (isMatch){
			return true;
		}else{
			assertTrue(Utilitaires.printErr("Le code 3 adresses genere est incorrect :\n"+
					"\""+originalQuadruplet+"\" au lieu de \""+oracleQuadruplet+"\""), isMatch);
			return false;
		}
	}

	private HashMap<String, LinkedList<QuadImp>> getMapEtiquetteQuadruplet3Adresses(String nomProgSansExtension) {
		args[0] = origineFilePath+nomProgSansExtension+".wh";
		args[1] = resultFilePath+nomProgSansExtension+".cs";
		GeneratorAddr tds = GeneratorAddr.getInstance();
		try{
			tds.launchGeneration(args);
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}

		ThreeAddressCode threeAddressCode = tds.getCode3Addresses();
		HashMap<String, LinkedList<QuadImp>> mapEtiquetteQuadruplet3Adresses = threeAddressCode.getCode3Addr();
		return mapEtiquetteQuadruplet3Adresses;
	}

	public void verifNbEtiquette(String nomProgSansExtension) {
		HashMap<String, LinkedList<QuadImp>> mapEtiquetteQuadruplet3Adresses = getMapEtiquetteQuadruplet3Adresses(nomProgSansExtension);
		int nbEtiquette = mapEtiquetteQuadruplet3Adresses.size();

		int nbEtiquetteAttendu = 0;

		Collection<LinkedList<QuadImp>> listeDeListeDeQuadrupletList = mapEtiquetteQuadruplet3Adresses.values();
		for (LinkedList<QuadImp> quadruplets : listeDeListeDeQuadrupletList){
			for (QuadImp quadImp : quadruplets){
				OP codeOP = quadImp.getOperateur().getOpe();
				if (codeOP.equals(OP.FUN)){
					nbEtiquetteAttendu++;
					continue;
				}
				if (codeOP.equals(OP.WHILE)){
					nbEtiquetteAttendu +=2;
					continue;
				}
				if (codeOP.equals(OP.FOR)){
					nbEtiquetteAttendu +=2;
					continue;
				}
				if (codeOP.equals(OP.FOREACH)){
					nbEtiquetteAttendu +=2;
					continue;
				}
				if (codeOP.equals(OP.IF)){
					String arg2 = quadImp.getArg2();
					if (arg2 != null && !arg2.equals("")){
						nbEtiquetteAttendu +=3;
					}else{
						nbEtiquetteAttendu +=2;
					}
					continue;
				}
			}
		}

		assertTrue(Utilitaires.printErr("Le nombre d'étiquette généré est de "+nbEtiquette+" au lieu de "+nbEtiquetteAttendu),
				nbEtiquette == nbEtiquetteAttendu);
	}
}
