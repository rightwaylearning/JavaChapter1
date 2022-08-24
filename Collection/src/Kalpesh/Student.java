package Kalpesh;

public class Student {

	private String studentName;
	private Integer studentRollNumber;
	private double studentPercentage;
	public Student(String studentName, Integer studentRollNumber, double studentPercentage) {
		super();
		this.studentName = studentName;
		this.studentRollNumber = studentRollNumber;
		this.studentPercentage = studentPercentage;
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
	public double getStudentPercentage() {
		return studentPercentage;
	}
	public void setStudentPercentage(double studentPercentage) {
		this.studentPercentage = studentPercentage;
	}

	
}
