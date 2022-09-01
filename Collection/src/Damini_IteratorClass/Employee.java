package Damini_IteratorClass;

public class Employee {

	int salary;
	String EmpName;
	int EmpId;
	public Employee(int salary, String empName, int empId) {
		super();
		this.salary = salary;
		EmpName = empName;
		EmpId = empId;
	}
	@Override
	public String toString() {
		return " [" + salary +"," + EmpName + "," + EmpId + "]";
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	
	}
