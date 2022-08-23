package pratik_collection;

public class Student {
	private String name;
	private Integer rollNumber;
	private Float percentage;
	public Student(String name, Integer rollNumber, Float percentage) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.percentage = percentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public Float getPercentage() {
		return percentage;
	}
	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}

}
