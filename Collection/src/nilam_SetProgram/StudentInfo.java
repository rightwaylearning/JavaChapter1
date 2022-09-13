package nilam_SetProgram;

public class StudentInfo implements Comparable {

	private String firstName;
	private String lastName;

	public StudentInfo(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public StudentInfo() {
	}

	@Override
	public String toString() {
		return " [" + firstName + " " + lastName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		StudentInfo s = (StudentInfo) obj;
		if (this.firstName.equals(s.firstName) && this.lastName.equals(s.lastName)) {
			return true;
		}
		return false;

	}

	@Override
	public int hashCode() {
		return this.firstName.hashCode() + this.lastName.hashCode();

	}

	@Override
	public int compareTo(Object obj) {
		StudentInfo s = (StudentInfo) obj;
		int a = this.firstName.compareTo(s.firstName);
		if (a == 0) {
			a = -this.lastName.compareTo(s.lastName);
		}

		return a;
	}

}