package values;

public class Function {

	private Function value;
	private int literal;
	
	public Function() {
		super();
	}
	
	public Function(Function value) {
		super();
		this.setValue(value);
	}
	
	public Function eval() {
		return this;
	}
	
	public Function eval(Function v) {
		return null;
	}
	
	public Function getValue() {
		return value;
	}
	
	public void setValue(Function value) {
		this.value = value;
	}
	
	public int getLiteral() {
		return literal;
	}

	public void setLiteral(int literal) {
		this.literal = literal;
	}
	
}
