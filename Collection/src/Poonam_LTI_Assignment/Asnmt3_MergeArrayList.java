package Poonam_LTI_Assignment;

import java.util.ArrayList;

public class Asnmt3_MergeArrayList {
	
	public static void main(String[] args) {
		
	int[] a= {1,2,4,6,3,6};
	int[] b= {2,3,8,9,0,7};
	
	ArrayList al = new ArrayList();
	for(int e : a)
	{
		if(isDuplicate(a , e) == false)
		{
			al.add(e);
		}
	}
	for(int e : b)
	{
		if(isDuplicate(b , e) == false)
		{
			al.add(e);
		}
	}
	System.out.println(al);
}
	static boolean isDuplicate(int[] arr , int n)
	  {
		  int frequency =0;
		  for (int e : arr) {
			if(n == e) {
				frequency++;
				if(frequency >= 2) {
					return true;
				}
			}
		}
		  return false;
		  
	  }
}