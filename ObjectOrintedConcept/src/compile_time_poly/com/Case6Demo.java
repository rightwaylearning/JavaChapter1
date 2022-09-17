package compile_time_poly.com;

class F {
	

	void m1(Object o) {
		System.out.println("Object");
	}

	void m1(String s) {
		System.out.println("String");
	}
	
	void m1(Number n) {
		System.out.println("Number");
	}
	
}

public class Case6Demo {

	public static void main(String[] args) {
		F f= new F();
		
		f.m1(null); 
	}
}
