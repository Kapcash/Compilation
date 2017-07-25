package sprint3;

public class Function {
	
	String name;
	protected String params;
	protected String returns;
	protected StringBuilder body;
	protected int k = 3;
	private final static String newLine = "\n";
	private final static String tab = "\t";

	public Function(String name) {
		this.name = name;
		body = new StringBuilder();
	}

	void write(String s) {
		tab(k);
		body.append(s);
		newLine();
	}
	
	private void tab(int j) {
		for (int i = 0; i < j; i++) {
			tab();
		}
	}

	private void tab() {
		body.append(tab);
	}

	protected void newLine() {
		body.append(newLine);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getReturns() {
		return returns;
	}

	public void setReturns(String returns) {
		this.returns = returns;
	}

	public StringBuilder getBody() {
		return body;
	}

	public void setBody(StringBuilder body) {
		this.body = body;
	}

	void leftShift() {
		k--;
	}

	void rightShift() {
		k++;
	}
}
