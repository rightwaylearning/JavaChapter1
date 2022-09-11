package Sonali_collection_All_Example;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee_Output {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("Sonali", "Galande", 70000));
		al.add(new Employee("Suvarna", "Kangude", 60000));
		al.add(new Employee("Priti", "Kamble", 35000));
		al.add(new Employee("priya", "Kurumkar", 45000));
		al.add(new Employee("pinkii", "Jagtap", 30000));
		System.out.println(al);

		Iterator<Employee> i = al.iterator();
		int MaxSalary = 0;
		String FirstName= null;
		String LastName=null;
		if (i.hasNext()) {

			Employee e = i.next();
			MaxSalary = e.Salary;
			
		}

		Iterator<Employee> i1 = al.iterator();
		while (i1.hasNext()) {

			Employee e1 = i1.next();
			if (MaxSalary <= e1.Salary) {
				MaxSalary = e1.Salary;
				FirstName = e1.FirstName;
				LastName = e1.LastName;
			}
		
			
			//System.out.println(MaxSalary);
			
		}
     System.out.println("person name is " +FirstName  + " " +LastName  + " whose having the max salary " + MaxSalary);
	}

}