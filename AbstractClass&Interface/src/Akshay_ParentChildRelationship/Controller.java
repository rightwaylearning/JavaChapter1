package Akshay_ParentChildRelationship;

public class Controller {
	
	public static void main(String[] args) {
		
		
	// Case 1
		
		P p = new P ();
		p.m1(); // Answer is  = "I am m1 method of Parent class"
		p.m2(); // Answer is = "I am m2 method of Parent class"
		System.out.println(p.akshay);
		System.out.println("===========================================");
		
	// Case 2
		
		C c = new C ();
		c.m1(); // Answer is = "I am m1 method of Child class"
		c.m4(); // Answer is = "I am m4 method of Child class
		System.out.println(c.akshay);
		System.out.println("===========================================");
		
	// Case 3
		
		P p1 = new C ();
		p1.m1(); // Answer is = "I am m1 method of Child class"
		p1.m2(); // Answer is = "I am m1 method of Parent class"
		System.out.println(p1.akshay);
		System.out.println("===========================================");
		
	// Case 4
		
//		C c1 = new P (); // This is invalid method hence the compile time error.
		// NOTE : child class reference can't hold parent class object
		
		
	}

}
