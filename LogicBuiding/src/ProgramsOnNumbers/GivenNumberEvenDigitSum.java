package ProgramsOnNumbers;

public class GivenNumberEvenDigitSum {

	public static void main(String[] args) {
		int num = 675436;
		int copyOfNum = num;
		int sum = 0; int sum1 =0;

		while (num > 0) {
			int r = num % 10;
			
			if (r % 2 == 0) {
				sum = sum + r;
			}else {
				sum1 = sum1 + r;
			}
			
			num = num / 10;
		}

		System.out.println(" given number " + copyOfNum + " Even digit sum is = " + sum);
		System.out.println(" given number " + copyOfNum + " Odd digit sum is = " + sum1);
	}
}
