package Akshay_Polymorphism;

// Polymorphism means flexibility
// Here we could created duplicate methods in same class

class Akshay {
	
	void a1() {
		System.out.println("Zero Arg method");
		// This is a Method Signature - "void m1 ()"
	}
	
//	int a1 () {     // In this type duplicate method is not allowed.
//		return 0;
//	}
	
	void a1(int a, int b) {
		System.out.println("Two Args Method");
		// This is a Method Signature - "void m1 (int, int)"
	}
	
	void a1 (int a, int b, int c) {
		System.out.println("Three Args Method");
		// This is a Method Signature - "void m1 (int, int, int)"
	}
	
	void a1 (int a, float b) {
		System.out.println("Two args of method (int, float)");
		// This is a Method Signature - "void m1 (int, float)"
	}
	
	void a1 (float a, int b) {
		System.out.println("Two args of method (float, int)");
		// This is a Method Signature - "void m1 (float, int)"
	}
}

public class Case1_MethodOverloading {
	
	public static void main(String[] args) {
		
		Akshay a = new Akshay();
		a.a1();
		a.a1(10, 20);
		a.a1(10, 20, 30);
		a.a1(10.05F, 10);
		a.a1(20, 30.20F);
	}
}
