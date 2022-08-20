package test;

public class DemoExamples {

	public static void main(String[] args) {

		A a = null;
		a = new A();
		// OR A a = new A();

		// B b= new B(); C.E
		B b = null;

	}
}

class A {

	void m1() {
	}

	void m2() {

	}
}

abstract class B {
	int a;

	B() {
		a = 10;
	}

	void m1() {

	}

	abstract void m2();
}

interface M {

	int x = 20;
	final int n = 30;
	static final int l = 90;
	public final static int m = 90;

	public void m1();
	public abstract void m2();
	abstract void m3();
}




abstract class K{

	void m1() {}
    void m2() {}
	
}
















