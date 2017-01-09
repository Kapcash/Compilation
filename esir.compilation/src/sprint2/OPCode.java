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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((etiquette == null) ? 0 : etiquette.hashCode());
		result = prime * result + ((ope == null) ? 0 : ope.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OPCode other = (OPCode) obj;
		if (etiquette == null) {
			if (other.etiquette != null)
				return false;
		} else if (!etiquette.equals(other.etiquette))
			return false;
		if (ope == null) {
			if (other.ope != null)
				return false;
		} else if (!ope.equals(other.ope))
			return false;
		return true;
	}
	
	
	
}
