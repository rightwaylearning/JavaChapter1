package ArrayDuplicateRemove;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 3, 2, 3, 4, 1, 2 };
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		Set<Integer> s = new HashSet<>();

		for (Integer i : a) {
			if (!s.contains(i)) {
				s.add(i);

			}

		}
		System.out.println(s);
	}

}
