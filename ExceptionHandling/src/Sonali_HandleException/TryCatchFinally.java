package Sonali_HandleException;

public class TryCatchFinally {
	public static void main(String[] args) {
		System.out.println("Program start");
		try {
			int r = 10 / 0;

			System.out.println(r);
		} catch (ArithmeticException e) {
			System.out.println("Exception Occured");
		} finally {
			System.out.println("Finally Block Excuted");
		}
		System.out.println("Program end");
	}

}
