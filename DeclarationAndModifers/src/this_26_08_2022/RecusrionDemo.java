package this_26_08_2022;

public class RecusrionDemo {

	void foo() {
		System.out.println(" hello, I am foo() method");
		this.foo();
	}
	
	public static void main(String[] args) {
		
		RecusrionDemo obj = new RecusrionDemo();
		obj.foo();
		
		 // OR
	
		// new RecusrionDemo().foo();
	  
	}
}
