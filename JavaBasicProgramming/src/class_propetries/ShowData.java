package class_propetries;

public class ShowData {

	void displayInfo(Student s) {
		System.out.println("------- student general info----------");
		System.out.println(s.rollNumber);
		System.out.println(s.studentName);
		System.out.println(s.std);
		
		System.out.println("-------------student address -------");
		s.addr.showAddress();
		
		System.out.println("------- studens subject----------");
		System.out.println(s.subjects[0]);
		System.out.println(s.subjects[1]);
		System.out.println(s.subjects[2]);
		System.out.println(s.subjects[3]);
		System.out.println(s.subjects[4]);
		
	}
}
