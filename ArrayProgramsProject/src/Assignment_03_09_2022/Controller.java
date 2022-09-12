package Assignment_03_09_2022;

import java.util.ArrayList;
import java.util.List;

public class Controller {

	public static void main(String[] args) {
		
		// for storing final result
		List<Employee> result = new ArrayList<>();
		
		// created array for storage all employee object
		List<Employee> list = new ArrayList<>();
		init(list);
			
		// create new array having only salary filed that is Double type array
		List<Double> sal = new ArrayList<>();
		
		for (Employee e : list) {
			sal.add(e.getSalary());
		}
		
		// max salary find out
		Double maxSalary = sal.get(0);
		
		for (Double s : sal) {
			if(maxSalary < s) {
				maxSalary = s;
			}
		}
			
	  
		// add only max salary employee from main list to result list
		for (Employee e : list) {
			if(e.getSalary().doubleValue() == maxSalary.doubleValue()) {
				result.add(e);
			}
		}
		
		// result list print
		System.out.println(result);
		
	}
	
	
	static void init(List<Employee> list) {
		list.add(new Employee("Rohit", "Sharma",7000.00));
		list.add(new Employee("KL", "Rahul",6500.00));
		list.add(new Employee("Hardik", "Pandya",6700.00));
		list.add(new Employee("Virat", "Koholi",7000.00));
		list.add(new Employee("Surykumar", "Yadav",7000.00));
	}
}
