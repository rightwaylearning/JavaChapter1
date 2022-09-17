package compile_time_poly.com;

class E {

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

public class Case5Demo {
	public static void main(String[] args) {
		E e = new E();
		
		e.m1(10); // Integer
		
		e.m1(10.10);  // Number
		
		e.m1('A');  //  Object
		
		e.m1(true);  // Object
	}
}
