package Damini_ExceptionHandling;

public class Basic_Program {

	public static void main(String[] args) {
		try {
			int i=10/0;
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
