package ProgramsOnNumbers;

public class SumOfGivenNumberDigit {

	public static void main(String[] args) {
		int num = 675436;
		int copyOfNum = num;
		int sum = 0;

		while (num > 0) {
			int r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		
		System.out.println(" given number "+copyOfNum+" digit sum is = " + sum);
	}
}
