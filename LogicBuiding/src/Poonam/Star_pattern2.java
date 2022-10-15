package Poonam;

public class Star_pattern2 {
	public static void main(String[] args) {
		
	
	int n=5;
	for(int r=n; r<=1; r--)
	{
		for(int s= 1; s<= n-r;s++)
		{
		System.out.print("  ");
		}
		for(int j=5; j<=r-1; j--)
		{
			System.out.print(" *  ");
		}
		System.out.println();
	}
	}
}
