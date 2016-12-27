package traductionTest;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import esir.compilation.whileComp.Lexpr;
import sprint2.DefFun;
import sprint2.GeneratorAddr;
import utilitaires.Utilitaires;

public class TableDesSymbolesTest {
	
	private static final String origineFilePath = "testUnitaire/traductionTest/Fichier_TestTDS_Original/";
	private static final String resultFilePath = "testUnitaire/traductionTest/Fichier_TestTDS_Resultat/";
	
	String cheminFichierEntree = null;
	String cheminFichierSortie = null;
	
	String[] args = {cheminFichierEntree, cheminFichierSortie};
	
	@Test
	public void nopTest() {
		args[0] = origineFilePath+"0_NopTest.wh";
		args[1] = resultFilePath+"0_NopTest.cs";
		
		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
		
		HashMap<String, DefFun> funList = tds.getFunList();
		DefFun funTest = funList.get("nbInputOutputTest");
		int nbVar = funTest.getVars().size();

		assertTrue(Utilitaires.printErr("Le nombre de variable est incorrect. Il est de "+nbVar+" au lieu de 1"), nbVar == 1);
	}
	
	@Test
	public void nbInputTest() {
		args[0] = origineFilePath+"1_nbInputNbOutputTest.wh";
		args[1] = resultFilePath+"1_nbInputNbOutputTest.cs";
		
		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
		
		HashMap<String, DefFun> funList = tds.getFunList();
		DefFun funTest = funList.get("nbInputOutputTest");
		int nbInput = funTest.getIn();

		assertTrue(Utilitaires.printErr("Le nombre d'entrer est incorrect. Il est de "+nbInput+" au lieu de 4"), nbInput == 4);
	}
	
	@Test
	public void nbOutputTest() {
		args[0] = origineFilePath+"1_nbInputNbOutputTest.wh";
		args[1] = resultFilePath+"1_nbInputNbOutputTest.cs";
		
		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
		
		HashMap<String, DefFun> funList = tds.getFunList();
		DefFun funTest = funList.get("nbInputOutputTest");
		int nbOutput = funTest.getOut();

		assertTrue(Utilitaires.printErr("Le nombre de sortie est incorrect. Il est de "+nbOutput+" au lieu de 3"), nbOutput == 3);
	}
	
	@Test
	public void doubleInputTest() { // TODO : regarder la pertinence du test et du message d'erreur
		args[0] = origineFilePath+"2_doubleInputTest.wh";
		args[1] = resultFilePath+"2_doubleInputTest.cs";
		
		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
		
		HashMap<String, DefFun> funList = tds.getFunList();
		DefFun funTest = funList.get("doubleInputTest");
		int nbInput = funTest.getIn();

		assertFalse(Utilitaires.printErr("Le test ne devrait pas passer"), true);
	}
	
	@Test
	public void doubleOutputTest() { // TODO : regarder la pertinence du test et du message d'erreur
		args[0] = origineFilePath+"3_doubleOutputTest.wh";
		args[1] = resultFilePath+"3_doubleOutputTest.cs";
		
		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
		
		HashMap<String, DefFun> funList = tds.getFunList();
		DefFun funTest = funList.get("doubleOutputTest");
		int nbOutput = funTest.getOut();

		assertFalse(Utilitaires.printErr("Le test ne devrait pas passer"), true);
	}
	
	@Test
	public void nbFunctionTest() {
		args[0] = origineFilePath+"4_nbFunctionTest.wh";
		args[1] = resultFilePath+"4_nbFunctionTest.cs";
		
		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
		
		HashMap<String, DefFun> funList = tds.getFunList();
		int nbFunction = funList.size();

		assertTrue(Utilitaires.printErr("Le nombre de function est incorrect. Il est de "+nbFunction+" au lieu de 10"), nbFunction == 10);
	}
	
	@Test
	public void valeurVariable1Test() {
		args[0] = origineFilePath+"5_variableTest.wh";
		args[1] = resultFilePath+"5_variableTest.cs";
		
		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
		
		HashMap<String, DefFun> funList = tds.getFunList();
		DefFun funVariable1Test = funList.get("variable1Test");
		HashMap<String, Integer> variables1 = funVariable1Test.getVars();
		Integer nbA = variables1.get("A");
		
		assertTrue(Utilitaires.printErr("Le nombre d'occurence de A est incorrect. Il est de "+nbA+" au lieu de 3"), nbA != null && nbA == 3);
	}
	
