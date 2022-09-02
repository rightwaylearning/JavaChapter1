package Jivan_Assignment;

public class Student {
	
	private String studentName;
	private int studentCount;
	
	public Student(String studentName, Integer count) {
		super();
		this.studentName = studentName;
		this.studentCount = count;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentCount() {
		return getStudentCount();
	}

	@Override
	public String toString() {
		return "Student [studentName = " + studentName + ", studentcount = " + studentCount + "]";
	}

}
