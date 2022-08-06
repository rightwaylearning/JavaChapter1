package Nilam_typeofvariable;

public class StudentInfo {
	String name;
	int rollNumber;
	static String schoolName;

	void display() {

		System.out.println(this.name);
		System.out.println(this.rollNumber);
		System.out.println(StudentInfo.schoolName);

	}

	static void displaydata() {
		System.out.println(StudentInfo.schoolName);

		StudentInfo s2 = new StudentInfo();
		System.out.println(s2.name);
		System.out.println(s2.rollNumber);
	}
}