package ArrayDuplicateElements;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {

		int[] arr = { 3, 4, 5, 3, 4, 5, 6, 8, 6, 4, 3 };
		Set<Integer> s = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		for (Integer i : arr) {
			boolean f = s.add(i);

			if (f == false) {
				duplicate.add(i);
			}

		}
		System.out.println(duplicate);

	}
}
