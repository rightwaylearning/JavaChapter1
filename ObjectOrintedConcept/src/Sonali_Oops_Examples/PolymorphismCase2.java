package Sonali_Oops_Examples;


class B{
	void m2(int a , double b) {
		System.out.println("int-double args method ");
		
	}
	void m2(double a , int b) {
		System.out.println("double-int args method");
		
	}
}
public class PolymorphismCase2 {

	public static void main(String[] args) {
		B b = new B();
		byte p=5;
		b.m2(20.0, p);
		b.m2(p,5.5);
		
		
	}
}
