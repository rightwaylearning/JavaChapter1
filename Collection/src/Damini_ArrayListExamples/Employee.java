package Damini_ArrayListExamples;

public class Employee {

	private String name;
	private Integer EmpId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmpId() {
		return EmpId;
	}
	public void setEmpId(Integer empId) {
		EmpId = empId;
	}
	public Employee(String name, Integer empId) {
		super();
		this.name = name;
		EmpId = empId;
	}
	
}
