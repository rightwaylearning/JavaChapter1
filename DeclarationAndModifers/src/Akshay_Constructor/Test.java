package Akshay_Constructor;

public class Test {
	
	int a;
	int b;
	
	Test (int a, int b){ // Argument Constructor
		this.a = a;
		this.b = b;	
	}
	
	Test () {  // 0 Argument Constructor
	}
	
	void m1 () {
		
		System.out.println(this.a);  // This is Argument Constructor
		System.out.println(this.b);  // This is Argument Constructor
		System.out.println(a); // This is 0 Argument Constructor
		System.out.println(b); // This is 0 Argument Constructor
	}
}


