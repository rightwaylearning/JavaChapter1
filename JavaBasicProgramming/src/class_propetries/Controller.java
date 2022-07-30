package class_propetries;

public class Controller {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.rollNumber = 23;
		s.studentName = "Mahedra";
		
		s.addr = new Address();
		s.addr.hNumber = "123/B/c-505";
		s.addr.area = "north east";
		s.addr.cityName = "Masko";
		s.addr.pinCode = 345678;
		
		s.std = "5th";
		
		s.subjects = new String[6];
		s.subjects[0] = "First lang";
		s.subjects[1] = "Algebra";
		s.subjects[2] = "science";
		s.subjects[3] = "native language";
		s.subjects[4] = "second language";
		s.subjects[5] = "Social science";
		
		
		ShowData show = new ShowData();
		show.displayInfo(s);
		
	}
}
