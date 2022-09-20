package PolymorphismExamples_Jivan;

class A{
	void m1() {
		System.out.println("Zero -arg m1 method");
	}
	
//	int m1() {
//		return 0;
//	}
	
	void m1(int a, int b) {
		System.out.println("Two -args m1 method");
	}
	
	void m1(int x, int y, int a) {
		System.out.println("three -args m1 method");
	}
	
	void m1(int a, float b) {
		System.out.println("two -args m1 method (int, float)");
	}
	
	void m1(float a, int b) {
		System.out.println("two -args m1 method (float, int)");
	}
}
public class Case1MethodOverLoading {
	
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		a.m1(10, 20);
		a.m1(10, 20, 30);
		a.m1(10, 10.10f);
		a.m1(10.10f, 10);
		
	}
}
