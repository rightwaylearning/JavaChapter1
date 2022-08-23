package damini_parentchildRelationship;

public class Controller_parentChild {

	public static void main(String[] args) {
		
		//case 1
		/*Parent p=new Parent();  //abstact class
		p.m1();
		p.m2();*/
		
		//case 2
		Child c=new Child();
		c.m1();
		c.m2();
		c.m3();
		
		//case 3
		Parent p1=new Child();
		p1.m1();
		p1.m2();
		
		//case 4
		//Child c1=new Parent(); //invalid case
		
	}
}
