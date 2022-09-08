package Damini_ArrayLogicalprogram;

public class checkarraysorted {

	public static void main(String[] args) {
		int[] arr= { 1, 2, 2, 3, 4, 4, 5, 5, 5, 6, 100 };
		
		boolean f=true;
		boolean asce=false;
		boolean dsce=false;
		
		for(int i=0;i<arr.length-1; i++)
		{
			if(!dsce)
			{
				if((arr[i]<arr[i+1])) {
					asce=true;
					f=true;
				}
				else
				{
					f=false;
				}
				}
			if(!asce)
			{
				if((arr[i]>arr[i+1])) {
					dsce=true;
					f=true;
				}
				else
				{
					f=false;
				}
				}
			
			
			}
		if(f)
		{
			System.out.println("sorted array asce is"+asce);
			System.out.println("sorted arrat dsce is"+dsce);
		}
			else
			{
				System.out.println("not found");
				System.out.println();
			}
		}
			
		
	}

