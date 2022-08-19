package Nilam;

public class fibonacciSeries {
	public static void main(String[] args) {

		int n = 20;
		int i = 1;
		int firstterm = 0;
		int secondterm = 1;

		while (i <= n) {
			int nextterm = firstterm + secondterm;
			firstterm = secondterm;
			secondterm = nextterm;
			i++;
			System.out.println(nextterm);
		}
		}

		
}