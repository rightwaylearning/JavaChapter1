package Sonali_Oops_Examples;

class D {

	void m1(Integer a) {
		System.out.println("I am Integer arg method");
	}

	void m1(byte b) {
		System.out.println("I am byte arg method");
	}

}

public class PolymorphismCase4 {
	public static void main(String[] args) {
		D d = new D();
		int a = 10;
		d.m1(a);

		byte b = 33;
		d.m1(b);
	}

}
