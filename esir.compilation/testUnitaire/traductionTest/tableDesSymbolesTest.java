package traductionTest;

import static org.junit.Assert.fail;

import org.junit.Test;

import esir.compilation.generator.Main;

public class tableDesSymbolesTest {
	
	String cheminFichierEntree = null;
	String cheminFichierSortie = null;
	private String indentAll = "1";
	private String indentFor = "0";
	private String indentWhile = "0";
	private String indentIf = "0";
	private String indentForeach = "0";
	private String indentAff = "0";
	
	String[] args = {cheminFichierEntree,
			cheminFichierSortie,
			indentAll,
			indentFor,
			indentWhile,
			indentIf,
			indentForeach,
			indentAff};

	@Test
	public void test() {
		restoreEnvir();
		cheminFichierEntree = null;
		cheminFichierSortie = null;	
		Main.main(args);
		
		fail("Not yet implemented");
	}
	
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
}

