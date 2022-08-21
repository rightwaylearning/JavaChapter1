package Nilam;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int num = 1;
		int firstterm=0;
		int secondterm=1;
		
		while(num<=20) {
			int nextterm = firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
			num++;
			System.out.println(firstterm);
		}

		
	}

}
