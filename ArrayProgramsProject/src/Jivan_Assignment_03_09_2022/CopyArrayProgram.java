package Jivan_Assignment_03_09_2022;

public class CopyArrayProgram {

	public static void main(String[] args) {

		// int[] arr = {1, 2, 3, 4, 5};
		int[] arr = { 100, 200, 300, 400, 500, 600, 700 };
		Result copy = copyArray(arr);

		for (int i : copy.evenArray) {
			System.out.print(i + " ");
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		for (int i : copy.oddArray) {
			System.out.print(i + " ");
		}
	}

	static Result copyArray(int[] origionalArray) {

		int[][] result = new int[2][];
		int[] evenIndexArray;
		int[] oddIndexArray;

		// int[] copy = new int[origionalArray.length];
		if (origionalArray.length % 2 == 0) {
			evenIndexArray = new int[origionalArray.length / 2];
			oddIndexArray = new int[origionalArray.length / 2];
		} else {
			evenIndexArray = new int[(origionalArray.length / 2) + 1];
			oddIndexArray = new int[(origionalArray.length / 2) + 1];
		}

		int evenIndex = 0;
		int oddIndex = 0;
		for (int i = 0; i < origionalArray.length; i++) {
			if (i % 2 == 0) {
				evenIndexArray[evenIndex] = origionalArray[i];
				evenIndex++;
			} else {
				oddIndexArray[oddIndex] = origionalArray[i];
				oddIndex++;
			}
		}

		Result r = new Result();
		r.evenArray = evenIndexArray;
		r.oddArray = oddIndexArray;
		return r;
	}
}

class Result {
	int[] evenArray;
	int[] oddArray;
}