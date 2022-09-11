package tree.set.examples;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetInstanceOfCustomSorting {

	public static void main(String[] args) {

		// TreeSet<Integer> t = new TreeSet<>(); // depend on Comparable for sorting

		TreeSet<Integer> t = new TreeSet<>(new IntegerRevOredr());

		t.add(10);
		t.add(100);
		t.add(1);
		t.add(3);
		t.add(7);
		System.out.println(t);

		// -----------------------------------------------
		System.out.println(">>>>>>>>>");
		// TreeSet<Employee> e = new TreeSet<>(); // depend on Comparable for sorting
		TreeSet<Employee> e = new TreeSet<>(new EmployeeIdRevOrder());

		e.add(new Employee("ZZ", 23));
		e.add(new Employee("MM", 45));
		e.add(new Employee("LL", 21));
		e.add(new Employee("PP", 1));
		e.add(new Employee("TT", 2));

		System.out.println(e);
	}
}

class Employee implements Comparable<Employee> {

	private String name;
	private Integer empId;

	Employee() {
	}

	Employee(String name, Integer empId) {
		this.name = name;
		this.empId = empId;
	}

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

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;

		if (e.name.equals(this.name) && e.empId.equals(this.empId)) {
			return true;
		}

		return false;

	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + this.empId.hashCode();
	}

	@Override
	public int compareTo(Employee o) {
		return this.empId.compareTo(o.empId);
		// here u can write custom logic & according to your logic you can sort
		// but that logic should follow DNSO it's good programming practice
	}
}

class IntegerRevOredr implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return -o1.compareTo(o2); // rev

	}
}

class EmployeeIdRevOrder implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return -o1.getEmpId().compareTo(o2.getEmpId());
	}
}
