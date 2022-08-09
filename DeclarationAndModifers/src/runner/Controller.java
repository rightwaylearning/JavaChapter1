package runner;

import static student_information.Student.showStudentDeatils;
import static student_information.Student.schoolName;

import student_information.Teacher;
import student_information.School;




public class Controller {

	public static void main(String[] args) {
		
		showStudentDeatils();
		schoolName = "skdv";
		
		
		Teacher t= new Teacher();
		School s = new School();
	}
}
