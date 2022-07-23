package Akshay_New_Package;

public class Employee_Controller {
	
	public static void main(String[] args) {
		
		EmployeeInfo e = new EmployeeInfo ();
		
		e.empid = 23;
		e.empname = "Akshay Vilas Tejale";
		e.cmpname = "Infosys";
		e.salary = 60000;
		e.allownce = 5000;
		
		e.displayEmployeeInfo();
	}

}
