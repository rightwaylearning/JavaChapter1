package basic.info;

import java.util.Scanner;

public class AbnormalTermination {

	public static void main(String[] args) {
		System.out.println("please enter number");
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		System.out.println("program is start");
		try {
		 int r = 10/d;
		 System.out.println(r);
		}catch(Exception e) {
			System.out.println(e); 
		}
		System.out.println("thanks god!! normal termination");
	}
}
