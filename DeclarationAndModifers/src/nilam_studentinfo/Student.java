package nilam_studentinfo;

public class Student {

	public String studentName;
	public int rollNumber;
	public static String schoolName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public static String getSchoolName() {
		return schoolName;
	}

	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}
	//static public void showStudentDeatils() {
	//	System.out.println("static method");
	//}

}
