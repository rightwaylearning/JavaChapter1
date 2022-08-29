package Damini_ArrayLogicalprogram;

public class CountNumber {

	public static void main(String[] args) {
		int[] ar= {20,70,80,90};
		int r= countelement(ar);
		System.out.println(r);
		
		// OR System.out.println(countElement(arr1));
		int[] ar2= {};
		System.out.println(countelement(ar2));
		
		int[] ar3=null;
		int r1=countelement(ar3);
		if(r1==-1)
		{
			System.out.println("given array is null");
			
		}
		else {
			System.out.println(r);
		}
		//System.out.println(countelement(ar3));
	}

 static int countelement(int[] ar) {
		int count=0;
		if(ar!=null)
		{
			for(int i=0;i<ar.length;i++)
			{
				count++;
			}
			return count;
		}
		else
		{
		return -1;
		}
	}
}
