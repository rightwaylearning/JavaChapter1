package assignment.example.collection;

import java.util.List;

public class Student {

	private Integer rollNumber;
	private String studentName;
	private List<String> exams;

	public Student() {
	}

	public Student(Integer rollNumber, String studentName, List<String> exams) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.exams = exams;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<String> getExams() {
		return exams;
	}

	public void setExams(List<String> exams) {
		this.exams = exams;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", exams=" + exams + "]";
	}

}
