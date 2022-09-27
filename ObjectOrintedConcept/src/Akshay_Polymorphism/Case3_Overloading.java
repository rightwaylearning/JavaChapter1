package Akshay_Polymorphism;

class Akshay3 {
	
	void m1 (int a, float b) {
		
		System.out.println("int a, float b");
	}
	
	void m1 (float a, int b) {
		
		System.out.println("void m1 (float a, int b");
	}
	
}

public class Case3_Overloading {
	
	public static void main(String[] args) {
		
		Akshay3 a = new Akshay3();
		
		a.m1(10.20F, 10);
		a.m1(20, 20.3F);
		
		byte x = 10;
		byte y = 20.20F;
		
		a.m1(x, y);
		a.m1(x, y);
		
		
		
	}

}
