package polymorphism_examples;

class B {

	void m1(int a) {
		System.out.println("int arg method");
	}
	
	void m1(short s) {
		System.out.println("short arg method");
	}

	void m1(double d) {
		System.out.println("double arg method");
	}
	
	void m1(char ch) {
		System.out.println("char arg method");
	}

}

public class Case2MethodOverlodding {
	public static void main(String[] args) {
            B b= new B();
            
            byte y = 101;
            b.m1(y); 
            
            long l = 9099090909L;
            b.m1(l);
            
            b.m1('A');
	}
}
