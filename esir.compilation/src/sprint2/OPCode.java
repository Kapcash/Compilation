package sprint2;

public class OPCode<O,E> {

	private O ope;
	private E etiquette;
	
	public OPCode(O ope, E etiquette) {
		super();
		this.ope = ope;
		this.etiquette = etiquette;
	}

	public O getOpe() {
		return ope;
	}

	public void setOpe(O ope) {
		this.ope = ope;
	}

	public E getEtiquette() {
		return etiquette;
	}

	public void setEtiquette(E etiquette) {
		this.etiquette = etiquette;
	}

	@Override
	public String toString() {
		return ope + " " + etiquette;
	}
	
	
}
