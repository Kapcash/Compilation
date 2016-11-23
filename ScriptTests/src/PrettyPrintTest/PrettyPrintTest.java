package PrettyPrintTest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;

public class PrettyPrintTest {
	
	@Test
	public void doubleApplicationTest() {
		String  filepath1 = "Fichier_Test_Original/Test1.wh.txt";
		String  filepath2 ="Fichier_Test_Attendu/Test1.wh.txt";

		
		
		assertSameFileTest(filepath1, filepath2);
	}

	/*Utilitaire*/

	public void assertSameFileTest(String filepath1, String filepath2) {
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
	}
	
}
