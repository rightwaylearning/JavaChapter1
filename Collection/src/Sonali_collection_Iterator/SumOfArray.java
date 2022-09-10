package Sonali_collection_Iterator;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {

		int sum = 0;
		int[] a = { 3, 2, 1, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}

		System.out.println(sum);
	}
}