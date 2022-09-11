package Sonali_collection_All_Example;

public class Controller {
	
	public static void main(String[] args) {
		
		EmployeeIterator e = new EmployeeIterator("sonali", 10, 3456.00f);
		e.setName("sonali");
		e.setRollno(10);
		e.setSalary(40000);
		
		System.out.println(e.getSalary());
		System.out.println(e.getName());
	}
}


