package Akshay_Assignment_27082022;

public class Student_info {
	
	private String studentname;
	private Integer rollnumber;
	private Double percentage;
	
	public Student_info (String studentname, Integer rollnumber, Double percentage) {
		
		this.studentname = studentname;
		this.rollnumber = rollnumber;
		this.percentage = percentage;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public Integer getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(Integer rollnumber) {
		this.rollnumber = rollnumber;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	
	@Override
	
	public String toString (){
		return "[" + studentname + " + " + rollnumber + " + "+ percentage + "]";
		
	}
	

}
