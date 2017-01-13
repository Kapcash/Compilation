package traductionTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import sprint2.GeneratorAddr;
import sprint2.SymTableException;
import sprint2.ThreeAddressCodeException;
import sprint3.CS_TranslatorException;
import utilitaires.Constante;

public class TestCharges {

	String cheminFichierEntree = null;
	String cheminFichierSortie = null;

	String[] args = { cheminFichierEntree, cheminFichierSortie };

	boolean regenerateFiles = false;
	int nbEssai = 10;

	public long testLargeur(int n){
		args[0] = Constante.PATH+ "traductionTest//Fichier_TestCharge/testChargesLargeur" + n + ".wh";
		args[1] = "";

		if (regenerateFiles)
			generateFileLargeur(n, args[0]);

		long t = System.currentTimeMillis();
		GeneratorAddr generator = GeneratorAddr.getInstance();
		GeneratorAddr.DISPLAY_SYM_TABLE = false;
		GeneratorAddr.DISPLAY_THREE_ADDR_CODE = false;
		GeneratorAddr.DISPLAY_TRANSLATION = false;
		GeneratorAddr.PRINT_TRANSLATION = false;
		try{
			generator.launchGeneration(args);
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}
		generator = null; // Free
		t = System.currentTimeMillis() - t;

		return t;
	}
	
	public long testProfondeur(int n){
		
		args[0] = "testUnitaire/traductionTest//Fichier_TestCharge/testChargesProfondeur" + n + ".wh";
		args[1] = "";

		if (regenerateFiles)
			generateFileProfondeur(n, args[0]);

		long t = System.currentTimeMillis();
		GeneratorAddr generator = GeneratorAddr.getInstance();
		GeneratorAddr.DISPLAY_SYM_TABLE = false;
		GeneratorAddr.DISPLAY_THREE_ADDR_CODE = false;
		GeneratorAddr.DISPLAY_TRANSLATION = false;
		GeneratorAddr.PRINT_TRANSLATION = false;
		try{
			generator.launchGeneration(args);
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}
		generator = null; // Free
		t = System.currentTimeMillis() - t;

		return t;
	}

	
	
	@Test
	public void mainTestLargeur() {		
		testLargeur2(1);
		testLargeur2(1);
		testLargeur2(10);
		testLargeur2(100);
		testLargeur2(1000);
		testLargeur2(10000);
		testLargeur2(100000);
	}

	@Test
	public void mainTestProndeur() {	
		testProfondeur2(1);
		testProfondeur2(1);
		testProfondeur2(10);
		testProfondeur2(100);
		testProfondeur2(1000);
		testProfondeur2(10000);
	}
	
	private void testProfondeur2(int nb) {
		List<Long> list = new ArrayList<Long>();
		for (int i = 0; i < nbEssai; i++) {
			list.add(testProfondeur(nb));
		}
		
		System.out.println("Test profondeur avec "+nb+" etage");
		printResults(nb, list);
	}
	
	private void testLargeur2(int nb) {
		List<Long> list = new ArrayList<Long>();
		for (int i = 0; i < nbEssai; i++) {
			list.add(testLargeur(nb));
		}
		
		System.out.println("Test largeur avec "+nb+" etage");
		printResults(nb, list);
	}

	private void printResults(int nb, List<Long> list) {
		long min = Collections.min(list);
		long max = Collections.max(list);
		long total = 0;
		for (Iterator<Long> iterator = list.iterator(); iterator.hasNext();) {
			total += iterator.next();
		}
		
		System.out.println("Min : "+min+" ms");
		System.out.println("Max : "+max+" ms");
		System.out.println("Avg : "+(total/nbEssai)+" ms");
	}

	private void generateFile(StringBuilder content, String filename) {

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			fw = new FileWriter(filename);
			bw = new BufferedWriter(fw);
			bw.write(content.toString());

			// System.out.println("Done");

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

	private void generateFileProfondeur(int nbBoucles, String filename) {

		StringBuilder content = new StringBuilder();
		content.append("function f0: ");
		// Reads
		content.append("read A ,B ,C%");

		for (int i = 0; i < nbBoucles; i++) {
			// Body
			content.append("while condUn do\n");
		}
		content.append("nop\n");
		for (int i = 0; i < nbBoucles; i++) {
			// Body
			content.append("od\n");
		}
		// Writes
		content.append("%write A ,B");
		content.append("\n");

		generateFile(content, filename);
	}

	private void generateFileLargeur(int nbFonctions, String filename) {

		StringBuilder content = new StringBuilder();

		for (int i = 0; i < nbFonctions; i++) {
			content.append("function f" + i + ": ");
			// Reads
			content.append("read A ,B ,C%");
			// Body
			content.append("while condUn do nop	od");
			// Writes
			content.append("%write A ,B");
			content.append("\n");
		}

		generateFile(content, filename);

	}

}
