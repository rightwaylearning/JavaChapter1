package PolymorphismExamples_Jivan;

class C{
	void m1(int a, float f) {
		System.out.println("void m1(int a, float b)");
	}
	
	void m1(float f, double a) {
		System.out.println("void m1(float f, int a)");
	}
}
public class Case3MethodOverLoading {
	
	public static void main(String[] args) {
		C c = new C();
		
		c.m1(10, 10.10f);
		c.m1(10.10f, 10);
		
		byte x = 10;
		byte y = 20;
		
		c.m1(x,  y);
		
	}

}
