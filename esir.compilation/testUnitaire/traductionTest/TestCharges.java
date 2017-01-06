package traductionTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

import sprint2.GeneratorAddr;

public class TestCharges {

	String cheminFichierEntree = null;
	String cheminFichierSortie = null;
	
	String[] args = {cheminFichierEntree, cheminFichierSortie};
	
	boolean regenerateFiles = true;
	
	public void test(int n) {
		args[0] ="testUnitaire/traductionTest//Fichier_TestCharge/testCharges"+n+".wh";
		args[1] = "";
		
		if(regenerateFiles)
			generateFile(n, args[0]);
		
		long t = System.currentTimeMillis();
		GeneratorAddr generator = GeneratorAddr.getInstance();
		GeneratorAddr.DISPLAY_SYM_TABLE=false;
		GeneratorAddr.DISPLAY_THREE_ADDR_CODE=false;
		GeneratorAddr.DISPLAY_TRANSLATION=false;
		GeneratorAddr.PRINT_TRANSLATION=false;
		generator.launchGeneration(args);
		generator = null; //Free
		t = System.currentTimeMillis() - t;

		System.out.println(""+ n +" fonctions compilées en "+t+" ms");
	}
	
	@Test
	public void mainTest() {
		GeneratorAddr generator = GeneratorAddr.getInstance();
		generator = null; //Juste pour charger les libs
		test(1);
		test(10);
		test(100);
		test(1000);
		test(10000);
	}

	private  void generateFile(int nbFonctions, String filename) {

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			StringBuilder content = new StringBuilder();
			
			for (int i = 0; i < nbFonctions; i++) {
				content.append("function f"+i+": ");
				//Reads
				content.append("read A ,B ,C%");
				//Body
				content.append("while condUn do nop	od");
				//Writes
				content.append("%write A ,B");
				content.append("\n");
			}

			fw = new FileWriter(filename);
			bw = new BufferedWriter(fw);
			bw.write(content.toString());

			//System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}


}
