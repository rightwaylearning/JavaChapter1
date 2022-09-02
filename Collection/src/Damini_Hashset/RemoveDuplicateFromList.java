package Damini_Hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList {
	
	public static void main(String[] args) {
		
		int[] ar= {10,20,40,60,50,10,20};
		
		//OR
		
		List<Integer> ll=new ArrayList<Integer>();
		
		ll.add(20);ll.add(10);ll.add(30);ll.add(20);ll.add(40);

		// option 1 to remove duplicate

		List<Integer> output=new ArrayList<Integer>();
		
		for(int item:ll)
		{
			if(output.contains(item)==false)
			{
				output.add(item);
			}
		}
		System.out.println(output);
		
		//option 2
	       Set<Integer> ss=new HashSet<Integer>(ll);
	       System.out.println(ss);

	}
	}
