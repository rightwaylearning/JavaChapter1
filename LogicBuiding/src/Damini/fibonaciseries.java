package Damini;

public class fibonaciseries {
	public static void main(String[] args) {
		int i=1;
		
		int first=0;
		int second=1;
		
		while(i<=10)
		{
			int a=first+second;
			System.out.println(first+"");
			first=second;
			second=a;
			i++;
			
		}
		
	}

}
