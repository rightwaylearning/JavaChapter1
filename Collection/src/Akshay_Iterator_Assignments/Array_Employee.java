package Akshay_Iterator_Assignments;

public class Array_Employee {

	int employeeid;
	String employeename;
	double salary;
	double netSalary;
	double netSalary1;
	
	void showDetails() {
		
		System.out.println("Employee ID is =  " + this.employeeid);
		System.out.println("Employee Name is =  " + this.employeename);
		System.out.println("Employee Salary is =  " + this.salary);

		if (salary >= 15000.00 && salary <= 20000.00) {

			netSalary = salary + (salary * 10 / 100);

			System.out.println("10 % Increment on previous salary is =  " + salary * 10 / 100);
			System.out.println(("Net Salary is =  " + netSalary));
			System.out.println("--------------------------------------------------------------------");

		}

		if (salary >= 21000.00 && salary <= 30000.00) {

			netSalary1 = salary + (salary * 15 / 100);

			System.out.println("15 % Increment on previous salary is =  " + salary * 15 / 100);
			System.out.println(("Net Salary is =  " + netSalary1));
			System.out.println("--------------------------------------------------------------------");

		}
	}

}
