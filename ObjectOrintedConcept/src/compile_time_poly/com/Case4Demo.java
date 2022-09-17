package compile_time_poly.com;

class D {
	void m1(Integer a) {
		System.out.println("Integer ref type");
	}

	void m1(Byte b) {
		System.out.println("Short ref type");
	}

	void m1(short s) {
		System.out.println("short args");
	}
	
}

public class Case4Demo {
	public static void main(String[] args) {
       D d= new D();
       d.m1(10); // int >> 1] match
                        // 2] up cast
                        // 3] auto boxing 
       
       byte b = 10;
       d.m1(b);
	}
}
