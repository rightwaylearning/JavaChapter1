package assignment;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Controller {
    
	
	public static void main(String[] args) {
		List<Employee> al = new ArrayList<>();
		al.add(new Employee("A",23,23500.00));
		al.add(new Employee("B",25,25500.00));
		al.add(new Employee("C",26,33500.00));
		al.add(new Employee("D",26,43500.00));
		
		System.out.println(al);
		
		// start
		ListIterator<Employee> itr = al.listIterator();
		while(itr.hasNext()) {
			Employee e = itr.next();
			if(e.getEmployeeSalary() >= 30000 && e.getEmployeeSalary() <= 40000) {
				// 5 % increment
				Double updatedSal = e.getEmployeeSalary() + (e.getEmployeeSalary() * 5)/100;
				e.setEmployeeSalary(updatedSal);
			    itr.set(e);
			}else if(e.getEmployeeSalary() > 40000) {
				Double updatedSal = e.getEmployeeSalary() + (e.getEmployeeSalary() * 2)/100;
				e.setEmployeeSalary(updatedSal);
			    itr.set(e);
			}else {
				Double updatedSal = e.getEmployeeSalary() + (e.getEmployeeSalary() * 10)/100;
				e.setEmployeeSalary(updatedSal);
			    itr.set(e);
			}
		}
		
        // end
			
		System.out.println(al);
		
		Vector<Employee> v = new Vector<>(al);
		
		Enumeration<Employee> e = v.elements();
		
		while (e.hasMoreElements()) {
			Employee employee = (Employee) e.nextElement();
			System.out.println(employee);
		}
	}
}
