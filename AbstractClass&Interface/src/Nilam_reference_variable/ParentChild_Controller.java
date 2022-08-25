package Nilam_reference_variable;

public class ParentChild_Controller {

	public static void main(String[] args) {

		// case 1

		Parent p = new Parent();
		System.out.println(p.a);
		System.out.println(p.b);

		// case 2

		Child c = new Child();
		c.showproperty();

		// case 3
		Parent p1 = new Child();
		System.out.println(p1.a);
		System.out.println(p1.b);
		// case 4

	//	Child c1 = new Parent(); // invalid
		// child can not hold parent object

	}

}
