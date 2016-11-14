
public class SymbDistrib {
	private static int noTemp =0;
	private static int noLabel = 10;
	
	private static int noLabelPrint = 1;//0 is reserved for %d printf and scanf
	
	 public static Tokatt newTemp(){
		  String name = "T_"+noTemp;
		  Tokatt to = new Tokatt(name, TypeSystem.TypeInteger());
		  noTemp++;
		  return to;
	 }

	 public static Tokatt newLabel(){
		  String name = "L"+noLabel;
		  Tokatt to = new Tokatt(name, TypeSystem.TypeLabel());
		  noLabel++;
		  return to;
	 }
	 
	 //for function name
	 public static Tokatt newLabel(String functionName){
		  Tokatt to = new Tokatt(functionName, TypeSystem.TypeLabel());
		  return to;
	 }
	 
	 //for label of string (print function)
	 public static Tokatt newLabelText(){
		 String name="$LC"+noLabelPrint;
		 noLabelPrint++;
		 Tokatt to = new Tokatt(name, TypeSystem.TypeLabel());
		 return to;
	 }
	 
	 
}
