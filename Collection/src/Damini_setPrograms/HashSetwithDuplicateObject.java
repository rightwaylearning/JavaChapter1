package Damini_setPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class HashSetwithDuplicateObject {
	public static void main(String[] args) {
		HashSet<Employee> set = new HashSet<>();

		Employee e = new Employee("A", 23);
		set.add(e);
		Employee e1 = new Employee("B", 25);
		set.add(e1);
		Employee e2 = new Employee("C", 27);
		set.add(e2);
		Employee e3 = new Employee("D", 26);
		set.add(e3);

		System.out.println(set.size());
		System.out.println(set);
		System.out.println(">>>>>>>>>>>>>>");

		Iterator<Employee> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.hasNext());
		}
	}
}

class Employee implements Comparable

{
	private String name;
	private Integer empId;

	public Employee(String name, Integer empId) {

		this.name = name;
		this.empId = empId;
	}

	@Override
	public int hashCode() {
		int hashCode = this.empId.hashCode() + this.name.hashCode();
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if (e.equals(this.name) && e.empId.equals(this.empId)) {
			return true;
		}
		return false;
	}

	public Employee() {
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
		return " [" + name + "," + empId + "]";
	}

	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		int first = this.empId;
		int second = e.empId;
		if (first < second) {
			return -1;

		} else if (second < first) {
			return 1;
		} else {

			return 0;
		}
		// second option
		// return this.empId.compareTo(e.empId);

	}
}
