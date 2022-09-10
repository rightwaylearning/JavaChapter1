package ParentChildRelationship;

public class EntryPoint {
	
	public static void main(String[] args) {
		
		System.out.println("Case 1 >>>>>>>>>>>>>>>>>>");
		P p = new P();
		p.m1();
		p.m2();
		
		System.out.println("Case 2 >>>>>>>>>>>>>>>>>>");
		C c = new C();
		c.m1();
		c.m2();
		c.m4();
		
		System.out.println("Case 3 >>>>>>>>>>>>>>>>>>");
		P p1 = new C();
		p1.m1();
		p1.m2();
		
	}

}