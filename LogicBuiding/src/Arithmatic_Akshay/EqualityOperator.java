package Arithmatic_Akshay;

public class EqualityOperator {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 30;
		
		boolean c = a == b; // Answer is = False
		boolean d = a != b; // Answer is = True
		
		System.out.println("Example of int Data Type\n");
		System.out.println(c);
		System.out.println(d);
		System.out.println("==============================");
		
		// 1. [==] - is equal to
		// 2. [!-] - is not equal to
		// 3. Here we can use 'byte, int, short, long, float, double' Primitive data types 
		//    for assign value or data except boolean data type.
		// 4. But always answer will be show in boolean data type.
		// 5. boolean data type can use in below conditional case.
		
		boolean a1 = true;
		boolean a2 = false;
		
		boolean a3 = a1 == a2; // Answer is = False
		boolean a4 = a1 != a2; // Answer is = True
		
		System.out.println("Example of boolean Data Type\n");
		System.out.println(a3);
		System.out.println(a4);
		System.out.println("==============================");
		
		String a5 = "AkshayTejale";
		String a6 = "Akshay";
		String a7 = "Akshay";
		
		boolean a8 = a5 == a6; // Answer is  = False
		boolean a9 = a6 != a7; // Answer is = False
		boolean a10 = a6 == a7; // Answer is = True
		
		System.out.println("Example of String Data Type\n");
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);
		System.out.println("==============================");
		
		double d1 = 25.90;
		float d2 = 30.30F;
		
		boolean d3 = d1 == d2;
		boolean d4 = d1 != d2;
		
		System.out.println("Example of double & float Data Type\n");
		System.out.println(d3);
		System.out.println(d4);
		System.out.println("==============================");
		
		short p = 256;
		long p1 = 280L;
		
		boolean p2 = p == p1;
		boolean p3 = p != p1;
		
		System.out.println("Example of short & long Data Type\n");
		System.out.println(p2); // Answer is = False
		System.out.println(p3); // Answer is = True
		System.out.println("==============================");
		
	}
}

	class A {};
	class B extends A {};
	class C extends B {};
	class D extends A {};
	
	class Student {};
	