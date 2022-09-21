package Assignment_LTI_damini;

import java.util.ArrayList;
import java.util.List;

public class Ass1DuplicateNumber {
	public static void main(String[] args) {
		int[] n = { 1, 3, 4, 5, 7, 65, 21, 1, 4, 5 };

		List l = new ArrayList();
		for (int i : n) {
			if (isDuplicate(n, i)) {
				l.add(i);
			}
		}
		System.out.println(l);
	}

	static boolean isDuplicate(int[] ar, int n) {
		int fr = 0;
		for (int i : ar) {
			if (n == i) {
				fr++;
				if (fr >= 2) {
					return true;
				}
			}
		}
		return false;
	}
}
