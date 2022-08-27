package refererance_variables;


class A{
  int a = 10;
  int b = 20;
}
class B extends A{
  int x = 100;
  int y = 200;
}




public class SuperKeyWord {

	public static void main(String[] args) {
		
		// case 1]
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
	//	System.out.println(a.x);
	//	System.out.println(a.y);
		
		// case 2
		B b= new B();
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.a);
		System.out.println(b.b);
			
		// case 3
	    A a1= new B();
	    System.out.println(a1.a);
	    System.out.println(a1.b);
	// System.out.println(a1.x);
	 //   System.out.println(a1.y);
	    
	 //  B b1= new A();
	}
	
}
