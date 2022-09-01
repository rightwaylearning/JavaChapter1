package Jivan_Property_Modifiers;

public class Controller {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		
		Test t = new Test(10, s, "abc");
		
		Test t1 = new Test(100, new Student(), "lmn");
		
		Employee e = Employee.getObject();
		
		e.m1();
	}

}
