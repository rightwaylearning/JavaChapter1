package top.ten.exception;


public class StackOverFlowErrorDemo {

	void m1() {
		
		Integer[] aa = new Integer[1000000];
		System.out.println("I am m1 method");
		m2();
		System.out.println("done m1...");
	}
	
	void m2() {
		Integer[] aa = new Integer[1000000];
		System.out.println("I am m2 method");
		m1();
		System.out.println("done m2...");
	}
	
	public static void main(String[] args) {
		new StackOverFlowErrorDemo().m1();
	}
}
