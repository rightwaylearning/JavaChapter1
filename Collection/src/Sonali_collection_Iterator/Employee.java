package Sonali_collection_Iterator;

public class Employee {
	
	String FirstName;
	String LastName;
	Integer Salary;
	
	
	public Employee(String firstName, String lastName, Integer salary) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Salary = salary;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public Integer getSalary() {
		return Salary;
	}


	public void setSalary(Integer salary) {
		Salary = salary;
	}
    Employee(){
    	
    }

	@Override
	public String toString() {
		return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + ", Salary=" + Salary + "]";
	}
	
}