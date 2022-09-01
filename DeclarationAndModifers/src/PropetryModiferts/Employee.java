package PropetryModiferts;

public class Employee {

	private Employee() {
		
	}
	
	void m1() {
		System.out.println("good morning india...");
	}
	
	static Employee getObject() {
		
		Employee e = new Employee();
		
		return e;
		
	}
}
