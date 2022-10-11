package Basic_Info;

import java.util.Scanner;

public class AbnormalTermination {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter the number");
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		System.out.println("Program is start");
		try {
		int r = 10/d;
		System.out.println(r);
		}catch(Exception e) {
			System.out.println(e);
		}	
		System.out.println("Thanks god! ! normal termination");
	}
}
