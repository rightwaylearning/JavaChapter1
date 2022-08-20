
public class Sample extends Test{

	void m2() {
		System.out.println("I am Sample class m1 method");
	}
	
	public static void main(String[] args) {
		A a= new A();
		a.m1();
		a.m2();
		
		B b= new B();
		b.m1();
		b.m2();
	}
}

class A{
	
	void m1() {
		
	}
}

class B extends A{
	
	void m2() {
		
	}
}
