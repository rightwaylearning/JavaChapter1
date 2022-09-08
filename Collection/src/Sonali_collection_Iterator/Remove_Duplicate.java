package Sonali_collection_Iterator;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate {
	
	public static void main(String[] args) {
		
		int [] arr = {2,3,2,3,4,5 ,6,6,9,8};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		Set<Integer> n =  new HashSet<Integer>();
		for (int i : arr) {
			if(!n.contains(i)) {
				n.add(i);
			}
			
		}
		System.out.println(n);
		
	}

}
