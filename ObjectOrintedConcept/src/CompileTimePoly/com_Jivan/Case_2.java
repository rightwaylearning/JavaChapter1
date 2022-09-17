package CompileTimePoly.com_Jivan;

class B {
	void m1(double d) {
		System.out.println("Single (double) - args");
	}

	void m1(short s) {
		System.out.println("Single (short) - args");
	}

	void m1(long l) {
		System.out.println("Single (long) - args");
	}
}

public class Case_2 {
	
	public static void main(String[] args) {
		B b = new B();
		
		b.m1('A'); // single (long) - args
		
		b.m1(10);  // single (long) - args
		
		byte b1 = 10;  // single (short) - args
		
		b.m1(b1);
		
	}
}
