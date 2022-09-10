package Reference_Variables_Jivan;

class P{
	int a = 10;
	int b = 20;
}

class C extends P{
	int a = 100;
	int b = 200;
	
	void showPropertyValue() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(super.a);
		System.out.println(super.b);
	}
}

public class PropertyOfAClass {
	
	public static void main(String[] args) {
		
		// Case 1
		P p = new P();
		System.out.println(p.a);
		System.out.println(p.b);
		
		// Case 2
		C c = new C();
		System.out.println(c.a);
		System.out.println(c.b);
		c.showPropertyValue();
		
	}

}

class Test{
	int a;
	 void m1(int a) {
		 this.a = a;
		// int a = 20;
		// System.out.println(a);
		// System.out.println(this.a);
	}
	 
	 public static void main(String[] args) {
		Test t = new Test();
		t.m1(100);
		System.out.println(t.a);
		
	}
}

		

