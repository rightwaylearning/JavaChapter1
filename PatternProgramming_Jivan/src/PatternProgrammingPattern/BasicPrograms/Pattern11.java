package PatternProgrammingPattern.BasicPrograms;

public class Pattern11 {

	public static void main(String[] args) {
		
		int n = 10;
		
		for(int r = 1; r <= n; r++) {
	//	for(int r = 1; r >= n; r--) {
			
	//		for(int s = 1; s <= r; s++) {
			for(int s = 1; s <= n-r; s++) {
				System.out.print(" ");
			}
			
			for(int c = 1; c <= r; c++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
