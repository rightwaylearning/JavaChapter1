package Sonali_collection_Iterator;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_Array {
	
	public static void main(String[] args) {
		
		
		int [] arr = {3,2,4,5,6,4,2,5,4,5,4,5};
		
		Set<Integer> s = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		
		for (Integer i : arr) {
                  boolean f = s.add(i);
		
		if(f==false) {
			duplicate.add(i);
			}
		}
		System.out.println(duplicate);
	}
}
