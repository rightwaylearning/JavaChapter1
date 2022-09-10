package Sonali_Oops_Examples;

public class Controller {
	
	public static void main(String[] args) {
		 MathOperation m = new MathOperationImpl();
		
		 System.out.println(m.doAddition(10, 20));
		 System.out.println(m.doSubstraction(30, 10));
	}

}
