package compile_time_poly.com;

class A {

	void m1(int a) {
		System.out.println("single - int - args");
	}

	void m1(int a, int b) {
		System.out.println("two (int,int) - args");
	}

	void m1(float a, float b) {
		System.out.println("two(float, float) - args");
	}

	void m1(int a, float b) {
		System.out.println("two (int, float) - args");
	}

	int m1(float a, int b) {
		System.out.println("two (float, int) - args");
		return 0;
	}
}

public class Case1Demo {
	public static void main(String[] args) {
          A a = new A();
          // A is reference type  & compiler always go throw reference type
           a.m1(0);
           a.m1(0, 0);
           a.m1(0.0f, 0.0f);
           a.m1(0.0f, 0);
           a.m1(0,0.0f);
	}

}
