package Akshay_Polymorphism;

class Akshay4 {
	
	void m1(Integer a) {
		
		System.out.println("I am Integer arg method");
	}
	
	void m1(byte b) {
		
		System.out.println("I am Byte arg method");
	}
	
}



public class Case4_Polymorphism {

	public static void main(String[] args) {
		
		Akshay4 p = new Akshay4 ();
		
		int a = 10;
		
		p.m1(a);
		
		byte b = 20;
		
		p.m1(b);

	}

}
