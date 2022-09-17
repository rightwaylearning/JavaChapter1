package compile_time_poly.com;

class B {
	void m1(double d) {
		System.out.println("single (double) - args");
	}
	void m1(short s) {
		System.out.println("single (short) - args");
	}
	void m1(long s) {
		System.out.println("single (long) - args");
	}
}
public class Case2Demo {
	public static void main(String[] args) {
		B b= new B();
		b.m1('A'); // single (long) - args
		b.m1(10); // single (long) - args
	    byte b1 = 10;
	    b.m1(b1); // single (short) - args
	}
	
}
