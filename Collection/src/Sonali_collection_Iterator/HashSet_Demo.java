package Sonali_collection_Iterator;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet_Demo {
	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		set.add(10);

		System.out.println(set);
		System.out.println(set.size());

		// ========================================
		HashSet<String> s = new HashSet<>();
		s.add("sonali");
		s.add("TYBCS");
		s.add("sonali");
		System.out.println(s);
		System.out.println(s.size());

		// =========================================
		int[] arr = { 30, 40, 50, 65, 43, 23, 45, 30, 40, 45,65 };
		int max = arr[0];
		LinkedHashSet<Integer> uniqueItem = new LinkedHashSet<>();
		LinkedHashSet<Integer> DuplicateItem = new LinkedHashSet<>();
		LinkedHashSet<Integer> Maximum = new LinkedHashSet<>();

		for (int i : arr) {
			boolean flag = uniqueItem.add(i);

			if (flag == false) {
				DuplicateItem.add(i);

			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				System.out.println(max);

			}
		}
		System.out.println(uniqueItem);
		System.out.println(DuplicateItem);
		System.out.println(max);

	}
}