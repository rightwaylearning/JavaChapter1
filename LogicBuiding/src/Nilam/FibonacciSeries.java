package Nilam;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int i =1;
		int firstterm=0;
		int secondterm=1;
		 while(i<=20) {
			 
			 int nextterm=firstterm+secondterm;
			 firstterm=secondterm;
			 secondterm=nextterm;
			 System.out.println(firstterm);
				i++;
		 }
	
	}

}
