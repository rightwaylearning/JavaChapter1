package assignment;

public class Employee {

	private String employeeName;
	private Integer employeeId;
	private Double employeeSalary;
	
	public Employee(String employeeName, Integer employeeId, Double employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
	}
	
	public Employee() {}

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

	public Double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeSalary="
				+ employeeSalary + "]";
	}
		
}
