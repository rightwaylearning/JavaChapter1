package pratik_collection_employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class EmployeeInfo {
	ArrayList<Employee> a;

	public EmployeeInfo() {
		this.a = new ArrayList<Employee>();
	}

	public void addData(Employee ee) {
		a.add(ee);

	}

	public void view() {
		Iterator<Employee> i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
		System.out.println();
	}

	public void afterAddGetEmpDeatils() {
		
		ListIterator<Employee> li = a.listIterator();
		while (li.hasNext()) {
			Employee e = li.next();

			if (e.getEmpSalary() >= 1000 && e.getEmpSalary() <=10000) {
				System.out.println("if salary is between 1000 to 10,000 then add 10% those employees are ");
			Double d=	((e.getEmpSalary() * 10) / 100)+e.getEmpSalary();

System.out.println(e.getEmpName());
System.out.println(e.getEmpId());
System.out.println(d);
System.out.println(">>>>>>>>>>>>>");
System.out.println();
			
			}else if (e.getEmpSalary() >= 10001 && e.getEmpSalary() <= 20000) {
				System.out.println("if salary is between 10,001 to 20,000 then add 20% those employees are ");
			Double d=	((e.getEmpSalary() * 20) / 100)+e.getEmpSalary();

System.out.println(e.getEmpName());
System.out.println(e.getEmpId());
System.out.println(d);
System.out.println(">>>>>>>>>>>>>");
System.out.println();
			
			}
				
		}
		

	}

}
