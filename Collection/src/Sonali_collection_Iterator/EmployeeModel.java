package Sonali_collection_Iterator;

public class EmployeeModel {

	String EmpName;
	Integer EmpId;
	Double EmpSalary;

	public EmployeeModel(String empName, Integer empId, Double empSalary) {
		super();
		EmpName = empName;
		EmpId = empId;
		EmpSalary = empSalary;
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
		return "EmployeeModel [EmpName=" + EmpName + ", EmpId=" + EmpId + ", EmpSalary=" + EmpSalary + "]";
	}

}
