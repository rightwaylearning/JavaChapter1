package SetPrograms;


public class StudentInfo implements Comparable {

	private String firstName;
	private String lastname;
	
	public StudentInfo() {}
	
	public StudentInfo(String firstName,String lastname) {
		this.firstName = firstName;
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return " [" + firstName + " " + lastname + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		StudentInfo s =(StudentInfo)obj;
		if(this.firstName.equals(s.firstName)
				&& this.lastname.equals(s.lastname)) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.firstName.hashCode() + this.lastname.hashCode();
	}

	@Override
	public int compareTo(Object obj) {
		StudentInfo s =(StudentInfo)obj;
		  int n = this.firstName.compareTo(s.firstName); 
		  if(n == 0) {
			n= this.lastname.compareTo(s.lastname);
		  }
		return n;
	}
	
}
