package return_type_examples;

public class Controller {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		int r = d.doSum(10, 20);
		System.out.println(r);
		
		System.out.println("--------------------");
		
		float r1 = d.doDivision(23.34F, 12.0F);
		System.out.println(r1);
		
		System.out.println("--------------------");
		
		 Student s = d.getObject();
		 System.out.println(s.name);
		 System.out.println(s.rollNumber);
		 
		 System.out.println("-----------------------");
		System.out.println(s.phoneNumber);
		
	}
}
