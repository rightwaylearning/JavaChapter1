package CompileTimePoly.com_Jivan;

class A{
	void m1(int a) {
		System.out.println("single - int - args");
	}
	
	void m1(float a, float b) {
		System.out.println("two(float, float) - args");
	}
	
	int m1(int a, float b) {
		System.out.println("two(int , float) - args");
		return 0;
	}
	
	int m1(float a, int b) {
		System.out.println("two(float, int) - args");
		return 0;
}

public static class Case_1 {
	
	public static void main(String[] args) {
		A a = new A();
		 a.m1(0);
	//  	 a.m1(0, 0);
		 a.m1(0.0f, 0.0f);
		 a.m1(0.0f, 0);
		 a.m1(0, 0.0f);
	}

}
}