package Akshay_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Controller {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();

		Employee Akshay = new Employee(22, "Akshay", 15000.00);
		al.add(Akshay);

		Employee Sahil = new Employee(23, "Sahil", 22000.00);
		al.add(Sahil);

		Employee Poonam = new Employee(24, "Poonam", 25000.00);
		al.add(Poonam);

		Employee Vishal = new Employee(25, "Vishal", 30000.00);
		al.add(Vishal);

		Iterator<Employee> itr = al.iterator();

		while (itr.hasNext()) {

			Employee e = itr.next();

			if (e.getSalary() > 10000.00 && e.getSalary() <= 19000.00) {

				Double netSalary = e.getSalary() + (e.getSalary() * 10 / 100);

				System.out.println("Employee ID is =  " + e.getId());
				System.out.println("Employee Name is =  " + e.getName());
				System.out.println("Previous Salary is =  " + e.getSalary());
				System.out.println("Increment is 10% on Previous Salary =  " + e.getSalary() * 10 / 100);
				System.out.println("Net Salary is =  " + netSalary);
				System.out.println("--------------------------------------");
			}

			while (itr.hasNext()) {

				Employee e1 = itr.next();

				if (e1.getSalary() >= 20000.00 && e1.getSalary() <= 30000.00) {

					Double netSalary1 = e1.getSalary() + (e1.getSalary() * 15 / 100);

					System.out.println("Employee ID is =  " + e1.getId());
					System.out.println("Employee Name is =  " + e1.getName());
					System.out.println("Previous Salary is =  " + e1.getSalary());
					System.out.println("Increment is 15% on Previous Salary =  " + e1.getSalary() * 15 / 100);
					System.out.println("Net Salary is =  " + netSalary1);
					System.out.println("--------------------------------------");
				}

			}

		}

	}
}
