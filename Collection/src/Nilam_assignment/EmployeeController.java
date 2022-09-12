package Nilam_assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class EmployeeController {
public static void main(String[] args) {
		
		List<Employee> al = new ArrayList<Employee>();
		Employee s2 = new Employee("ab",20, 5000.0);
		al.add(s2);
		Employee s3 = new Employee("ww",21, 8000.0);
		al.add(s3);
		Employee s4 = new Employee("dd",22, 7000.0);
		al.add(s4);
		Employee s5 = new Employee("tr",23, 4000.0);
		al.add(s5);
		Employee s6 = new Employee("gh",24, 9000.0);
		al.add(s6);
	
		Iterator<Employee>itr = al.iterator();
		while(itr.hasNext()) {
			Employee a = itr.next();
			if(a.getSalary()<=7000) {
				System.out.println(a.getSalary());
				System.out.println(a.getEmployeeName());
				System.out.println(a.getEmployeeId());
				
}
}
}
}