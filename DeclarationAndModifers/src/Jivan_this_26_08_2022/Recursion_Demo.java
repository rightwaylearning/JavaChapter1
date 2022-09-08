package Jivan_this_26_08_2022;

public class Recursion_Demo {
	
	void foo() {
		System.out.println("Hello, I am foo() method");
		this.foo();
	}
	
	public static void main(String[] args) {
		
	    Recursion_Demo obj = new Recursion_Demo();
		obj.foo();
		
		// OR
		// new Recursion_Demo().foo();
	}

}
1