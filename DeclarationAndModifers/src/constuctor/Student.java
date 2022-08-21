package constuctor;

public class Student {

	 String studentName;
	 int rollNumber;
	 String std;
	 char division;
	// compiler is going to add Constructor in your class 
	// if there is no any Constructor
	public Student() {
		
	}
	
	public Student(String studentName, int rollNumber, String std, char division) {
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.std = std;
		this.division = division;
	}

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

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public char getDivision() {
		return division;
	}

	public void setDivision(char division) {
		this.division = division;
	}
		
}
