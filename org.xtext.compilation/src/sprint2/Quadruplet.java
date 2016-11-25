package sprint2;

public class Quadruplet {
	
	String operand;
	
	int addr_dest;
	int addr_ope1;
	int addr_ope2;
	
	public Quadruplet(String oper, int addr1, int addr2, int addr3){
		operand = oper;
		
		addr_dest = addr1;
		addr_ope1 = addr2;
		addr_ope2 = addr3;
	}
}
