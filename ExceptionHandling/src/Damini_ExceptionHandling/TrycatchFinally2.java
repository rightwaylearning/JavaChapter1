package Damini_ExceptionHandling;

public class TrycatchFinally2 {

	public static void main(String[] args) {
		System.out.println("start");
		try
		{
			int r=10/0;
			System.out.println(r);
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception catch");
		}
		finally
		{
			System.out.println("finally executed");
		}
		System.out.println("end");
	}
}
