package pratik_collection_emp;

public class Emp {
private String empName;
private Integer empId;
private Float empSalary;
public Emp(String empName, Integer empId, Float empSalary) {
	super();
	this.empName = empName;
	this.empId = empId;
	this.empSalary = empSalary;
}
public Emp() {
	
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public Integer getEmpId() {
	return empId;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public Float getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(Float empSalary) {
	this.empSalary = empSalary;
}
@Override
public String toString() {
	return "[" + empName + "," + empId + "," + empSalary + "]";
}


}
