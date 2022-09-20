package Sonali_Oops_Examples;

class S{
	{
		System.out.println("I am First instance block");
	}
	void m1() {
		System.out.println("I am m1 method");
	}
	S(){
		System.out.println("I am Constructor");
	}
	{
		System.out.println("I am 2nd instance block");
		m1();
	}
	
}
public class InstanceBlock {
	public static void main(String[] args) {
	
	S a = new S();
	System.out.println("I am main method");
	}
}
