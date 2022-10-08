package Model;

public class Student {

	private String studentName;
	private Integer studentRollNumber;
	private float studentPercentage;

	public Student(String studentName, Integer studentRollNumber, float studentPercentage) {
		super();
		this.studentName = studentName;
		this.studentRollNumber = studentRollNumber;
		this.studentPercentage = studentPercentage;
	}

	public Student() {
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentRollNumber() {
		return studentRollNumber;
	}

	public void setStudentRollNumber(Integer studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}

	public float getStudentPercentage() {
		return studentPercentage;
	}

	public void setStudentPercentage(float studentPercentage) {
		this.studentPercentage = studentPercentage;
	}

}
