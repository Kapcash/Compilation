package sprint2;

public class Quadruplet<O, R, A1, A2> {
	private O operateur;
	private R reponse;
	private A1 arg1;
	private A2 arg2;

	public Quadruplet(O operateur, R reponse, A1 arg1, A2 arg2) {
		super();
		this.operateur = operateur;
		this.reponse = reponse;
		this.arg1 = arg1;
		this.arg2 = arg2;
	}

	public O getOperateur() {
		return operateur;
	}

	public void setOperateur(O operateur) {
		this.operateur = operateur;
	}

	public R getReponse() {
		return reponse;
	}

	public void setReponse(R reponse) {
		this.reponse = reponse;
	}

	public A1 getArg1() {
		return arg1;
	}

	public void setArg1(A1 arg1) {
		this.arg1 = arg1;
	}

	public A2 getArg2() {
		return arg2;
	}

	public void setArg2(A2 arg2) {
		this.arg2 = arg2;
	}
	
	public String getEtiquette(){
		return ((String)((OPCode) operateur).getEtiquette());
	}

	@Override
	public String toString() {
		return "<" + operateur + ", " + reponse + ", " + arg1 + ", " + arg2 + ">";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arg1 == null) ? 0 : arg1.hashCode());
		result = prime * result + ((arg2 == null) ? 0 : arg2.hashCode());
		result = prime * result + ((operateur == null) ? 0 : operateur.hashCode());
		result = prime * result + ((reponse == null) ? 0 : reponse.hashCode());
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
		Quadruplet other = (Quadruplet) obj;
		if (arg1 == null) {
			if (other.arg1 != null)
				return false;
		} else if (!arg1.equals(other.arg1))
			return false;
		if (arg2 == null) {
			if (other.arg2 != null)
				return false;
		} else if (!arg2.equals(other.arg2))
			return false;
		if (operateur == null) {
			if (other.operateur != null)
				return false;
		} else if (!operateur.equals(other.operateur))
			return false;
		if (reponse == null) {
			if (other.reponse != null)
				return false;
		} else if (!reponse.equals(other.reponse))
			return false;
		return true;
	}
}
