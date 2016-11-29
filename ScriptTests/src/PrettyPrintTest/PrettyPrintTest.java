package PrettyPrintTest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;

public class PrettyPrintTest{

	private static final String origineFilePath = "Fichier_Test_Original/";
	private static final String attendFilePath = "Fichier_Test_Attendu/";
	private static final String resultFilePath = "Fichier_Test_Resultat/";

	@Test
	public void testDoubleTraitement() {

		File fileR1 = null;
		File fileR2 = null;

		try {
			// Path
			String fileO1Path = origineFilePath + "Test1.wh";

			String fileR1Path = resultFilePath + "TestDT1.whpp";
			String fileR1RenamePath = resultFilePath + "TestDT1.wh";

			String fileR2Path = resultFilePath + "TestDT2.whpp";

			/*Premier traitement*/
			// On execute le PrettyPrint sur le fichier original "Test1.wh"
			Process p1 = Runtime.getRuntime().exec("whpp "+fileO1Path+" -o "+ fileR1Path);
			// On attend que le traitement soit réalisé
			p1.waitFor();
			// On renomme le fichier pour modifier l'extension et réeffectuer le traitement une deuxième fois
			fileR1 = new File(fileR1Path);
			File fileR1Rename = new File(fileR1RenamePath);

			boolean isRename = fileR1.renameTo(fileR1Rename);
			assertTrue("Le renommage du fichier n'a pas fonctionne", isRename);
			fileR1 = fileR1Rename;

			/*Deuxieme traitement*/
			Process p2 = Runtime.getRuntime().exec("whpp "+fileR1.getPath()+" -o "+fileR2Path);
			p2.waitFor();
			fileR2 = new File(fileR2Path);

		} catch (IOException e) {System.out.println(e.toString());
		} catch (InterruptedException e) {System.out.println(e.toString());
		}	

		assertTrue("Traitement non effectue", (!fileR1.equals(null) && !fileR2.equals(null)));
		assertTrue("Le double traitement amène des fichiers differents", assertSameFileTest(fileR1.getPath(), fileR2.getPath()));

		boolean isDelete1 = fileR1.delete();
		assertTrue(fileR1.getPath() +" n'a pas ete correctement supprime !", isDelete1);
		boolean isDelete2 = fileR2.delete();
		assertTrue(fileR2.getPath() +" n'a pas ete correctement supprime !", isDelete2);
	}

	/*@Test
	public void testExemple() {
		testerPrettyPrint("name");
	}*/

	/*Utilitaire*/

	private void testerPrettyPrint(String nameWithoutExtension) {
		String pathFichierOriginal = origineFilePath + nameWithoutExtension+ ".wh";

		String pathFichierAttendu = attendFilePath + nameWithoutExtension+ ".whpp";
		String pathFichierResultat = resultFilePath + nameWithoutExtension+ ".whpp";

		File fichierResultat = null;

		try {
			/*PrettyPrint*/
			Process p1 = Runtime.getRuntime().exec("whpp "+pathFichierOriginal+" -o "+ pathFichierResultat);
			p1.waitFor();
			fichierResultat = new File(pathFichierResultat);
			assertTrue("Le fichier "+ pathFichierResultat +"n'a pas ete creer !", fichierResultat.exists());

		} catch (IOException e) {System.out.println(e.toString());
		} catch (InterruptedException e) {System.out.println(e.toString());
		}	

		assertTrue("Traitement non effectue", (!fichierResultat.equals(null)));
		assertTrue("Les fichiers "+ pathFichierOriginal +"et"+ fichierResultat.getPath() +" sont differents !", 
				assertSameFileTest(fichierResultat.getPath(), pathFichierAttendu));

		boolean isDelete = fichierResultat.delete();
		assertTrue(fichierResultat.getPath() +" n'a pas ete correctement supprime !", isDelete);
	}

	public boolean assertSameFileTest(String filepath1, String filepath2) {
		File file1 = new File(filepath1);
		System.out.println(file1);
		File file2 = new File(filepath2);
		System.out.println(file2);

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
					assertTrue("Les deux fichier sont differents", buff1[i] == buff2[i]);
				}

				buff1 = new byte[BUFF_SIZE];
				buff2 = new byte[BUFF_SIZE];
			}

			fIS1.close();
			fIS2.close();

			assertTrue("Les deux fichier n'ont pas la meme taille", ((resultRead1 != -1) || (resultRead2 != -1)));			
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
