package Damini_ExceptionHandling;

import java.util.Scanner;

public class AbnormalTermination {

	public static void main(String[] args) {
		System.out.println("please enter number");
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		System.out.println("program is start");
		try {
			int r=10/t;
			System.out.println(r);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("normal termination");
	}
}
