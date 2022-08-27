package Damini;

public class palindrom {

	public static void main(String[] args) {
		int num= 5645;
		String rev="";
		int num1=num;
		
		while(num>0)
		{
			int r=num%10;
			rev=rev+r;
			num=num/10;
		}
		int a1=Integer.parseInt(rev);
		
		if(a1==num1)
		{
			System.out.println("number is palindrom");
		}
		else
		{
			System.out.println("number is not palindrom");
		}
	}
}
