package Damini_Array_Object;

public class two_Array {
	public void test()
	{}
		public static void main(String[] args)
		{
			
			
			int[][] ar=new int[3][2];
			
			int[] a=new int[2];
			
			 a[0]=10;
			 a[1]=20;
			 
			 ar[0]=a;
			 
//--------------------------------------
			 
			 
		ar[1][0]=30;
		ar[1][1]=10;
		
		ar[2][0]=20;
		ar[2][1]=40;
		
		System.out.println(ar[2][0]);
		
			 
			
			
			
		}
	
	

}
