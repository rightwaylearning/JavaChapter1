package LinkedListDemo;

public class StudentInfo {

	private String studentName;
	private Integer rollNUmber;
	private Double percentage;
	
	public StudentInfo(String studentName, Integer rollNUmber, Double percentage) {
		super();
		this.studentName = studentName;
		this.rollNUmber = rollNUmber;
		this.percentage = percentage;
	}
	
	public StudentInfo() {}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getRollNUmber() {
		return rollNUmber;
	}

	public void setRollNUmber(Integer rollNUmber) {
		this.rollNUmber = rollNUmber;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return " [" + studentName + ", " + rollNUmber + ", " + percentage
				+ "]";
	}

}
