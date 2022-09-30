package Poonam;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num =1231;
		int CopyOfNum = num;
		String rev= "";
		
		while(num>0)
		{
			int r = num%10;
			rev=rev+r;
			num=num/10;			
		}
		int rev1=Integer.parseInt(rev);
		
		if(rev1==CopyOfNum)
		{
			System.out.println(+CopyOfNum + " - Number is palindrome...");
		}
		else
		{
			System.out.println(+CopyOfNum + " - Number is Not palindrome...");
		}
	}
}
