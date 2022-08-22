package Akshay_Programs_on_Number;

public class SpecialNumber {
	
	public static void main(String[] args) {
		
		int a = 1234;
		int copya = a;
		int sum = 0;
		
		while (a > 0) {
			
			int r = a % 10;
			sum = sum + r;
			a = a / 10;
		}
		
		if (copya == sum) {
			
			System.out.println("This is a Special number");
		}
		else {
			
			System.out.println("This is not a Special number");
		}
			
	}

}
