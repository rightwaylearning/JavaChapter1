package ParentChildRelationship;

public class Controller {
	
	public static void main(String[] args) {
		
		// case 1
		Parent p = new Parent();
		p.m1();
	//	p.m2();
		
		//case 2
		
		Child c = new Child();
		c.m1();
		c.m2();
		
		// case 3
		
		Parent p1 = new Child();
		p1.m1();
		// p1.m2();
		// note; parent class reference can't hold child class object
		
		//Case 4
		
	//	Child c1 = new Parent();
		// note; child class reference can't hold parent class object
	
		
		
	}

}
