package Jivan_Assignment_03_09_2022;

import java.util.ArrayList;
import java.util.List;

public class Controller {

	public static void main(String[] args) {
		
		List<Employee> result = new ArrayList<>();
		List<Employee> list = new ArrayList<>();
		init(list);
		
		List<Double> sal = new ArrayList<>();
		
		for (Employee e : list) {
			sal.add(e.getSalary());
		}
	//	System.out.println(sal);
		
		Double maxsalary = sal.get(0);
		
		for (Double s : sal) {
			if(maxsalary < s) {
				maxsalary = s;
			}
		}
	//	System.out.println(maxsalary);
		
		for (Employee e : list) {
			if(e.getSalary().doubleValue() == maxsalary.doubleValue()) {
			//	System.out.println(e.getFirstName() + " " + e.getFirstName() + " : " + e.getSalary());
				result.add(e);
			}
		}
		System.out.println(result);
	//	Double d = 7000.00;
	//	Double d1 = 7000.00;
	//	System.out.println(d.doubleValue() == d1.doubleValue());
	}
	
	static void init(List<Employee> list) {
		list.add(new Employee("Rohit", "Sharma", 7000.00));
		list.add(new Employee("KL", "Rahul", 6500.00));
		list.add(new Employee("Hardik", "Pandya", 6700.00));
		list.add(new Employee("Virat", "Kohli", 7000.00));
		list.add(new Employee("Suryakumar", "Yadav", 7000.00));
	}
}
