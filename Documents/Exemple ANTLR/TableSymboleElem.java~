import java.util.*;

class TableSymboleElem {
	private Hashtable<String, Operand3a> table;

	public TableSymboleElem englobante;

	public TableSymboleElem(TableSymboleElem englo, int s) {
		table = new Hashtable<String, Operand3a>(s);
		englobante = englo;
	}

	public Operand3a lookup(String name) {
		Operand3a to;
		to = (Operand3a) table.get(name);
		if ((to == null) && (englobante != null))
			return englobante.lookup(name);
		else
			return to;
	}

	public void Insert(String name, Operand3a t) {
		try {
			table.put(name, t);
		} catch (NullPointerException e) {
			System.out.println("\n Clef nulle!!!");
			System.exit(1);
		}
	}

	public void Dump() {
		for (Enumeration<String> e = table.keys(); e.hasMoreElements();)
			System.out.println(e.nextElement());
		if (englobante != null)
			englobante.Dump();
	}
}
