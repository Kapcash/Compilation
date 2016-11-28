package sprint2;

public class FunDecl {
		
		String nomFun;
		int nbInput;
		int nbOutput;
		String code;
		
		public FunDecl(String oper, int in, int out, String c){
			nomFun = oper;
			
			nbInput = in;
			nbOutput = out;
			code = c;
		}
}

