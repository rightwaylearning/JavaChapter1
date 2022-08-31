package Kalpesh;

public class Employee {
	private String EmpName;
	private Integer EmpIdNumber;
	private Long EmpPhoneNumber;
	private char EmpAddress;

	public Employee(String empName, Integer empIdNumber, Long empPhoneNumber) {
		super();
		EmpName = empName;
		EmpIdNumber = empIdNumber;
		EmpPhoneNumber = empPhoneNumber;
		EmpAddress = getEmpAddress();
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public Integer getEmpIdNumber() {
		return EmpIdNumber;
	}

	public void setEmpIdNumber(Integer empIdNumber) {
		EmpIdNumber = empIdNumber;
	}

	public Long getEmpPhoneNumber() {
		return EmpPhoneNumber;
	}

	public void setEmpPhoneNumber(Long empPhoneNumber) {
		EmpPhoneNumber = empPhoneNumber;
	}

	public char getEmpAddress() {
		return EmpAddress;
	}

	public void setEmpAddress(char empAddress) {
		EmpAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Employee [" + EmpName + ", " + EmpIdNumber + ", " + EmpPhoneNumber + +EmpAddress + "]";
	}

}
