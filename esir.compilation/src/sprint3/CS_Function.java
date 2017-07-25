package sprint3;

import sprint2.DefFun;
import sprint2.GeneratorAddr;

public class CS_Function extends Function{
	
	private final static String typeName = "Queue<BinTree>";
	private final static String lAccolade = "{";
	private final static String rAccolade = "}";

	public CS_Function(String name) {
		super(name);
		this.params = typeName + " input, " + typeName + " output";
		this.returns = "void";
		write(typeName + " inParams = new " + typeName + "();");
		write(typeName + " outParams = new " + typeName + "();");
		varDeclaration();
	}
	
	protected void varDeclaration(){
		DefFun def = GeneratorAddr.getInstance().getFunList().get(name);
		if(def == null)
			return;
		write("//Here the var used in the while code");
		def.getVars().forEach((key, value) -> {
			write("BinTree " + key + " = new BinTree (\""+key+"\", null, null);");
		});
		write("");
		write("//Here the temp var used by the compiler");
		def.getTempVars().forEach((key) -> {
			write("BinTree " + key + " = new BinTree (\""+key+"\", null, null);");
		});
		write("");
	}

	public void printFunction(Translator translator) throws CS_TranslatorException {
		if (k != 3) {
			throw new CS_TranslatorException("Il manque un " + (k < 0 ? "à gauche" : "à droite"));
		}
		newLine();
		translator.write("private static " + getReturns() + " " + getName() + "(" + getParams() + ")");
		translator.write(lAccolade);
		translator.write2(body.toString());
		translator.write(rAccolade);
	}

}
