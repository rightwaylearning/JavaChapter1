package Nilam_patternProgram;

public class PatternProgram4 {
	public static void main(String[] args) {

		for (int r = 5; r >= 0; r--) {
			char ch = 'A';
			for (int c = 1; c <= r; c++) {
				System.out.print(ch + " ");
				ch++;
			}
			
			System.out.println();
			
		}

	}

}
