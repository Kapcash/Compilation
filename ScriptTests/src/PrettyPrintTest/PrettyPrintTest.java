package PrettyPrintTest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;

public class PrettyPrintTest{
	
	@Test
	public void testDoubleTraitement() {
		
		String  filepath1 = "Fichier_Test_Resultat/TestDT1.whpp";
		String  filepath2 ="Fichier_Test_Resultat/TestDT2.whpp";
		
		try {
			Process p1 = Runtime.getRuntime().exec("whpp Fichier_Test_Original/Test1.wh -o "+ filepath1);
			p1.waitFor();
			
			File tempFile = new File(filepath1+"/Result_output.whpp");
			File rename = new File(filepath1+"/Result_output.wh");

			boolean isRename = tempFile.renameTo(rename);
			assertTrue("Le renommage du fichier n'a pas fonctionne", isRename);
			
			Process p2 = Runtime.getRuntime().exec("whpp "+filepath1+"/Result_output.wh -o Fichier_Test_Resultat/TestDT2.whpp");
			p2.waitFor();
			
		} catch (IOException e) {System.out.println(e.toString());
		} catch (InterruptedException e) {System.out.println(e.toString());
		}	
		
		filepath1 = "Fichier_Test_Resultat/TestDT1.whpp/Result_output.wh";
		filepath2 ="Fichier_Test_Resultat/TestDT2.whpp/Result_output.whpp";
		
		assertTrue("Le double traitement amène des fichiers differents", assertSameFileTest(filepath1, filepath2));
		
		File fileA = new File(filepath1);
		File fileB = new File(filepath2);

		System.out.println(fileA.delete());
		System.out.println(fileB.delete());
	}

	/*Utilitaire*/

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
					assertTrue("Les deux fichier sont differents", buff1[i] == buff2[i]);
				}
	        	
				buff1 = new byte[BUFF_SIZE];
				buff2 = new byte[BUFF_SIZE];
	         }
	        
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
