package Damini_ExceptionHandling;

public class Cal_Controller {

	public static void main(String[] args) {
		System.out.println("hello............");
		user u=new user();
		int a=10;
		int b=20;
		try {
			u.c.sum(a, b);
		
		}
		catch(NullPointerException e)
		{
			u.c=new cal();
			u.c.sum(a, b);
			
		}
		System.out.println("prog is complete");
	}
}
