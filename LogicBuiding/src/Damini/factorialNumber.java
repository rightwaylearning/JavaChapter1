package Damini;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) {
		int i=5;
		int fact=1;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int num=s.nextInt();
		
		while(i<=num)
		{
			fact=fact*i;
			i--;
		}
		System.out.println("factorial of"+num + "is:"+fact);
	}
}
