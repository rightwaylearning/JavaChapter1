package Nilam;

public class SumOfGivenNumberDigit_SpyNumber {
	public static void main(String[] args) {
		int input = 1;
		while (input < 1200) {
			int num = input;
			int copy = num;
			int sum = 0;
			int product = 1;

			while (num > 0) {
				int r = num % 10;
				sum = sum + r;
				product = product * r; //
				num = num / 10;
			}
			if (product == sum) {
				System.out.println(" given number "+copy+"is spy number=" +sum);
			} else {
				System.out.println("not spy number");
			}
			input++;
			// System.out.println("given number "+copy+" digit= "+sum);
		}
		}

	}
