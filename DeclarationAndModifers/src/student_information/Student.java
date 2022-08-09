package student_information;

// student_information.Student
public class Student {

	public int studentRollNumber;
	public String studentName;
	static public String schoolName;

	public int getStudentRollNumber() {
		return studentRollNumber;
	}

	public void setStudentRollNumber(int studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	static public void showStudentDeatils() {
		System.out.println("I am static method");
	}

}
