package nilam_runner;

//import static nilam_studentinfo.Student.showStudentDeatils;

import nilam_studentinfo.School;
import nilam_studentinfo.Student;
import nilam_studentinfo.Student1;

public class student_controller {

	public static void main(String[] args) {

	//	showStudentDeatils();
		Student s = new Student();

		s.rollNumber = 12;
		s.studentName = "abc";
		Student.schoolName = "NESS";

		System.out.println(s.rollNumber);
		System.out.println(s.studentName);
		System.out.println(Student.schoolName);

		School s1 = new School();
		Student1 s2 = new Student1();

	}

}
