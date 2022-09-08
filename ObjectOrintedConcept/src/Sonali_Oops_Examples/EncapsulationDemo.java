package Sonali_Oops_Examples;

abstract class Students {
	private String StdName;
	private Integer RollNumber;

	public String getStdName() {
		return StdName;
	}

	public void setStdName(String stdName) {
		StdName = stdName;
	}

	public Integer getRollNumber() {
		return RollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		RollNumber = rollNumber;
	}

	abstract void MyService();

	abstract void showService();

}

class Child extends Students {
	void MyService() {
		System.out.println("I am Show The Services");
	}

	void showService() {
		System.out.println("Showing all Services");
	}
}
