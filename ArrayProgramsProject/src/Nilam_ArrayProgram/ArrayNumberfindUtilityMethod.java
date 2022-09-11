package Nilam_ArrayProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayNumberfindUtilityMethod {
	public static void main(String[] args) {
		int[] arr = { 90, 20, 45, 67, 55, 44, 45, 90 };
		Set<Integer> set = new HashSet<>();
		for (Integer i : arr) {
			set.add(i);
		}
		System.out.println(set);

		List<Integer> l = new ArrayList<>(set);
		
		Collections.sort(l);
		System.out.println(l);
		System.out.println("max  =" + l.get(l.size() - 1));
		System.out.println("max = " + l.get(l.size() - 3));

	}

}
