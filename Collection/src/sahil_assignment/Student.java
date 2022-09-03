package sahil_assignment;

public class Student {
	private String studentName;
	private Integer studentcount;
	
	public Student(String studentName, Integer count) {
		super();
		this.studentName = studentName;
		this.studentcount = count;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentcount() {
		return studentcount;
	}

	public void setStudentcount(int studentcount) {
		this.studentcount = studentcount;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentcount=" + studentcount + "]";
	}

	public String getItem() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
