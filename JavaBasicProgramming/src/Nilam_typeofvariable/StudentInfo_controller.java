package Nilam_typeofvariable;

public class StudentInfo_controller {

	public static void main(String[] args) {

		StudentInfo s = new StudentInfo();

		s.name = "advik";
		s.rollNumber = 2;
		StudentInfo.schoolName = "abcd";

		StudentInfo s1 = new StudentInfo();

		s1.name = "ajit";
		s1.rollNumber = 3;
		StudentInfo.schoolName = "NESS";

		// static method
		StudentInfo s2 = new StudentInfo();
		StudentInfo.schoolName = "xyz";
		s2.name = "nilam";
		s2.rollNumber = 4;

		s.display();
		s1.display();
        s2.display();
		
		//StudentInfo_viewdata d = new StudentInfo_viewdata();
		//d.showdata(s);
		//d.showdata(s1);
		//d.showdata(s2);

	}
}