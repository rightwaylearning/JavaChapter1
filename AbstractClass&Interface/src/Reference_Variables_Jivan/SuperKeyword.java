package Reference_Variables_Jivan;

class A {
	int a = 10;
	int b = 20;	
}

class B extends A {
	int x = 100;
	int y = 200;
}

public class SuperKeyword {
	
	public static void main(String[] args) {
		
		// Case 1
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		//System.out.println(a.x);
		//System.out.println(a.y);
		
		// Case 2
		B b = new B();
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.a);
		System.out.println(b.b);
		
		// Case 3
		A a1 = new B();
		System.out.println(a1.a);
		System.out.println(a1.b);
		//System.out.println(a1.x);
		//System.out.println(a1.y);
		
		// Case 4
		//B b1 = new A();
		// Case 4 is not valid
	}

}
