package Akshay_New_Package;

public class Employee_Controller {
	
	public static void main(String[] args) {
		
		EmployeeInfo Akshay = new EmployeeInfo ();
		
		Akshay.empid = 23;
		Akshay.empname = "Akshay Vilas Tejale";
		Akshay.cmpname = "Infosys";
		Akshay.salary = 60000;
		Akshay.allownce = 5000;
		
		EmployeeInfo Sahil = new EmployeeInfo ();
		
		Sahil.empid = 25;
		Sahil.empname = "Sahil Nalade";
		Sahil.cmpname = "Infosys";
		Sahil.salary = 65000;
		Sahil.allownce = 4000;
		
		Akshay.displayEmployeeInfo();
		Sahil.displayEmployeeInfo();
	}

}
