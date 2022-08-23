package sahil_AbstractClassInterface;

public class controller {
public static void main(String[] args) {
	
	//case 1
	parent P = new  parent ();
	P.m1();
	P.m2();
	//P.m2;ce
	System.out.println("==================================");
	//case2
	child C = new child ();
	C.m1();
	C.m2();
	C.m4();
	C.m1();
	System.out.println("=================================");
	// case 3
	parent p1 = new child ();

	p1.m2();
	p1.m1();
//	p1.m2 CE
	System.out.println("==================================");
	//case 4
	
	//child p2 = new parent (); CE
	//	  parent reference can hold Child class object

	
	
			
	
	
	
	
}


}

