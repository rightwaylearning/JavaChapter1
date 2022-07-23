package Akshay_New_Package;

public class EmployeeInfo {
	
	int empid;
	String empname;
	String cmpname;
	double salary;
	double allownce;

	void displayEmployeeInfo() {
		
		System.out.println("All Employee Details");
		System.out.println("------------------------------------------");
		System.out.println("Employee ID = " + empid);
		System.out.println("Employee Name = " + empname);
		System.out.println("Company Name = " + cmpname);
		System.out.println("Employee Salary = " + salary);
		System.out.println("Employee Allownce = " + allownce);
	}
}
