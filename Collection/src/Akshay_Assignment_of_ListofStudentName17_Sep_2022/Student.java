package Akshay_Assignment_of_ListofStudentName17_Sep_2022;

import java.util.List;

public class Student {

	private Integer RollNumber;
	private String StudentName;
	private List<String> exam;

	public Student(Integer RollNumber, String StudentName, List<String> exam) {
		this.RollNumber = RollNumber;
		this.StudentName = StudentName;
		this.exam = exam;
	}

	public Integer getRollNumber() {
		return RollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		RollNumber = rollNumber;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public List<String> getExam() {
		return exam;
	}

	public void setExam(List<String> exam) {
		this.exam = exam;
	}

	@Override
	public String toString() {
		return "Student [RollNumber=" + RollNumber + ", StudentName=" + StudentName + ", exam=" + exam + "]";
	}

}
