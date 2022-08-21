package Nilam;

public class SpyNumber {
	public static void main(String[] args) {

		int input = 1;

		while (input <= 1000) {
			int copy = input;
			int sum = 0;
			int product = 1;
			int num = input;

			while (num > 0) {
				int r = num % 10;
				sum = sum + r;
				product = product * r;
				num = num / 10;

			}
			if (sum == product) {
				System.out.println(copy + "is spy number");
			}
			input++;

		}

	}
}