package values;

public class Int extends Function {
	
	public Int(int value) {
		super();
		this.setLiteral(value);
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.getLiteral());
	}

}
