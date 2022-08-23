package Akshay_ArrayList;

public class Student {

	private String name;
	private Integer RollNum;
	
	public Student (String name, Integer RollNum) {
		
		this.name = name;
		this.RollNum = RollNum;
		
	}

	public String getName() {
		return name;
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
