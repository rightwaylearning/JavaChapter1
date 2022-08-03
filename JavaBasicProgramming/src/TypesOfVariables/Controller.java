package TypesOfVariables;

public class Controller {
	
	void m1() {
		StudentInfo s = new StudentInfo();
		System.out.println(s.rollNumber);
		System.out.println(s.name);
		System.out.println(StudentInfo.schoolname);
		s.dipalyData();
		s.instanceMethod();
		StudentInfo.staticMethod();
		StudentInfo.foo();
		
	}
	
	static void m2() {
		StudentInfo s = new StudentInfo();
		System.out.println(s.rollNumber);
		System.out.println(s.name);
		System.out.println(StudentInfo.schoolname);
		s.dipalyData();
		s.instanceMethod();
		StudentInfo.staticMethod();
		StudentInfo.foo();
		
	}

}
