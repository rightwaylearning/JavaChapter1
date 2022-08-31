package Akshay_Iterator_Assignments;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee (Integer id, String name, Double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

<<<<<<< HEAD:Collection/src/Akshay_Iterator_Assignments/Employee.java
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", getId()=" + getId() + ", getName()="
//				+ getName() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass() + ", hashCode()="
//				+ hashCode() + ", toString()=" + super.toString() + "]";
//	}
//	
//	
=======
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
>>>>>>> b15b824827e949aaeec99d32b0d8e4a49aec2b2d:Collection/src/Akshay_Iterator/Employee.java
}
