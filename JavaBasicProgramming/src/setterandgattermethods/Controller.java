package setterandgattermethods;

public class Controller {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setRollNumber(23);
		s.setStudentName("sachin");
		
		System.out.println(s.getRollNumber());
		System.out.println(s.getStudentName());
	}
}
