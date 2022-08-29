package Sonali_collection_Iterator;

public class EmployeeIterator {
	private String name;
	private int rollno;
	private float salary;
	public EmployeeIterator(String name, int rollno, float salary) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	

}
