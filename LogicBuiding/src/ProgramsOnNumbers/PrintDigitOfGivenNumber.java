package ProgramsOnNumbers;

public class PrintDigitOfGivenNumber {

	public static void main(String[] args) {
		
		int n = 546000384;
		int r;
		while(n > 0) {
			r = n % 10;
			System.out.println(r);  
			n = n /10; 
		}
		
	}
}
