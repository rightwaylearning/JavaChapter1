package Jivan_Assignment_03_09_2022;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class ShowDuplicateNumberList {

	public static void main(String[] args) {
		int[] arr = {1, 4, 7, 8, 9, 6, 3, 2, 5, 8, 7, 4, 5, 6, 3, 2, 1, 4};
		
		Set<Integer> s = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
	//	System.out.println(s.add(10));
		
		for (int i : arr) {
			boolean f = s.add(i);
			if(f == false) {
				duplicate.add(i);
			}
		}
//		System.out.println(s);
		System.out.println(duplicate);
	//	Vector v;
//		v.elements();
	}
}
