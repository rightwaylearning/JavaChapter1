package Nilam_ArrayProgram;

public class ReversArray {
	public static void main(String[] args) {

		int[] arr = { 10, 12, 11, 34, 56, 43, 22, 20, 50 };

		for (int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
