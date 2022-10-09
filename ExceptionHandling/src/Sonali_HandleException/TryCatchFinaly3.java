package Sonali_HandleException;

public class TryCatchFinaly3 {
	public static void main(String[] args) {
		try {
			System.out.println("line 1");
			System.out.println("line 2" + 10/0 );
			System.out.println("line 3");
		}
		catch(Exception e) {
			System.out.println("line 4");
		}
		finally {
			System.out.println("Finally block excuted");
		}
			try {
			System.out.println("line 5" + 10/0);
		}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
		System.out.println("Normal termination of program");
	}

}
