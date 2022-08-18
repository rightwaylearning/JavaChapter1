package Damini;

public class Sum_Number {
	public static void main(String[] args) {
		int sum=0;
		int num=345678;
		
		
		while(num>0);
		{
			int r=num%10;
			sum=sum+r;
			num=num/10;
			
		}
		System.out.println(sum);
	}

}