	@Test
	public void valeurVariable2Test() {
		args[0] = origineFilePath+"5_variableTest.wh";
		args[1] = resultFilePath+"5_variableTest.cs";
		
		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
		
		HashMap<String, DefFun> funList = tds.getFunList();
		DefFun funVariable1Test = funList.get("variable2Test");
		HashMap<String, Integer> variables2 = funVariable1Test.getVars();
		Integer nbA = variables2.get("A");
		Integer nbB = variables2.get("B");
		Integer nbC = variables2.get("C");
		
		assertTrue(Utilitaires.printErr("Le nombre d'occurence de A est incorrect. Il est de "+nbA+" au lieu de 5"), nbA != null && nbA == 5);
		assertTrue(Utilitaires.printErr("Le nombre d'occurence de B est incorrect. Il est de "+nbB+" au lieu de 4"), nbB != null && nbB == 4);
		assertTrue(Utilitaires.printErr("Le nombre d'occurence de C est incorrect. Il est de "+nbC+" au lieu de 2"), nbC != null && nbC == 2);
	}
	
	@Test
	public void valeurVariableWithAffectMultipleTest() {
		args[0] = origineFilePath+"6_affMultipleTest.wh";
		args[1] = resultFilePath+"6_affMultipleTest.cs";
		
		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
		
		HashMap<String, DefFun> funList = tds.getFunList();
		DefFun funVariable1Test = funList.get("affMultiple");
		HashMap<String, Integer> variablesWithAffectMultiple = funVariable1Test.getVars();
		Integer nbA = variablesWithAffectMultiple.get("A");
		Integer nbB = variablesWithAffectMultiple.get("B");
		Integer nbC = variablesWithAffectMultiple.get("C");
		Integer nbD = variablesWithAffectMultiple.get("D");
		
		assertTrue(Utilitaires.printErr("Le nombre d'occurence de A est incorrect. Il est de "+nbA+" au lieu de 3"), nbA != null && nbA == 3);
		assertTrue(Utilitaires.printErr("Le nombre d'occurence de B est incorrect. Il est de "+nbB+" au lieu de 2"), nbB != null && nbB == 2);
		assertTrue(Utilitaires.printErr("Le nombre d'occurence de C est incorrect. Il est de "+nbC+" au lieu de 2"), nbC != null && nbC == 2);
		assertTrue(Utilitaires.printErr("Le nombre d'occurence de D est incorrect. Il est de "+nbD+" au lieu de 2"), nbD != null && nbD == 2);
	}
	
	@Test
	public void valeurVariableWithBoucleWhileTest() {
		args[0] = origineFilePath+"7_boucleWhileTest.wh";
		args[1] = resultFilePath+"7_boucleWhileTest.cs";
		
		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
		
		HashMap<String, DefFun> funList = tds.getFunList();
		DefFun funVariable1Test = funList.get("boucleWhileTest");
		HashMap<String, Integer> variablesWithBoucleWhileTest = funVariable1Test.getVars();
		Integer nbA = variablesWithBoucleWhileTest.get("A");
		Integer nbB = variablesWithBoucleWhileTest.get("B");
		Integer nbC = variablesWithBoucleWhileTest.get("C");
		Integer nbD = variablesWithBoucleWhileTest.get("D");
		
		assertTrue(Utilitaires.printErr("Le nombre d'occurence de A est incorrect. Il est de "+nbA+" au lieu de 3"), nbA != null && nbA == 3);
		assertTrue(Utilitaires.printErr("Le nombre d'occurence de B est incorrect. Il est de "+nbB+" au lieu de 2"), nbB != null && nbB == 2);
		assertTrue(Utilitaires.printErr("Le nombre d'occurence de C est incorrect. Il est de "+nbC+" au lieu de 3"), nbC != null && nbC == 3);
		assertTrue(Utilitaires.printErr("Le nombre d'occurence de D est incorrect. Il est de "+nbD+" au lieu de 2"), nbD != null && nbD == 2);
	}
	
	@Test
	public void symbolesGlobalTest() {
		args[0] = origineFilePath+"8_symbolesTest.wh";
		args[1] = resultFilePath+"8_symbolesTest.cs";
		
		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
		
		HashMap<String, String> symboles = tds.getSymbs();
		String varGlobal = symboles.get("global");
		
		assertTrue(Utilitaires.printErr("La variable global \"global\" n'est pas presente dans la table des symboles"), varGlobal!=null);
	}
	
	@Test
	public void symbolesLocalTest() {
		args[0] = origineFilePath+"8_symbolesTest.wh";
		args[1] = resultFilePath+"8_symbolesTest.cs";
		
		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
		
		HashMap<String, DefFun> funList = tds.getFunList();
		DefFun funSymboleLocalTest = funList.get("symboleLocalTest");
		HashMap<String, Lexpr> calls = funSymboleLocalTest.getCalls();
		String varLocal = calls.get("symboleGlobalTest").toString();
		
		assertTrue(Utilitaires.printErr("Le symbole local \"symboleGlobalTest\" n'est pas present dans la table des symboles"), varLocal!=null);
	}
}