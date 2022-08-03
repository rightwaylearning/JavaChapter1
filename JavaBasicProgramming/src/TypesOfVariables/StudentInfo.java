package TypesOfVariables;

public class StudentInfo {

	int rollNumber;
	String name;
	static String schoolname;
	
	void dipalyData() {
		System.out.println(rollNumber); //this.rollNumber
		System.out.println(name);  // this.name
		System.out.println(schoolname);	  //StudentInfo.schoolname	
		instanceMethod(); // this.instanceMethod();
		staticMethod();  // StudentInfo.staticMethod();
	}
	
	static void foo() {
		System.out.println(schoolname);	 //StudentInfo.schoolname
		staticMethod();  // StudentInfo.staticMethod();
		
		StudentInfo s = new StudentInfo();
		System.out.println(s.rollNumber); 
		System.out.println(s.name);
		s.instanceMethod();
	}
	
	void instanceMethod() {}
	static void staticMethod() {}
}
