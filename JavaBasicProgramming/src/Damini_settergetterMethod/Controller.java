package Damini_settergetterMethod;

public class Controller {

	public static void main(String[] args) {
		
		Student s=new Student();
		
         s.setRollNumber(27);
         s.setName("damini");
         
         System.out.println(s.getRollNumber());
         System.out.println(s.getName());
	}
}
