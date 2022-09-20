package Utility.functionality.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();
		List synchList =  Collections.synchronizedList(list);
		
		  Set h = new java.util.HashSet<>();
		 Set ss= Collections.synchronizedSet(h);
		 
		 //-----------------------------
		 
		 ArrayList<String> al = new ArrayList<>();
		 al.add("BB");
		 al.add("CC");
		 al.add("AA");
		  
		 System.out.println(al);
		  Collections.sort(al); // DNSO >>
		  Collections.sort(al, new MyWaySorting());
		 System.out.println(al);
		 
		 int[] arr = {10,34,67,28,90};
		 Arrays.sort(arr);
		 for (int i = 0; i < arr.length; i++) {
			 System.out.println(arr[i]);
			
		}
		
	}
}

 class MyWaySorting implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}
	 
 }

