package polymorphism_examples;

class C{
	
	void m1(int a, float f) {
		System.out.println("void m1(int a, float f)");
	}
	
	void m1(float f, int a) {
		System.out.println("void m1(float f,int a)");
	}
}

public class Case3MethodOverlodding {

	public static void main(String[] args) {
		C c= new C();
		c.m1(10, 0.0F);
		c.m1(10.10f, 0);
		byte x = 10;
		byte y = 20;
		c.m1(x, y);
	}
}
