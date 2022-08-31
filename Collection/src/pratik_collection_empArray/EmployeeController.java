package pratik_collection_empArray;

import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeController {
	public static void main(String[] args) {
		Employee[] em = new Employee[3];
		em[0] = new Employee("ram", 20, 10000.0f);
		em[1] = new Employee("sham", 30, 15000.0f);
		em[2] = new Employee("jay", 24, 20000.0f);
		LinkedList<Employee> aa = new LinkedList<Employee>();
		aa.add(em[0]);
		aa.add(em[1]);
		aa.add(em[2]);
		System.out.println(aa);
		ListIterator<Employee> li = aa.listIterator();
		while (li.hasNext()) {
			Employee e = li.next();
			if (e.getEmpSalary() >= 1000 && e.getEmpSalary() <= 10000) {
				Float f = ((e.getEmpSalary() * 10) / 100) + e.getEmpSalary();
				e.setEmpSalary(f);
				li.set(e);
			} else if (e.getEmpSalary() >= 10001 && e.getEmpSalary() <= 20000) {
				Float ff = ((e.getEmpSalary() * 20) / 100) + e.getEmpSalary();
				e.setEmpSalary(ff);
				li.set(e);
			}
		}
		System.out.println(aa);
	}
}