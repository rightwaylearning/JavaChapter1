package Sonali_HandleException;

public class TryCatchFinaly2 {
	public static void main(String[] args) {
		System.out.println("Strat execution of program");
		try {
		int r = 10/0;
		System.out.println(r);
		
	}
		catch(NullPointerException e) {
		System.out.println("Exception Catched");
	}
		/*catch(ArithmeticException e) {
			System.out.println("Exception Catched");
		}*/
		finally{
			System.out.println("Final  block executed");
		}
			System.out.println("End program");
		}

}
