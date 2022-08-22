package Nilam;

public class Fibonacci {
	public static void main(String[] args) {
          int i=1 ;
		int n = 10;
		int firstterm = 0;
		int secondtrem = 1;
		System.out.println("Fibonacci series  " + n + "term");

		while (i <=n) {
			int next = firstterm + secondtrem;
			System.out.println(next);

			firstterm = secondtrem;
			secondtrem = next;

			i++;
			//System.out.println("firstterm  " + " ");

		}

	}
}