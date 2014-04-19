package run;

import programs.Add;
import programs.Id;
import values.Int;

public class Main {
	public static void main(String[] args) {
		Id id = new Id();
		System.out.println(id.eval());
		System.out.println(id.eval(new Int(2)));
		
		Add add = new Add();
		System.out.println(add.eval());
		System.out.println(add.eval(new Int(2)));
		
		System.out.println(add.eval(new Int(2)).eval(new Int(4)));
	}
}
