package Nilam_assignment;

import java.util.ArrayList;
import java.util.List;

public class Findevenoddarray {

	public static void main(String[] args) {
		int[] arr = { 10, 33, 41, 12, 13, 14 };

		List<Integer> l = new ArrayList<>();
		for (Integer i : arr) {
			l.add(i);

			if (i % 2 == 0) {
				System.out.println("even number");
			} else
				System.out.println("odd number");

		}

	}

}