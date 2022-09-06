package Oops_Sonali;


class Parent{
	public void m1() {
		System.out.println("I am parent method");
	}
	
	class Child extends Parent{
		public void m2() {
			System.out.println("I am child method");
		}
	}
}
public class Is_A_Relationship {
	
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		//p.m2();
		
		
		
		
		
}
}