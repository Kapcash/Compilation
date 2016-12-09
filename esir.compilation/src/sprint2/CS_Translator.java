package sprint2;

public class CS_Translator {

	private ThreeAddressCode code;
	private StringBuilder stb = new StringBuilder();
	private int k = 0;

	// C#
	private final static String imports = "using System;\nusing System.Collections.Generic;\nusing System.Linq;\nusing System.Text;\nusing System.Threading.Tasks;";
	private final static String projectName = "namespace ProjectCOMP";
	private final static String className = "class Program";
	private final static String mainFunctionName = "static void Main(String[] args)";

	// Utils
	private final static String lAccolade = "{";
	private final static String RAccolade = "}";
	private final static String newLine = "\n";
	private final static String tab = "\t";

	public CS_Translator(ThreeAddressCode code) {
		super();
		this.code = code;
	}

	public void translate() throws CS_TranslatorException {
		write(imports);
		newLine();

		write(projectName); 		
		write(lAccolade);				//Project BEGIN

		rightShift();
		write(className);		
		write(lAccolade);				//Class BEGIN
		rightShift();
		write(mainFunctionName);
		write(lAccolade);
		rightShift();
		//TODO
		leftShift();
		write(RAccolade);
		leftShift();
		write(RAccolade);				//Class END
		
		leftShift();
		write(RAccolade);				//Project END
		
		if(k!=0){
			throw new CS_TranslatorException("Il manque un "+(k<0?"a gauche":"à droite"));
		}
	}

	private void write(String s) {
		tab(k);
		stb.append(s);	
		newLine();
	}

	private void newLine() {
		stb.append(newLine);
	}
	
	private void tab(int j) {
		for(int i =0;i<j;i++){
			tab();
		}
	}
	
	private void tab() {
		stb.append(tab);
	}
	
	private void leftShift(){
		k--;
	}
	
	private void rightShift(){
		k++;
	}

	@Override
	public String toString() {
		return stb.toString();
	}
}
