package TreeSet_Damini;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class TreeSetcustomSorting {
	public static void main(String[] args) {

		TreeSet<Integer> Tree = new TreeSet<>(new Intrevorder());
		Tree.add(20);
		Tree.add(40);
		Tree.add(60);
		Tree.add(10);
		Tree.add(30);

		System.out.println(Tree);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		TreeSet<Employee> emp=new TreeSet<>(EmployeeIdRevOrder());
		{
			emp.add(new Employee("aa",1));
			emp.add(new Employee("xx",4));
			emp.add(new Employee("rr",6));
			emp.add(new Employee("ll",9));
			emp.add(new Employee("ee",10));
			System.out.println(emp);
		}

	}


class Employee implements Comparable<Employee> {
	private String Name;
	private Integer EmpId;

	Employee() {

	}

	Employee(String Name, Integer EmpId) {
		this.EmpId = EmpId;
		this.Name = Name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getEmpId() {
		return EmpId;
	}

	public void setEmpId(Integer empId) {
		EmpId = empId;
	}

	@Override
	public String toString() {
		return " [" + Name + "," + EmpId + "]";
	}

	@Override
	public int hashCode() {
		return this.Name.hashCode() + this.EmpId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		Employee e = (Employee) obj;
		if (e.Name.equals(this.Name) && e.EmpId.equals(this.EmpId)) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Employee o) {
		return this.EmpId.compareTo(o.EmpId);
	}

}
class Intrevorder implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		return -o1.compareTo(o2);
	}
	}
class EmployeeIdRevOrder implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return -o1.getEmpId().compareTo(o2.getEmpId());
	}
	
	}
}