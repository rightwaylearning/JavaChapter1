package Nilam_ParentChildRelationship;

public class Controller_abstractclass {
	public static void main(String[] args) {
		
		
		//case1:
		 
		// ParentOfAbstractclass p= new ParentOfAbstractclass(); // can not create object of abstract class
		
		// case 2:
		
		childOfAbstractclass c = new childOfAbstractclass();
		c.m1();
		c.m2();
		c.m3();
		
		// case 3:
	System.out.println(">>>>>>>>>>>>>>>");	
		ParentOfAbstractclass p = new childOfAbstractclass();
		p.m1();
		p.m2();
		p.m3();
		
		//case 4:
		//childOfAbstractclass c1 =new ParentOfAbstractclass();
	}   // child class reference can't hold parent class object

}
