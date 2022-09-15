package Sonali_Oops_Examples;

class A {
	void m1(int a, int b) {
		System.out.println("int args method");
	}

	void m1(int x, float y) {
		System.out.println("Int-float args method");
	}

	void m1(int x, int y, int a) {
		System.out.println("three -args m1 method");
	}

	void m1(float a, int b) {
		System.out.println("two args of m1 method (float, int)");
	}

}

public class PolymorphismCase1 {

	public static void main(String[] args) {
		A a = new A();
		a.m1(10, 10);
		a.m1(2, 6.7f);

		byte b = 10;
		a.m1(10, b);

		a.m1(10, 20);
		a.m1(10, 20, 30);
		a.m1(10, 10.10F);
		a.m1(10.10F, 10);
	}

}
