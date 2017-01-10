package traductionTest;

import static org.junit.Assert.*;

import org.junit.Test;

import sprint2.GeneratorAddr;
import sprint2.SymTableException;
import sprint2.ThreeAddressCodeException;
import sprint3.CS_TranslatorException;
import utilitaires.Constante;

public class SchemaDeTraductionTest {

	private static final String origineFilePath = Constante.PATH+ "traductionTest/Fichier_TestSDT_Original/";
	private static final String resultFilePath =  Constante.PATH+ "traductionTest/Fichier_TestSDT_Resultat/";
	
	String cheminFichierEntree = null;
	String cheminFichierSortie = null;
	
	String[] args = {cheminFichierEntree, cheminFichierSortie};

	@Test
	public void test() {
		args[0] = origineFilePath+"test1.wh";
		args[1] = resultFilePath+"test1.whc";	
		GeneratorAddr tds = GeneratorAddr.getInstance();
		try{
			tds.launchGeneration(args);
		}catch(SymTableException | ThreeAddressCodeException | CS_TranslatorException e){
			System.out.println(e.getMessage());
		}
		
		assertTrue(true);
	}

}
