package Damini_ObjectOrientedExamples;

class StudentDetails
{
	
	private String studentName;
	private Integer rollNumber;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		if(studentName.length()>2)
		{
		this.studentName = studentName;
	}
	else {
		System.out.println("name should contain min 3 char");
	}
	}
	

	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		if(rollNumber>0)
		{
		this.rollNumber = rollNumber;
	}
	else
	{
		System.out.println("rollnumber should be +ve");
	}
}

}

public class DataHiding {
public static void main(String[] args) {
	StudentDetails s=new StudentDetails();
	s.setStudentName("Damini");
	s.setRollNumber(23);
	System.out.println(s);
}
	
	

}
