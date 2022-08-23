package model;

public class Student {

	private String studentName;
	private Integer StudentRollNumber;
	private Float studentPercentage;
	
	public Student(String studentName, Integer studentRollNumber, Float studentPercentage) {
		super();
		this.studentName = studentName;
		StudentRollNumber = studentRollNumber;
		this.studentPercentage = studentPercentage;
	}
	
	public Student() {}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentRollNumber() {
		return StudentRollNumber;
	}

	public void setStudentRollNumber(Integer studentRollNumber) {
		StudentRollNumber = studentRollNumber;
	}

	public Float getStudentPercentage() {
		return studentPercentage;
	}

	public void setStudentPercentage(Float studentPercentage) {
		this.studentPercentage = studentPercentage;
	}
		
}
