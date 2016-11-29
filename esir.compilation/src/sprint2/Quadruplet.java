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

	@Override
	public String toString() {
		return "<" + operateur + ", " + reponse + ", " + arg1 + ", " + arg2 + ">";
	}

}
