package Nilam_assignment;

public class Employee {

	private String employeeName;
	private Integer employeeId;
	private Double salary;

	public Employee(String employeeName, Integer employeeId, Double salary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.salary = salary;
	}

	public Employee() {
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	}

}
