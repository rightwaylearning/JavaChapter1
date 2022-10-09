package Nilam_patternProgram;

public class mirrorImagePattern8 {
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
		
	}

}
