package ProgramsOnNumbers;

public class SpacialNumber {

	public static void main(String[] args) {
		int n = 145;
		int copy = n;
		int sum =0;
		
		while(n > 0) {
			int r = n % 10;
			sum = sum + factorial(r);
			n =n /10;
		}
		
		if(copy == sum) {
			System.err.println("This is spacial Number");
		}else {
			System.out.println("sorry");
		}
		
		
	}
	
	
	static int factorial(int num) {
		int fact = 1;
		while(num > 0) {
		  fact = fact * num;
		  num--;
		}
		return fact;
	}
}
