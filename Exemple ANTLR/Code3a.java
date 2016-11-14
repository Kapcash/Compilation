import java.util.Vector;

public class Code3a {
	private static boolean no_error = true;
	 protected Vector<Inst3a> the_code;
	 protected Vector<Operand3a> the_data;

	 public Code3a (){
		  the_code = new Vector<Inst3a>();
		  the_data = new Vector<Operand3a>();
	 }

	
	 public Code3a(Inst3a i){
		  the_code = new Vector<Inst3a>();
		  the_data = new Vector<Operand3a>();
		  the_code.addElement(i);
	 }

	 public void append( Code3a c)
    {
		  if (c!=null){
				the_code.addAll(c.the_code);
				the_data.addAll(c.the_data);
		  }
    }
	 
	 public void appendData(Operand3a dat){
		 the_data.addElement(dat);
	 }

	 public void append(Inst3a inst){
		  the_code.addElement(inst);
	 }
	 
	 public static void setError(){
		 no_error = false;
	 }
	 
	 public Vector<Inst3a> getCode(){
		 return the_code;
	 }
	 
	/**
	 * If there is no error, print the 3A code 
	 *
	 */


     public void print(){
		  int i;
		  for(i=0; i<the_code.size(); i++){
			((Inst3a) the_code.elementAt(i)).print();
		  }
			
		  System.out.println("============================");
		  String t;
		  for(i=0; i<the_data.size(); i++) {
		    t = ((Operand3a) the_data.elementAt(i)).getName3a() ;
			System.out.print( t + ": \"");

			t=((Operand3a) the_data.elementAt(i)).getChain();
			for( int j = 0 ;  j<t.length(); j++ ){
	    	  if( t.charAt(j) == '\\' ){
	    		  j++;
	    		  switch( t.charAt(j) ){
	    		  	case 'n':      
	    		  		System.out.print("\\"+"n") ;
	    		  		break ;
	    		  	case 't':      
		    		    System.out.print("\\"+"t") ;
		    		    break ;
	    		  	case '\"':
	    		  		System.out.print("\"");
	    		  		break ;
	    		  }
	    	  }
	    	  else{
	    		  System.out.print(t.charAt(j));
	    	  }
	        }
			System.out.print("\"\n");
		  }
		}

}
