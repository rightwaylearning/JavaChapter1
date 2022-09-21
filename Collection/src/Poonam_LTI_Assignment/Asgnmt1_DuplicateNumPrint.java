package Poonam_LTI_Assignment;

import java.util.ArrayList;

public class Asgnmt1_DuplicateNumPrint {
	
	public static void main(String[] args) {
		
		int[] n = {10,20,10,1,4,5,6,4,3,1};
		
		ArrayList al = new ArrayList();
	    for (int e : n) {
	    	if(isDuplicate(n , e))
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