package traductionTest;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
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

import esir.compilation.generator.ErrorException;
import sprint2.DefFun;
import sprint2.GeneratorAddr;
import sprint2.SymTableException;
import sprint2.ThreeAddressCodeException;
import sprint3.CS_TranslatorException;
import utilitaires.Constante;
import utilitaires.Utilitaire;

public class ExecutionTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    
	private static final String origineFilePath = Constante.PATH+ "traductionTest/Fichier_TestE_Original/";
	private static final String resultFilePath =  Constante.PATH+ "traductionTest/Fichier_TestE_Resultat/";

	String cheminFichierEntree = null;
	String cheminFichierSortie = null;
	
	String[] args = {cheminFichierEntree, cheminFichierSortie};

	@Test
	public void testExemple() throws ErrorException {
		testerExecWHC("0_isNotZero");
	}
	
	
	/*Utilitaire*/
	private void testerExecWHC(String nameWithoutExtension) throws ErrorException {
		String pathFichierOriginal = origineFilePath + nameWithoutExtension+ ".wh";

		//String pathFichierAttendu = attendFilePath + nameWithoutExtension+ ".cs"; TODO : A SUPPRIMER OU DECOMMENTER
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
//		assertTrue("Les fichiers "+ pathFichierOriginal +"et"+ fichierResultat.getPath() +" sont differents !", //TODO : A SUPPRIMER OU DECOMMENTER
//				assertSameFileTest(fichierResultat.getPath(), pathFichierAttendu));

		try {
			System.out.println(Runtime.getRuntime().exec("java -jar whc.jar "+ pathFichierOriginal + " " + pathFichierResultat));
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		//Utilitaire.assertT("", );
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