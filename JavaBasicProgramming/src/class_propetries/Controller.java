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
		
		String[] sub = {"ab","pq","lm","kk","nn"};
		s.subjects = sub;
		
		ShowData show = new ShowData();
		show.displayInfo(s);
		
	}
}
