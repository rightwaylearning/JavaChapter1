package Poonam;

public class Star_Pattern {
	
	public static void main(String[] args) {
	
	int n=5;
	for(int r=1; r<=n; r++)
	{
		for(int s= 1; s<= n-r;s++)
		{
		System.out.print("  ");
		}
		for(int j=1; j<=r; j++)
		{
			System.out.print(" *  ");
		}
		System.out.println();
	}
}
}
