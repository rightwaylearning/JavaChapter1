package block_examples;

class A{
	{
		System.out.println("I am instance block");
	}
	void m1() {
		System.out.println("I am m1 method");
	}
	A(){
		System.out.println("Hello Good morning....");
		m1();
	}
	
	A(int a){
		System.out.println("Hello I am 2nd constructor");
	}
	{
		System.out.println("I am 2nd instance block");
		m1();
	}
}



public class Controller {

	public static void main(String[] args) {
		A a= new A(10);
		System.out.println("I am main method.");
		
	}
}
