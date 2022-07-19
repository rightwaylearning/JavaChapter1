package main_package;

public class Controller {

	public static void main(String[] args) {
		
		// object creation
		MathsOp m = new MathsOp();
		
		// method call
		int z =10;
		int y = 20;
		
		m.doSum(z,y);  
		m.doSum(100, 200);
		m.doSum(1000, 999);
		
		int sqr = m.squre(10);
		System.out.println(sqr);
		
	}
}
