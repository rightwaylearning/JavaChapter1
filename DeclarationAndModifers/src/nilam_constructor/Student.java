package nilam_constructor;

public class Student {
	public String name;
	public int rollNumber;
	public String div;
	public char std;

	public Student() {

	}

	public Student(String name, int rollNumber, String div, char std) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.div = div;
		this.std = std;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	public char getStd() {
		return std;
	}

	public void setStd(char std) {
		this.std = std;
	}

}
