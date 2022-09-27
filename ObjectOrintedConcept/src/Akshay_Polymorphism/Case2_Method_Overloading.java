package Akshay_Polymorphism;

class Akshay1 {

	void a1(int a) {
		System.out.println("int arg method");
	}

	void a1(short a) {
		System.out.println("short arg method");
	}

	void a1(double a) {
		System.out.println("double arg method");
	}

	void a1(char a) {
		System.out.println("char arg method");
	}
}

public class Case2_Method_Overloading {

	public static void main(String[] args) {

		Akshay1 a = new Akshay1();

		byte b = 101;
		a.a1(b);

		int p = 222;
		a.a1(p);

		long b1 = 9099090909L;
		a.a1(b1);

	}

}
