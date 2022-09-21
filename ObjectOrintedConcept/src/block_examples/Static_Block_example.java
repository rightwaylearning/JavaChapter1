package block_examples;

public class Static_Block_example{
	static {
		System.out.println("I am first static block");  // 1
	}
	{
		System.out.println("I am first instance block");  // 4
	}
	Static_Block_example(){
		System.out.println("I am constructor"); // 6
	}
	static {
		System.out.println("I am second static block");  // 2
	}
	{
		System.out.println("I am second instance block");  // 5
	}
	public static void main(String[] args) {
		System.out.println("I am main method start");  // 3
		Static_Block_example  b = new Static_Block_example();
		Static_Block_example  b1 = new Static_Block_example();
		Static_Block_example  b2= new Static_Block_example();
		System.out.println("I am main method end");  // 7
	}
	
}


