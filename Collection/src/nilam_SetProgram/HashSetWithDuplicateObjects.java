package nilam_SetProgram;

import java.util.HashSet;

public class HashSetWithDuplicateObjects {
	public static void main(String[] args) {

		HashSet<Employee> h = new HashSet<>();

		// Employee e= new Employee("A",23);
		h.add(new Employee("A", 33));
		Employee e2 = new Employee("B", 33);
		h.add(e2);

		Employee e3 = new Employee("A", 32);
		h.add(e3);

		Employee e4 = new Employee("A", 31);
		h.add(e4);

		Employee e5 = new Employee("A", 33);
		h.add(e5);

		Employee e6 = new Employee("B", 34);
		h.add(e6);
		System.out.println(h);
		System.out.println(h.size());
	}
}

class Employee implements Comparable {

	private String name;
	private Integer empId;

	public Employee(String name, Integer empId) {
		this.name = name;
		this.empId = empId;

	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "[" + name + "  " + empId + "]";

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
		int hashcode = this.empId.hashCode() + this.name.hashCode();
		return hashcode;

	}

	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		return this.empId.compareTo(e.empId);

	}
}
