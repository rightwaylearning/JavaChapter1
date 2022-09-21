package block_examples;

class B {
	
	int a;
	final int b;
	
	{
		a = 10;
		b = 30;
	}

	B() {
		a = 20;

	}
	
	

}

public class UseOfInstanceBlock {
	
	
	public static void main(String[] args) {
         B b= new B();
         System.out.println(b.a); //20
	}
	
}
