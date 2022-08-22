package Kalpesh;

public class Newwww {
	public static void main(String[] args) {
		int num = 153;
		int copyOfNum = num;
		int sum = 0;
		
		while(num > 0) {
			int r = num % 10;
			sum = sum + (r*r*r);
			num =num/10;
		}
		
		if(sum == copyOfNum) {
			System.out.println("ArmstronNumber");
		}else {
			System.out.println("Sorry");
		}
	}
	
	{
		int num1 = 1234;
		int sum = 0;
		
		
		int r = num1 % 10;
		sum = sum + (r*r*r);
	num1 = num1/10;
	System.out.println(r);
	
	
	
	
	
	
	
	}
}



