package Nilam_patternProgram;

public class mirrorImagePattern9 {
	public static void main(String[] args) {
		int r =10;
		for(int i= 1;i<=r;i++) {
		for(int s= 1;s<=r-i;s++) {
			
			System.out.print("  ");
			}
			for(int j =1;j<=i;j++) {	
				System.out.print( " *");
		
		}
			System.out.println();
		}
	
	int w= r-1;
		
		for (int i = 1; i <= w; i++) {
			
			for (int s = 1; s <=i; s++) {
				System.out.print("  ");
			}

			for (int j = w; j >= i; j--) {
				System.out.print(" *");
			}
			
			System.out.println();
		}

	
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
