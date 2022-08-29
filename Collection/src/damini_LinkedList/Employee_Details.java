package damini_LinkedList;

public class Employee_Details {

	private String empName;
	private int Salary;
	private int empId;

	public Employee_Details(String empName, int Salary, int empId) {
		super();
		this.empName = empName;
		this.Salary = Salary;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "[name=" + empName + ", Salary=" + Salary + ", empId=" + empId + "]";
	}

	public String getName() {
		return empName;
	}

	public void setName(String name) {
		this.empName = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int Salary) {
		this.Salary = Salary;
	}

	public double getempId() {
		return empId;
	}

	public void setempId(double empId) {
		empId = empId;
	}
}
