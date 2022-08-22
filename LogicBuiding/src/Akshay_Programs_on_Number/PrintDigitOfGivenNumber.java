package Akshay_Programs_on_Number;

public class PrintDigitOfGivenNumber {

		public static void main(String[] args) {
			
			int p = 45987852;
			int r;
			while (p > 0) {
				
				r = p % 10;
				System.out.print(r);
				p = p /10;
			}
		}
}
