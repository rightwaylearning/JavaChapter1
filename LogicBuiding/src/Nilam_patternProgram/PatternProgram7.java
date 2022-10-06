package Nilam_patternProgram;

public class PatternProgram7 {
	public static void main(String[] args) {

		int r1 = 10;

		for (int i = 1; i <= r1; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print('*' + " ");
			}

			System.out.println();
		}

		int a = r1 - 1;

		for (int i = 1; i <= a; i++) {
			for (int j = a; j >= i; j--) {

				System.out.print('*' + " ");
			}

			System.out.println();
		}
	}

}
