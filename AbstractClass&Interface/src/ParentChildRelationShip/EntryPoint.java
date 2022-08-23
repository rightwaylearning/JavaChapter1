package ParentChildRelationShip;

public class EntryPoint {

	public static void main(String[] args) {
		
		// case 1
		System.out.println("case 1] >>>>>>>>>>>>>>>>>>>>>");
		P p= new P();
		p.m1();
		p.m2();
	//	p.m4();  C.E
		
		// Case 2
		System.out.println("case 2 ] >>>>>>>>>>>>>>>>>>>>>");
		C c= new C();
		c.m1();
		c.m2();
		c.m4();
		
		System.out.println("case 3 ] >>>>>>>>>>>>>>>>>>>>>");
		
		P p1=new C(); // runtime poly
		p1.m1(); // here runtime m1 body of child class will excute
		p1.m2();
//		p1.m4(); C.E
		
		System.out.println("case 4 ] >>>>>>>>>>>>>>>>>>>>>");
		
	//	Child c1= new Parent();  invalid
		
	}
}
