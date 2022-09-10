package SetPrograms;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetWithDuplicateObjects {

	public static void main(String[] args) {
		
		HashSet<Employee> set = new HashSet<>();
		
		Employee e= new Employee("A", 23);
		set.add(e); 
		// e.equals(e1);
		Employee e1= new Employee("A", 23);
		set.add(e1);
		
		Employee e2= new Employee("B", 23);
		set.add(e2);
		
		Employee e3= new Employee("A", 24);
		set.add(e3);
		
		Employee e4= new Employee("AA", 25);
		set.add(e4);
		
		System.out.println(set.size()); 
		System.out.println(set);
		System.out.println(">>>>>>>>>>>>>>>>>");
		
		Iterator<Employee> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}

class Employee{
	private String name;
	private Integer empId;
	
	public Employee(String name, Integer empId) {
		this.name = name;
		this.empId = empId;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		if(e.name.equals(this.name) && e.empId.equals(this.empId)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() { 
	    int hashCode = this.empId.hashCode() + this.name.hashCode();
		return hashCode;
	}
	
	public Employee() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return " [" + name + ", " + empId + "]";
	}
	
}