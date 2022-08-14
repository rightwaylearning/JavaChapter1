package ProgramsOnNumbers;

import java.util.Scanner;

public class BuzzNumberProgram {
	/*
	 * 3] Buzz Number Program in Java A number is said to be Buzz Number if it ends
	 * with 7 or is divisible by 7. Example: 1007 is a Buzz Number.
	 * 
	 */
	public static void main(String[] args) {

		while (true) {
			
			System.out.println("Please Enter Input OR If you want to exit Enter zero");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
             if(num == 0) {
            	 break;
             }
             
			if (num % 7 == 0) {
				System.out.println(num + " is Buzz Number.");
			} else {
				System.out.println("sorry");
			}
			
		}
		
		System.out.println("Progam is over");
	}
}
