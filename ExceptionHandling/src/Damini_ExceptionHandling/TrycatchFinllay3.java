package Damini_ExceptionHandling;

public class TrycatchFinllay3 {

	public static void main(String[] args) {
		try
		{
			System.out.println("line1");
			System.out.println("line2"+10/0);
			System.out.println("line3");
		}
		catch(Exception e)
		{
			System.out.println("line4");
		}
		finally {
			System.out.println("Finally block");
		}
		try
		{
			System.out.println("line5"+10/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Normal termination of program");

	}
}
