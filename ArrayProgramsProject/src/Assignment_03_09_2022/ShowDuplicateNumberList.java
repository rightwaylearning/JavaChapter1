package Assignment_03_09_2022;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class ShowDuplicateNumberList {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 9, 3, 5, 3, 1, 6, 8, 9, 3, 4, 9 }; // 1,3,9

		Set<Integer> s = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		for (int i : arr) {
	
			boolean f = s.add(i);
			
			if (f == false) {
				duplicate.add(i);
			}
		}
		System.out.println(duplicate);
		Vector v;
		v.elements();;
	}
}
