package ProgramsOnNumbers;

public class FindOutOccurancesOfDigit {

	public static void main(String[] args) {
		long num = 222223345411L;
		int digit = 3; int frequency = 0;
		
		while(num > 0) {
			long r = num % 10;
			if(r == digit) {
				frequency++;
			}
			num = num / 10;
		}
		
		System.out.println("frequency of givin digit "+ digit +" is = "+ frequency);
		
		
		
	}
}
