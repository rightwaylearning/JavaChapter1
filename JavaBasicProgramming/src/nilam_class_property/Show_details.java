package nilam_class_property;

public class Show_details {
	
	void displayInfo(Student s) {
		
		System.out.println(s.name);
		System.out.println(s.rollNumber);
		System.out.println(s.clgName);
		System.out.println(s.std);
		
		System.out.println("-------------student address -------");
		s.add.showAddress();
		
		System.out.println(s.subject[0]);
		System.out.println(s.subject[1]);
		System.out.println(s.subject[2]);
		System.out.println(s.subject[3]);
		
		
	}
	
	

}
