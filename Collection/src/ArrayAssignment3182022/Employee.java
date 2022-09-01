package ArrayAssignment3182022;

public class Employee {
	 private String employeeName;
	 private Integer EmpID;
	 private Double EmpSalary;
	public Employee(String employeeName, Integer empID, Double empSalary) {
		super();
		this.employeeName = employeeName;
		this.EmpID = empID;
		this.EmpSalary = empSalary;
	}
	
	public Employee()
	{
		
	}

	@Override
	public String toString() {
		return "["+employeeName + "," + EmpID + ","+ EmpSalary + "]";
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmpID() {
		return EmpID;
	}

	public void setEmpID(Integer empID) {
		EmpID = empID;
	}

	public Double getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(Double empSalary) {
		EmpSalary = empSalary;
	}
}
