package Arithmatic_Akshay;

public class Numbertrail {
	
	public static void main(String[] args) {
		
		long num = 1341123181L;
		int digit = 1;
		int frequency = 0;
		
		while (num>0) {
			
			long r = num % 10;
			if (r == digit) {
				frequency ++;
			}
		num = num / 10;	
		}
		System.out.println("Frequency of given digit "+digit+"is "+num);
	}

}
