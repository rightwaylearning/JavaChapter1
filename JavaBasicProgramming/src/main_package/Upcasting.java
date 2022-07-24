package main_package;

public class Upcasting {

	public static void main(String[] args) {
		
		byte b = 10;
		int i = b;
		System.out.println(i);  // 10
		
		double d = b;
		System.out.println(d); // 10.0
		
		char c ='A'; // (ASCII value 65)
		int sc = c;
		System.out.println(sc);
		
		float f = c;  // 65.0
		System.out.println(f);
		
		short sh = 100;
		long lg = sh;
		System.out.println(lg);
		
		double ch= 'A';
    }
	
}
