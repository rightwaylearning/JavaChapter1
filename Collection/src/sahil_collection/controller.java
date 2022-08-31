package sahil_collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class controller {
public static void main(String[] args) {
	List<employee> a = new ArrayList<employee>(); 
	employee s = new employee("sahil", 101, 10000);
	a.add(s);
	employee s1 = new employee("damini", 102, 15000);
    a.add(s1);
	employee s2 = new employee("mohini", 103, 20000);
    a.add(s2);
	employee s3 = new employee("akshay", 104, 25000);
	a.add(s3);
	employee s4 = new employee("poonam", 105, 30000);
	a.add(s4);
	
	Iterator<employee> itr = a.iterator();

	while (itr.hasNext()) {

		employee e = itr.next();

		if (e.getSalary() >=  19000 && e.getSalary() <= 20000.00) {

			Double netSalary = e.getSalary() + (e.getSalary() * 15 / 100);

			System.out.println("Employee ID is =  " + e.getId());
			System.out.println("Employee Name is =  " + e.getName());
			System.out.println("Previous Salary is =  " + e.getSalary());
			System.out.println("Increment is 15% on Previous Salary =  " + e.getSalary() * 15 / 100);
			System.out.println("Net Salary is =  " + netSalary);
			System.out.println("--------------------------------------");
		}

		while (itr.hasNext()) {

	employee e1 = itr.next();

			if (e1.getSalary() >= 19000.00 && e1.getSalary() <= 30000.00) {
				Double netSalary1 = e1.getSalary() + (e1.getSalary() * 25 / 100);

				System.out.println("Employee ID is =  " + e1.getId());
			    System.out.println("Employee Name is =  " + e1.getName());
		    	System.out.println("Previous Salary is =  " + e1.getSalary());
			    System.out.println("Increment is 25% on Previous Salary =  " + e1.getSalary() * 25 / 100);
			    System.out.println("Net Salary is =  " + netSalary1);
				System.out.println("--------------------------------------");
			}

		}


	
	
}
}}
	
		
			
	


