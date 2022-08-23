package Damini_ArrayListExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		List<Employee> emp=new ArrayList<Employee>();
		
		Employee e1=new Employee("a",24);
		emp.add(e1);
		Employee e2=new Employee("b",25);
		emp.add(e2);
		
		Iterator<Employee> itr=emp.iterator();
		while(itr.hasNext())
		{
			Employee e=itr.next();
			System.out.println(e.getName());
			System.out.println(e.getEmpId());
			System.out.println("------------------");
		}
		
		
	}
}
