package Akshay_ArrayList;

public class Student {

	private String name;
	private Integer RollNum;
	private Double Marks;
	
	public Student (String name, Integer RollNum, Double SMarks) {
		
		this.name = name;
		this.RollNum = RollNum;
		this.Marks = SMarks;
		
	}

	public String getName() {
		return name;
	}

	public Double getMarks() {
		return Marks;
	}

	public void setMarks(Double marks) {
		Marks = marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollNum() {
		return RollNum;
	}

	public void setRollNum(Integer rollNum) {
		RollNum = rollNum;
	}
	
	
}
