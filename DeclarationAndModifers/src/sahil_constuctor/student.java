package sahil_constuctor;

public class student {
     private String student;
	private int rollNumber;
	private char divistion;
	private String std;
	
	public student(){
		
	}
	public student(String student, int rollNumber, char divistion, String std) {
		super();
		this.student = student;
		this.rollNumber = rollNumber;
		this.divistion = divistion;
		this.std = std;
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public char getDivistion() {
		return divistion;
	}
	public void setDivistion(char divistion) {
		this.divistion = divistion;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	
	
	
}
