package Jivan_Property_Modifiers;

public class Employee {
	
	private Employee() {
		
	}
	
	void m1() {
		System.out.println("good morning India...");
	}
	
	static Employee getObject() {
		
		Employee e = new Employee();
		
		return e;
	}

}
