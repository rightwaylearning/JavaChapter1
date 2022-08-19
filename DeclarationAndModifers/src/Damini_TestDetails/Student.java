package Damini_TestDetails;

public class Student {
	String Name;
	int rollNumber;
	String std;
	char div;
	
	public Student()
	{
		
	}
	public Student(String Name,int rollNumber,String std,char div)
	{
		this.Name=Name;
		this.rollNumber=rollNumber;
		this.std=std;
		this.div=div;
		
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public char getDiv() {
		return div;
	}
	public void setDiv(char div) {
		this.div = div;
	}
	
	

}
