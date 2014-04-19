package functions;

import values.Function;
import values.Int;

public class Id extends Function {
	
	@Override
	public Function eval(Function p) {
		return p;
	}
	
	
	
	
	

	public class Uno extends Function {
		
		@Override
		public Function eval() {
			return new Int(1);
		}
		
	}
}


