package set_collection_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,10,20,60};
		// OR
		
		
		List<Integer> list = new ArrayList<>();
		list.add(10);list.add(20);list.add(30);list.add(40);
		list.add(10);list.add(20);list.add(60);
		
		// option 1 to remove duplicate
		List<Integer> output = new ArrayList<>();
		
		for(Integer item : list) {
			if(output.contains(item) == false) {
				output.add(item);
			}
		}
		System.out.println(output);
		
		// option 2
			
	    Set<Integer> set = new HashSet<>(list);
	    System.out.println(set);
	  
	}
}
