package traductionTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import sprint2.DefFun;
import sprint2.GeneratorAddr;
import sprint2.SymTableException;
import sprint2.ThreeAddressCodeException;
import sprint3.CS_TranslatorException;
import utilitaires.Constante;
import utilitaires.Utilitaires;

public class TableDesSymbolesTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    
	private static final String origineFilePath = Constante.PATH+ "traductionTest/Fichier_TestTDS_Original/";
	private static final String resultFilePath =  Constante.PATH+ "traductionTest/Fichier_TestTDS_Resultat/";
	private static final String awaitedFilePath = Constante.PATH+ "traductionTest/Fichier_TestTDS_Attendu/";

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
		tds.writeSymTableXML(resultFilePath+"0_NopTest.whxml");

		HashMap<String, DefFun> funList = tds.getFunList();
		DefFun funTest = funList.get("nopTest");
		int nbVar = funTest.getVars().size();
		System.out.println("SIZE : "+tds.getFunList().size());

		assertTrue(Utilitaires.printErr("Le nombre de variable est incorrect. Il est de "+nbVar+" au lieu de 1"), nbVar == 1);
		assertCompareTwoXML(resultFilePath+"0_NopTest.whxml",awaitedFilePath+"0_NopTest_Attendu.whxml");
	}

	@Test
	public void nbInputTest() {
		args[0] = origineFilePath+"1_nbInputNbOutputTest.wh";
		args[1] = resultFilePath+"1_nbInputNbOutputTest.cs";

		GeneratorAddr tds = GeneratorAddr.getInstance();
		try{
			tds.launchGeneration(args);
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}

		HashMap<String, DefFun> funList = tds.getFunList();
		DefFun funTest = funList.get("nbInputOutputTest");
		int nbInput = funTest.getIn();
		System.out.println("SIZE : "+tds.getFunList().size());

		assertTrue(Utilitaires.printErr("Le nombre d'entrer est incorrect. Il est de "+nbInput+" au lieu de 4"), nbInput == 4);
	}

	@Test
	public void nbOutputTest() {
		args[0] = origineFilePath+"1_nbInputNbOutputTest.wh";
		args[1] = resultFilePath+"1_nbInputNbOutputTest.cs";

		GeneratorAddr tds = GeneratorAddr.getInstance();
		try{
			tds.launchGeneration(args);
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}

		HashMap<String, DefFun> funList = tds.getFunList();
		DefFun funTest = funList.get("nbInputOutputTest");
		int nbOutput = funTest.getOut();
		System.out.println("SIZE : "+tds.getFunList().size());

		assertTrue(Utilitaires.printErr("Le nombre de sortie est incorrect. Il est de "+nbOutput+" au lieu de 3"), nbOutput == 3);
	}

	@Test
	public void doubleInputTest() throws SymTableException, ThreeAddressCodeException, CS_TranslatorException{
		thrown.expect(SymTableException.class);
		thrown.expectMessage("[SYMTABLE ERROR] : Function 'doubleInputTest' contains duplicates variables in Read statement!");
		args[0] = origineFilePath+"2_doubleInputTest.wh";
		args[1] = resultFilePath+"2_doubleInputTest.cs";

		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
		System.out.println("SIZE : "+tds.getFunList().size());

	}

	@Test
	public void doubleOutputTest() throws SymTableException, ThreeAddressCodeException, CS_TranslatorException{ 
		thrown.expect(SymTableException.class);
		thrown.expectMessage("[SYMTABLE ERROR] : Function 'doubleOutputTest' contains duplicates variables in Write statement!");
		
		args[0] = origineFilePath+"3_doubleOutputTest.wh";
		args[1] = resultFilePath+"3_doubleOutputTest.cs";

		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
		System.out.println("SIZE : "+tds.getFunList().size());

		assertFalse(Utilitaires.printErr("Le test ne devrait pas passer"), true);
	}

	@Test
	public void nbFunctionTest() {
		args[0] = origineFilePath+"4_nbFunctionTest.wh";
		args[1] = resultFilePath+"4_nbFunctionTest.cs";

		GeneratorAddr tds = GeneratorAddr.getInstance();
		try{
			tds.launchGeneration(args);
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}

		HashMap<String, DefFun> funList = tds.getFunList();
		int nbFunction = funList.size();
		System.out.println("SIZE : "+tds.getFunList().size());
		assertTrue(Utilitaires.printErr("Le nombre de function est incorrect. Il est de "+nbFunction+" au lieu de 10"), nbFunction == 10);
	}

	@Test
	public void valeurVariable1Test() {
		args[0] = origineFilePath+"5_variableTest.wh";
		args[1] = resultFilePath+"5_variableTest.cs";

		GeneratorAddr tds = GeneratorAddr.getInstance();
		try{
			tds.launchGeneration(args);
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}

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
		try{
			tds.launchGeneration(args);
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}
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
		try{
			tds.launchGeneration(args);
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}
		tds.writeSymTableXML(resultFilePath+"6_affMultiple.whxml");

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

		assertCompareTwoXML(resultFilePath+"6_affMultiple.whxml", awaitedFilePath+ "6_affMultiple_Attendu.whxml");
	}

	@Test
	public void valeurVariableWithBoucleWhileTest() {
		args[0] = origineFilePath+"7_boucleWhileTest.wh";
		args[1] = resultFilePath+"7_boucleWhileTest.cs";

		GeneratorAddr tds = GeneratorAddr.getInstance();
		try{
			tds.launchGeneration(args);
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}

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
	public void multipleFunctions() {
		args[0] = origineFilePath+"8_multipleFunctions.wh";
		args[1] = resultFilePath+"8_multipleFunctions.cs";
		
		GeneratorAddr tds = GeneratorAddr.getInstance();
		try{
			tds.launchGeneration(args);
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}
		tds.writeSymTableXML(resultFilePath+"8_multipleFunctions.whxml");
		
		int nbFunctions = tds.getFunList().size();
		assertTrue("Le nombre de fonction est de "+nbFunctions+" et devrait etre de 3.",nbFunctions == 3);
		
		assertCompareTwoXML(resultFilePath+"8_multipleFunctions.whxml", awaitedFilePath+"8_multipleFunctions_Attendu.whxml");
	}

	@Test
	public void callFunctionTest() {
		args[0] = origineFilePath+"9_callFunction.wh";
		args[1] = resultFilePath+"9_callFunction.cs";

		GeneratorAddr tds = GeneratorAddr.getInstance();
		try{
			tds.launchGeneration(args);
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}
		tds.writeSymTableXML(resultFilePath+"9_callFunction.whxml");
		
		DefFun def = tds.getFunList().get("callFunction");
		assertTrue("L'appel a la fonction f1 n'a pas ete ajoute a la table des symboles de \"callFunction\".",def.getCalls().containsKey("f1"));

		assertCompareTwoXML(resultFilePath+"9_callFunction.whxml", awaitedFilePath+"9_callFunction_Attendu.whxml");
	}
	
	@Test
	public void newVarInAffTest() {
		args[0] = origineFilePath+"10_newVarInAff.wh";
		args[1] = resultFilePath+"10_newVarInAff.cs";

		GeneratorAddr tds = GeneratorAddr.getInstance();
		try{
			tds.launchGeneration(args);
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}
		tds.writeSymTableXML(resultFilePath+"10_newVarInAff.whxml");
		
		DefFun def = tds.getFunList().get("newVarInAff");
		assertTrue("La variable B n'est pas ajoutee a la table des symboles.",def.alreadyExisting("B"));
	}
	
	@Test
	public void symbolesGlobalTest() {
		args[0] = origineFilePath+"11_symboleGlobal.wh";
		args[1] = resultFilePath+"11_symboleGlobal.cs";
		
		GeneratorAddr tds = GeneratorAddr.getInstance();
		try{
			tds.launchGeneration(args);
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}
		
		HashMap<String, String> symboles = tds.getSymbs();
		
		assertTrue("La variable globale \"global\" n'est pas presente dans la table des symboles", symboles.containsKey("global"));
	}
	
	@Test
	public void checkAffectationsMethodTest1(){
		args[0] = origineFilePath+"12_affCall2.wh";
		args[1] = resultFilePath+"12_affCall2.cs";
		
		GeneratorAddr tds = GeneratorAddr.getInstance();
		try{
			tds.launchGeneration(args);
			assertTrue(true); //Si aucune exception -> test OK
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void checkAffectationsMethodTest2(){
		args[0] = origineFilePath+"13_affCall.wh";
		args[1] = resultFilePath+"13_affCall.cs";
		
		GeneratorAddr tds = GeneratorAddr.getInstance();
		try{
			tds.launchGeneration(args);
			assertTrue(true); //Si aucune exception -> test OK
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void checkAffectationsMethodTestTooMuchLeft(){
		args[0] = origineFilePath+"14_affCallTooMuchLeft.wh";
		args[1] = resultFilePath+"14_affCallTooMuchLeft.cs";
		
		GeneratorAddr tds = GeneratorAddr.getInstance();
		try{
			tds.launchGeneration(args);
			assertTrue(true); //Si aucune exception -> test OK
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}
	}

	//BAD TESTS
	

	@Test
	public void BADcheckAffectationMethodTest2() throws SymTableException, ThreeAddressCodeException, CS_TranslatorException{
		thrown.expect(SymTableException.class);
		thrown.expectMessage("[SYMTABLE ERROR] : There is 1 inputs but 2 outputs in this affectation.");
		args[0] = origineFilePath+"BAD_2_affCall.wh";
		args[1] = resultFilePath+"BAD_2_affCall.cs";
		
		GeneratorAddr tds = GeneratorAddr.getInstance();
		tds.launchGeneration(args);
	}
	
	
	
// UTILS //
	
	/**
	 * Launch a test to check if two .whxml files are equals
	 * @param path1 The path to the first .whxml file to compare
	 * @param path2 The path to the second .whxml file to compare
	 */
	private void assertCompareTwoXML(String path1, String path2){
		File f1 = new File(path1);
		File f2 = new File(path2);
		assertTrue("Le fichier "+path1+" n'existe pas.",f1.exists());
		assertTrue("Le fichier "+path2+" n'existe pas.",f2.exists());
		
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc1 = builder.parse(f1);
			
			DocumentBuilderFactory factory2 = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder2 = factory2.newDocumentBuilder();
			Document doc2 = builder.parse(f2);

			Element root1 = doc1.getDocumentElement(); //<tds> </tds>
			Element root2 = doc2.getDocumentElement();
			
			//Checking symboles
			NodeList symbs1 = root1.getElementsByTagName("sym"); //Getting all <function>
			NodeList symbs2 = root2.getElementsByTagName("sym"); //Getting all <function>
			assertTrue("Les fichiers n'ont pas le meme nombre de symboles",symbs1.getLength() == symbs2.getLength());
			
			for(int symbIndex=0; symbIndex < symbs1.getLength();symbIndex++){
				boolean sameSymb = false;
				String sym1 = ((Element) symbs1.item(symbIndex)).getTextContent();
				for(int symbIndex2=0; symbIndex2 < symbs2.getLength();symbIndex2++){
					String sym2 = ((Element) symbs2.item(symbIndex2)).getTextContent();
					if(sym1.equals(sym2)) sameSymb = true;
				}
				assertTrue("Les symboles ne sont pas les memes.",sameSymb);
			}
			
			//Checking functions
			NodeList functions1 = root1.getElementsByTagName("function"); //Getting all <function>
			NodeList functions2 = root2.getElementsByTagName("function"); //Getting all <function>
			assertTrue("Les fichiers n'ont pas le meme nombre de fonctions",functions1.getLength() == functions2.getLength());
				//Checking each function
			for(int tmp = 0; tmp < functions1.getLength();tmp++){
				Node node1 = functions1.item(tmp);
				Node node2 = null;
				//Checking function name
				String funName1 = ((Element) node1).getElementsByTagName("name").item(0).getTextContent();
				String funName2 = null;
				boolean sameFunName = false;
				//Iterate over the second file to find (eventually) the same function node
				for(int tmp2 = 0; (tmp2 < functions2.getLength()) && !sameFunName ;tmp2++){
					node2 = functions2.item(tmp2);
					funName2 = ((Element) node2).getElementsByTagName("name").item(0).getTextContent();
					if(funName1.equals(funName2)) sameFunName = true;
					//If a same node if found, the following tests will be with node1's function = node2's function
				}
				//If there is no node with the same function name -> fail
				assertTrue("Deux fonctions n'ont pas le meme nom : "+funName1, sameFunName);
				
				NodeList vars1 = ((Element) node1).getElementsByTagName("var"); //Getting <var>
				NodeList vars2 = ((Element) node2).getElementsByTagName("var");
				assertTrue("Il n'y a pas le meme nombre de variables pour la fonction "+funName1,vars1.getLength() == vars2.getLength());
				for(int varIndex = 0; varIndex < vars1.getLength();varIndex++){
					boolean sameVarsName = false;
					Node varNode1 = vars1.item(varIndex);
					//Checking vars name
					String varName1 = ((Element) varNode1).getElementsByTagName("vname").item(0).getTextContent(); //Writing vars names
					//Iterate through the vars of the second file to see if there is a same as varName1
					for(int varIndex2 = 0; varIndex2 < vars2.getLength();varIndex2++){
						String varName2 = ((Element) vars2.item(varIndex2)).getElementsByTagName("vname").item(0).getTextContent(); //Writing vars names
						if(varName1.equals(varName2)) sameVarsName = true;
					}
					assertTrue("Les variables n'ont pas le meme nom : "+varName1, sameVarsName);
					//Checking vars value
					boolean sameVarsValue = false;
					//Iterate through the vars of the second file to see if there is a same as varValue1
					String varValue1 = ((Element) varNode1).getElementsByTagName("value").item(0).getTextContent(); //Writing vars names
					for(int varIndex2 = 0; varIndex2 < vars2.getLength();varIndex2++){
						String varValue2 = ((Element) vars2.item(varIndex2)).getElementsByTagName("value").item(0).getTextContent(); //Writing vars names
						if(varValue1.equals(varValue2)) sameVarsValue = true;
					}
					assertTrue("Les variables n'ont pas les mêmes valeurs : "+varValue1, sameVarsValue);
				}
				
				//Checking calls
				NodeList calls1 = ((Element) node1).getElementsByTagName("f");
				NodeList calls2 = ((Element) node2).getElementsByTagName("f");
				assertTrue("Le nombre d'appels de fonctions ne sont pas les memes.",calls1.getLength() == calls2.getLength());
				
				for(int callIndex = 0; callIndex < calls1.getLength(); callIndex++){
					boolean sameCalls = false;
					String callValue1 = ((Element) calls1.item(callIndex)).getTextContent();
					//Iterate through the calls of the second file to see if there is a same as callValue1
					for(int callIndex2 = 0; callIndex2 < calls2.getLength(); callIndex2++){
						String callValue2 = ((Element) calls2.item(callIndex2)).getTextContent();
						if(callValue1.equals(callValue2)) sameCalls = true;
					}
					assertTrue("Les functions appellees ne sont pas les memes : "+callValue1, sameCalls);
				}
			}
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}