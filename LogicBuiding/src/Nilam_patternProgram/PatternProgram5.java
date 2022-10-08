package Nilam_patternProgram;

public class PatternProgram5 {
	public static void main(String[] args) {

		int r = 5;

		for (int i = 1; i <= r; i++) {

			for (int j = r; j >= i; j--) {

				System.out.print('*' + " ");
			}

			System.out.println();
		}

	}

}
