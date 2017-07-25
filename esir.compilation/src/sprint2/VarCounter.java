package sprint2;

public class VarCounter {
	private int readCounter;
	private int writeCounter;
	
	public VarCounter(int readCounter, int writeCounter) {
		super();
		this.readCounter = readCounter;
		this.writeCounter = writeCounter;
	}
	
	public int getReadCounter() {
		return readCounter;
	}

	public int getWriteCounter() {
		return writeCounter;
	}

	public VarCounter incrRC(){
		this.readCounter++;
		return this;
	}
	
	public VarCounter incrWC(){
		this.writeCounter++;
		return this;
	}
	
	public Integer total(){
		return this.writeCounter+this.readCounter;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("(");
		builder.append(readCounter);
		builder.append(", ");
		builder.append(writeCounter);
		builder.append(")");
		return builder.toString();
	}
}
