package Nilam;

public class SumOfAllDigitQube {
	public static void main(String[] args) {
		
		int n = 45454;
		int sum = 0;
		
		while(n>0) {
			int result = n%10;
			sum = sum+(result*result*result);
			n = n/10;
			
		}
		System.out.println("given number "+45454+" digit qube is=" +sum);
		
	}
	
}
