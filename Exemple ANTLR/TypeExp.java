import java.util.Vector;

class TypeExp {
	 private String name;
	 private Vector<Type> subtypes;

	 public TypeExp(String n){
		  name = n;
		  subtypes = new Vector<Type>();
	 }

	 public TypeExp(String n, Type t, int dim){
		  name = n;
		  subtypes = new Vector<Type>();
		  subtypes.addElement(t);
	 }

	 public void addSubType(Type t){
		  if (subtypes == null) subtypes = new Vector<Type>();
		  subtypes.addElement(t);
	 }

	 public boolean isCompatible(TypeExp t){
		  if (!name.equals(t.name)) return false;
		  if (subtypes.size()!=t.subtypes.size()) return false;
		  for(int i = 0; i< subtypes.size(); i++){
				Type elem1 = (Type)subtypes.elementAt(i);
				Type elem2 = (Type)t.subtypes.elementAt(i);
				if(!elem1.typeExpression().isCompatible(elem2.typeExpression())) 
					return false;
		  }
		  return true;
	 }
	 
	 public String getName(){
		 return name;
	 }
	
	 public String toString(){
		 int i;
		 String s = "( "+name;
		 if (subtypes.size()>0){
			 for(i = 0; i<subtypes.size()-1;i++)
				 s = s +" "+ subtypes.elementAt(i).toString();
			 s = s+" "+subtypes.elementAt(i).toString()+")";
			 return s;
		 } else {
			 s = s+" )";
			 return s;
		 }
	 }
}
