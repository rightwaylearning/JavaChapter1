package pratik_collection_emp;

import java.util.LinkedList;
import java.util.ListIterator;

public class Controller {
	public static void main(String[] args) {
		LinkedList<Emp> a = new LinkedList<Emp>();

		Emp e = new Emp("allen", 20, 10000.0f);
		a.add(e);
		Emp e1 = new Emp("frank", 21, 20000.0f);
		a.add(e1);

		Emp e3 = new Emp("jon", 22, 5000.0f);
		a.add(e3);
		
		Emp e4 = new Emp("jay", 28, 15000.0f);
		a.add(e4);
		System.out.println(a);
		
		ListIterator<Emp> li = a.listIterator();
		while (li.hasNext()) {
			Emp ee = li.next();

			if (ee.getEmpSalary() >= 1000 && ee.getEmpSalary() <= 10000) {
				Float d = ((ee.getEmpSalary() * 10) / 100) + ee.getEmpSalary();
				ee.setEmpSalary(d);
				li.set(ee);

			} else if (ee.getEmpSalary() >= 10001 && ee.getEmpSalary() <= 20000) {
				Float d = ((ee.getEmpSalary() * 20) / 100) + ee.getEmpSalary();

				ee.setEmpSalary(d);
				li.set(ee); 
				

			}
		}
	System.out.println(a);
	}
}
