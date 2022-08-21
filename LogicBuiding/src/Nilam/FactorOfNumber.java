package Nilam;

public class FactorOfNumber {
	public static void main(String[] args) {

		int num = 20;
		int start = 1;

		while (start < num) {

			if (num % start == 0) {
				System.out.println(start + " ");

			}
			start++;
		}

	}
}