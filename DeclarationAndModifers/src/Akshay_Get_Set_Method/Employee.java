package Akshay_Get_Set_Method;

public class Employee {

	public int employeecode;
	public String employeeName;
	static String employerName;
	
	public int getemployeecode  () {
		return employeecode;
	}
		
	public void setEmployeecode (int employeecode) {
		this.employeecode = employeecode;
	}
	
	public String getEmployeeName () {
		return employeeName;
	}
	
	public void setEmployeeName (String employeeName) {
		this.employeeName = employeeName;
	}
	
}
