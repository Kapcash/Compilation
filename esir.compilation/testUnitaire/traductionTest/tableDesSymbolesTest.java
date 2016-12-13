package traductionTest;

import static org.junit.Assert.fail;

import org.junit.Test;

import esir.compilation.generator.Main;

public class tableDesSymbolesTest {
	
	String cheminFichierEntree = null;
	String cheminFichierSortie = null;
	String indentAll = null;
	String indentFor = null;
	String indentWhile = null;
	String indentIf = null;
	String indentForeach = null;
	String indentAff = null;
	
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
		indentAll = null;
		indentFor = null;
		indentWhile = null;
		indentIf = null;
		indentForeach = null;
		indentAff = null;
	}

}

