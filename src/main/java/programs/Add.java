package programs;

import values.Function;
import values.Int;

public class Add extends Function {

	@Override
	public Function eval(Function x) {
		return new Function(x) {
		
			@Override
			public Function eval(Function y) {
				return new Int(this.getValue().getLiteral() + y.getLiteral());
			}
		};
		//return new Adds(x);
	}
	
	public class Adds extends Function {
		public Adds(Function x) {
			super(x);
		}
		
		@Override
		public Function eval(Function y) {
			return new Int(this.getValue().getLiteral() + y.getLiteral());
		}
	}
}
