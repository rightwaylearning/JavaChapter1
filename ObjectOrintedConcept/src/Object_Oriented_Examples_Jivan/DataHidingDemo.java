package Object_Oriented_Examples_Jivan;

class StudentInfo {
	private String studentName;
	private Integer rollNumber;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		if(studentName.length() > 2) {
		this.studentName = studentName;
		}else {
			System.out.println("Name should be contain min. 3 character");
		}
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		if(rollNumber > 0) {
		this.rollNumber = rollNumber;
	}else {
		System.out.println("RollNumber should be +ve");
		}
	}

	@Override
	public String toString() {
		return "StudentInfo [studentName=" + studentName + ", rollNumber=" + rollNumber + "]";
	}
	
	
}

public class DataHidingDemo {
	
	public static void main(String[] args) {
		StudentInfo s = new StudentInfo();
		s.setRollNumber(-23);
		s.setStudentName("AB");
		
		System.out.println(s);
	}

}
