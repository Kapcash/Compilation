package prettyPrintTest;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import esir.compilation.ErrorException;
import esir.compilation.generator.Main;
import utilitaires.Constante;
import utilitaires.Utilitaire;

public class PrettyPrintTest{

	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	private static final String origineFilePath = Constante.PATH+ "prettyPrintTest/Fichier_Test_Original/";
	private static final String attendFilePath =  Constante.PATH+ "prettyPrintTest/Fichier_Test_Attendu/";
	private static final String resultFilePath =  Constante.PATH+ "prettyPrintTest/Fichier_Test_Resultat/";
	
	private String cheminFichierEntree;
	private String cheminFichierSortie;
	private String indentAll = "1";
	private String indentFor = "0";
	private String indentWhile = "0";
	private String indentIf = "0";
	private String indentForeach = "0";
	private String indentAff = "0";

	private String[] args = {
			cheminFichierEntree,
			cheminFichierSortie,
			indentAll,
			indentFor,
			indentWhile,
			indentIf,
			indentForeach,
			indentAff};

	private void restoreEnvir(){
		cheminFichierEntree = null;
		cheminFichierSortie = null;
		indentAll = "1";
		indentFor = "0";
		indentWhile = "0";
		indentIf = "0";
		indentForeach = "0";
		indentAff = "0";
	}

	@Test
	public void testDoubleTraitement() throws ErrorException {
		restoreEnvir();
		File fileR1 = null;
		File fileR2 = null;

		// Path
		String fileO1Path = origineFilePath + "Test1.wh";

		String fileR1Path = resultFilePath + "TestDT1.whpp";
		String fileR1RenamePath = resultFilePath + "TestDT1.wh";

		String fileR2Path = resultFilePath + "TestDT2.whpp";

		/*Premier traitement*/
		// On execute le PrettyPrint sur le fichier original "Test1.wh"
		args[0] = fileO1Path;
		args[1] = fileR1Path;
		args[5] = "2";
		Main.main(args);

		// On renomme le fichier pour modifier l'extension et réeffectuer le traitement une deuxième fois
		fileR1 = new File(fileR1Path);
		File fileR1Rename = new File(fileR1RenamePath);

		boolean isRename = fileR1.renameTo(fileR1Rename);
		assertTrue("Le renommage du fichier n'a pas fonctionne", isRename);
		fileR1 = fileR1Rename;

		/*Deuxieme traitement*/
		args[0] = fileR1RenamePath;
		args[1] = fileR2Path;
		args[5] = "2";
		Main.main(args);
		fileR2 = new File(fileR2Path);

		assertTrue("Traitement non effectue", (!fileR1.equals(null) && !fileR2.equals(null)));
		assertTrue("Le double traitement amène des fichiers differents", assertSameFileTest(fileR1.getPath(), fileR2.getPath()));

		boolean isDelete1 = fileR1.delete();
		Utilitaire.assertT(fileR1.getPath() +" n'a pas ete correctement supprime !", isDelete1);
	}

	@Test
	public void testAffect1() throws ErrorException {
		testerPrettyPrint("testAffect1");
	}

	@Test
	public void testAffect2() throws ErrorException{
		testerPrettyPrint("testAffect2");
	}

	@Test
	public void testAffect3() throws ErrorException{
		testerPrettyPrint("testAffect3");
	}

	@Test
	public void testAffect4() throws ErrorException{
		testerPrettyPrint("testAffect4");
	}

	@Test
	public void testAffect5() throws ErrorException{
		testerPrettyPrint("testAffect5");
	}

	@Test
	public void testIf1() throws ErrorException{
		testerPrettyPrint("testIf1");
	}

	@Test
	public void testIf2() throws ErrorException{
		testerPrettyPrint("testIf2");
	}

	@Test
	public void testNop() throws ErrorException{
		testerPrettyPrint("testNop");
	}

	@Test
	public void testStructBase1() throws ErrorException{
		testerPrettyPrint("testStructBase1");
	}

	@Test
	public void testStructBase2() throws ErrorException{
		testerPrettyPrint("testStructBase2");
	}

	@Test
	public void testStructBase3() throws ErrorException{
		testerPrettyPrint("testStructBase3");
	}

	@Test
	public void testWhile1() throws ErrorException{
		testerPrettyPrint("testWhile1");
	}
	
	@Test
	public void testWhile2() throws ErrorException{
		testerPrettyPrint("testWhile2");
	}
	
	@Test
	public void testFor1() throws ErrorException{
		testerPrettyPrint("testFor1");
	}
	
	@Test
	public void testFor2() throws ErrorException{
		testerPrettyPrint("testFor2");
	}
	
	@Test
	public void testCond1() throws ErrorException{
		testerPrettyPrint("testCond1");
	}
	
	@Test
	public void testCond2() throws ErrorException{
		testerPrettyPrint("testCond2");
	}
	
	@Test
	public void testCond3() throws ErrorException{
		testerPrettyPrint("testCond3");
	}
	
	@Test
	public void testCond4() throws ErrorException{
		testerPrettyPrint("testCond4");
	}
	
	@Test
	public void testCond5() throws ErrorException{
		testerPrettyPrint("testCond5");
	}
	
	@Test
	public void testCond6() throws ErrorException{
		testerPrettyPrint("testCond6");
	}
	
	@Test
	public void testCond7() throws ErrorException{
		testerPrettyPrint("testCond7");
	}

