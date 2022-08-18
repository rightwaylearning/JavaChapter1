package abstract_modifiers_examples;

class P {

	void m1() {
		System.out.println("Land, home");
	}
}

class C extends P {

	void m1() {
		System.out.println("Land, shop");
	}

	void c1() {
		System.out.println("I am c1() method of C class");
	}

}

abstract class Parent {
	void land() {
		System.out.println("Land");
	}

	abstract void home();
}

class Child extends Parent {
	void home() {
		System.out.println("home");
	}
}

interface A {
	public void land();

	public void home();
}

class B implements A {
	public void land() {
		System.out.println("Land");
	}

	public void home() {
		System.out.println("home");
	}
}

public class Controller {

	public static void main(String[] args) {

		// case 1
		C c = new C();
		c.m1();
		// case 2
		Child c1 = new Child();
		c1.land();
		c1.home();
		// case 3
		B b = new B();
		b.land();
		b.home();

	}
}
