package Sonali_Oops_Examples;
class B{
	void m1(int a) {
		System.out.println("int args method");
	}
	void m1(short s) {
		System.out.println("short args method");
	}
	void m1(double z) {
		System.out.println("int args method");
	}
	void m1(byte b) {
		System.out.println("short args method");
	}
}

public class PolymorphismCase2 {
	public static void main(String[] args) {
		B b = new B();
		byte c=20;
		b.m1(c);
		
		short s =67;
		b.m1(s);
		
		 
        long l = 9099090909L;
        b.m1(l);
	}

}