	@Test
	public void testOptionAll() throws ErrorException{
		args[2] ="0" ;
		testerPrettyPrint("AllIndentationTest");
	}
	
	@Test
	public void testOptionWhile1() throws ErrorException{
		args[4] ="2" ;
		testerPrettyPrint("WhileIndentationTest1");
	}
	
	@Test
	public void testOptionWhile2() throws ErrorException{
		args[4] ="2" ;
		testerPrettyPrint("WhileIndentationTest2");
	}
	
	@Test
	public void testOptionFor1() throws ErrorException{
		args[3] ="3" ;
		testerPrettyPrint("ForIndentationTest1");
	}
	
	@Test
	public void testOptionFor2() throws ErrorException{
		args[3] ="1" ;
		testerPrettyPrint("ForIndentationTest2");
	}

	@Test
	public void testOptionIf1() throws ErrorException{
		args[5] ="1" ;
		testerPrettyPrint("IfIndentationTest1");
	}
	
	@Test
	public void testOptionIf2() throws ErrorException{
		args[5] ="2" ;
		testerPrettyPrint("IfIndentationTest2");
	}
	
	@Test 
	public void testOptionIf3() throws ErrorException{
		args[5] ="2" ;
		testerPrettyPrint("IfIndentationTest3");
	}
	
	@Test
	public void testOptionForeach1() throws ErrorException{
		args[6] ="3" ;
		testerPrettyPrint("ForeachIndentationTest1");
	}
	
	@Test
	public void testOptionForeach2() throws ErrorException{
		args[6] ="1" ;
		testerPrettyPrint("ForeachIndentationTest2");
	}

	@Test
	public void testOptionAff() throws ErrorException{
		args[7] ="1" ;
		testerPrettyPrint("AffIndentationTest");
	}
	
	//BAD TESTS
	
	@Test
	public void testNoRead() throws ErrorException{
		thrown.expect(ErrorException.class);
		testerPrettyPrint("badTestNoRead1");
	}
	
	@Test
	public void testNoWrite() throws ErrorException{
		thrown.expect(ErrorException.class);
		testerPrettyPrint("badTestNoWrite1");
	}
	
	@Test
	public void testBadIf() throws ErrorException{
		thrown.expect(ErrorException.class);
		testerPrettyPrint("badTestIf1");
	}
	
	@Test
	public void testBadWhile() throws ErrorException{
		thrown.expect(ErrorException.class);
		testerPrettyPrint("badTestWhile1");
	}
	
	@Test
	public void testBadAffect() throws ErrorException{
		thrown.expect(ErrorException.class);
		testerPrettyPrint("badTestAffect1");
	}
	
	@Test
	public void testBadFor() throws ErrorException{
		thrown.expect(ErrorException.class);
		testerPrettyPrint("badTestFor1");
	}

	/*Utilitaire*/
	private void testerPrettyPrint(String nameWithoutExtension) throws ErrorException {
		String pathFichierOriginal = origineFilePath + nameWithoutExtension+ ".wh";

		String pathFichierAttendu = attendFilePath + nameWithoutExtension+ ".whpp";
		String pathFichierResultat = resultFilePath + nameWithoutExtension+ ".whpp";

		File fichierResultat = null;

		/*PrettyPrint*/
		args[0] = pathFichierOriginal;
		args[1] = pathFichierResultat;
		Main.main(args);
		fichierResultat = new File(pathFichierResultat);
		assertTrue("Le fichier "+ pathFichierResultat +" n'a pas ete cree ! \n (Regardez dans la console l'erreur genere !)", fichierResultat.exists());

		assertTrue("Traitement non effectue", (!fichierResultat.equals(null)));
		assertTrue("Les fichiers "+ pathFichierOriginal +"et"+ fichierResultat.getPath() +" sont differents !", 
				assertSameFileTest(fichierResultat.getPath(), pathFichierAttendu));

		boolean isDelete = fichierResultat.delete();
		Utilitaire.assertT(fichierResultat.getPath() +" n'a pas ete correctement supprime !", isDelete);
	}

	public boolean assertSameFileTest(String filepath1, String filepath2) {
		File file1 = new File(filepath1);
		File file2 = new File(filepath2);

		assertTrue("Le fichier numero un n'existe pas", file1.exists());
		assertTrue("Le fichier numero deux n'existe pas", file2.exists());
		assertTrue("Les deux fichier n'ont pas la meme taille", (file1.length() == file2.length()));

		try {
			FileInputStream fIS1 = new FileInputStream(file1);
			FileInputStream fIS2 = new FileInputStream(file2);

			final int BUFF_SIZE = 8;

			byte[] buff1 = new byte[BUFF_SIZE];
			byte[] buff2 = new byte[BUFF_SIZE];

			int resultRead1 = 0;
			int resultRead2 = 0;

			while (((resultRead1 = fIS1.read(buff1)) >= 0)
					&& ((resultRead2 = fIS2.read(buff2)) >= 0)) {

				for (int i = 0 ; i<BUFF_SIZE ; i++){
					Utilitaire.assertT("Les deux fichier sont differents", buff1[i] == buff2[i]);
				}

				buff1 = new byte[BUFF_SIZE];
				buff2 = new byte[BUFF_SIZE];
			}

			fIS1.close();
			fIS2.close();

			Utilitaire.assertT("Les deux fichier n'ont pas la meme taille", ((resultRead1 != -1) || (resultRead2 != -1)));			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}