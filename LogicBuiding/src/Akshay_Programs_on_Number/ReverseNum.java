package Akshay_Programs_on_Number;

public class ReverseNum {
	
	public static void main(String[] args) {
		
		int a = 1234;
		int copya = a;
		String rev = "";
		
		while ( a > 0) {
			
			int r = a % 10;
			rev = rev + r;
			a = a / 10;
		}
		int revNum = Integer.parseInt(rev);
		System.out.println("Original Number is =  "+copya+" & revised number is =  "+revNum);
		
	}

}
