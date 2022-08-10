package Nilam;

public class Equality_opt {

	public static void main(String[] args) {

		boolean b = true;
		boolean b1 = false;
		boolean r = b == b1;
		System.out.println(r);

		Object o = new Object();
		A a = new A();
		B b2 = new B();
		C c = new C();
		D d = new D();
		boolean r1 = a == b2;
		System.out.println(r1);
		boolean r2 = b2 == c;
		System.out.println(r2);
		boolean r3 = d == a;
		System.out.println(r3);

		String s = new String("pqr");
		String s1 = new String("pqr");
		boolean r4 = s == s1;
		System.out.println(r4);

	}

}

class A {
}

class B extends A {
}

class C extends B {
}

class D extends A {
}
