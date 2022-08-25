package Nilam_reference_variable;

public class Parent1Child1_Controller {
	public static void main(String[] args) {
		
		 //case 1
		
		Parent1 p = new Parent1();
		System.out.println(p.m);
		System.out.println(p.n);
		
		// case2 
		Child1 c= new Child1();
		System.out.println(c.p);
		System.out.println(c.q);
	System.out.println(c.m);
	System.out.println(c.n);
	
	// case 3
	Parent1 p1 = new Child1();
	System.out.println(p1.m);
	System.out.println(p1.n);
	
	// case 4
//	Child1 c1=  new Parent1();    invalid
	}

}