package traductionTest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import esir.compilation.generator.ErrorException;
import sprint2.GeneratorAddr;
import sprint2.SymTableException;
import sprint2.ThreeAddressCodeException;
import sprint3.CS_TranslatorException;
import utilitaires.Constante;
import utilitaires.Utilitaire;

public class SchemaDeTraductionTest {
	private static final String origineFilePath = Constante.PATH+ "traductionTest/Fichier_TestSDT_Original/";
	private static final String resultFilePath =  Constante.PATH+ "traductionTest/Fichier_TestSDT_Resultat/";
	private static final String attendFilePath =  Constante.PATH+ "traductionTest/Fichier_TestSDT_Attendu/";
	
	String cheminFichierEntree = null;
	String cheminFichierSortie = null;
	
	String[] args = {cheminFichierEntree, cheminFichierSortie};

	@Test
	public void testDoubleTraitement() throws ErrorException {
		System.out.println(fib(4));
		testerWHC("0_DoubleTest");
	}
	
	
	/*Utilitaire*/
	private void testerWHC(String nameWithoutExtension) throws ErrorException {
		String pathFichierOriginal = origineFilePath + nameWithoutExtension+ ".wh";

		String pathFichierAttendu = attendFilePath + nameWithoutExtension+ ".cs";
		String pathFichierResultat = resultFilePath + nameWithoutExtension+ ".cs";

		File fichierResultat = null;

		args[0] = pathFichierOriginal;
		args[1] = pathFichierResultat;
		
		GeneratorAddr tds = GeneratorAddr.getInstance();
		try{
			tds.launchGeneration(args);
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			if(Constante.DEBUG_TRACE){System.out.println(e.getMessage());}
		}
		
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
	
	public static int fib(int n) 
    {
      if (n < 2) return(n);
      return( fib(n-2) + fib(n-1) );
    }

}
