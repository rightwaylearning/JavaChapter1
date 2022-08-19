package Damini;

public class SpyNumber {
	
	public static void main(String[] args) {
		int r=1,sum=0,result;
		int n=23;
		
		while(n>0)
		{
			result=n%10;
			sum=sum+result;
			r=r*result;
			n=n/10;
			
			
			
			
		}
		if(sum==r)
		{
			System.out.println("Given Number is spy");
			
		}
		else
		{
			System.out.println("Given number is not spy");
		}
	}

}
