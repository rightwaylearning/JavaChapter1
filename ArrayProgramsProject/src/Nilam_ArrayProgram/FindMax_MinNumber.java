package Nilam_ArrayProgram;

public class FindMax_MinNumber {

	public static void main(String[] args) {

		Integer[] arr = { 10, 20, 70, 80, 90, 100 };

		Integer max = arr[0];

		for (Integer i : arr) {
			if (i > max) {
				max = i;

			}

		}
		System.out.println(max);

		// find secondmax Number
		Integer secondmax = arr[0];
		for (Integer i : arr) {
			if (i > secondmax && i != max) {
				secondmax = i;
			}
		}
		System.out.println(secondmax);

		// find min number
		Integer min = arr[0];
		for (Integer i : arr) {
			if (i < min) {
				min = i;
			}
		}
		System.out.println(min);
		Integer secondmin = arr[1];
		for (Integer i : arr) {
			if (i < secondmin && i != min) {
				secondmin = i;
			}
		}

		
		System.out.println(secondmin);

	}

}
