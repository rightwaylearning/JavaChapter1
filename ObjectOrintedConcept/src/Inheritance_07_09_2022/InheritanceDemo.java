package Inheritance_07_09_2022;



class P{
	
	void m1() {
		System.out.println("I am P class m1 method");
	}
}

class C extends P{
	
	void m1() {
		System.out.println("I am C class m2 method");
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
      // case 1
		P p= new P(); 
		p.m1(); 
		
	  // case 2
		C c= new C();
		c.m1(); c.m2();
	
	 // case 3
		P p1=new C();
		p1.m1(); 
	
	// case 4
	//	C c1= new P();
		
		
	}
}
