package ProgramsOnNumbers;

public class SumOfAllDigitQube {

	public static void main(String[] args) {
		int num = 23145;
		int copyOfNum = num;
		int sum = 0;

		while (num > 0) {
			int r = num % 10;
			sum = sum + (r*r*r);
			num = num / 10;
		}
      System.out.println("Qube Sum of given number "+ copyOfNum +"'s digit is ="+ sum);
	}
}
