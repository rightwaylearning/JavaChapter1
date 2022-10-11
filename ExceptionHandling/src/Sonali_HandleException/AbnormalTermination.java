package Sonali_HandleException;

import java.util.Scanner;

public class AbnormalTermination {
	
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		System.out.println("Start the program");
		try {
		int r =10/d;
		System.out.println(r);
	}catch(Exception e) {
		System.out.println("handle Exception");
	}
		System.out.println("Program normally terminated");

}
}