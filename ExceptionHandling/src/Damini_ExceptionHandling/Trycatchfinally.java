package Damini_ExceptionHandling;

public class Trycatchfinally {

	public static void main(String[] args) {
		System.out.println("Program Start");
		try {
			int r = 10 / 0;
			System.out.println(r);
		} catch (ArithmeticException e) {
			System.out.println("Exception occured");
		} finally {
			System.out.println("Finally executed");
		}
		System.out.println("program end");
	}
}
