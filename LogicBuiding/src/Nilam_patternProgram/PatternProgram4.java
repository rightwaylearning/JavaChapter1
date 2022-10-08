package Nilam_patternProgram;

public class PatternProgram4 {
	public static void main(String[] args) {
		int r = 5;
		for (int i = r; i >= 0; i--) {
			char ch = 'A';
			for (int c = 1; c <= i; c++) {
				System.out.print(ch + " ");
				ch++;
			}

			System.out.println();

		}

	}

}
