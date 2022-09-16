package CompileTimePoly.com_Jivan;

class E{
	void m1(Integer i) {
		System.out.println("Integer");
	}
	
	void m1(Number n) {
		System.out.println("Number");
	}
	
	void m1(Object o) {
		System.out.println("Object");
	}
}

public class Case_5 {
	
	public static void main(String[] args) {
		
	E e = new E();
	e.m1(10);      // integer
	
	e.m1(10.10);  // number
	e.m1('A');    // object
	e.m1(true);	  // object	
}
}