package pratik_collection_employee;

public class Employee {
private String EmpName;
private Integer EmpId;
private Double EmpSalary;
public Employee(String empName, Integer empId, Double empSalary) {
	super();
	EmpName = empName;
	EmpId = empId;
	EmpSalary = empSalary;
}

public Employee() {
	
}

public String getEmpName() {
	return EmpName;
}

public void setEmpName(String empName) {
	EmpName = empName;
}

public Integer getEmpId() {
	return EmpId;
}

public void setEmpId(Integer empId) {
	EmpId = empId;
}

public Double getEmpSalary() {
	return EmpSalary;
}

public void setEmpSalary(Double empSalary) {
	EmpSalary = empSalary;
}

@Override
public String toString() {
	return "" + EmpName + ", " + EmpId + "," + EmpSalary + "]";
}


}
