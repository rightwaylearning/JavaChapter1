package Assignment_03_09_2022;

public class CopyArrayProgram {

	public static void main(String[] args) {

		int[] arr = { 100, 200, 300, 400, 500, 600, 700 };

		Result copy = copyArray(arr);

		for (int i : copy.evenArray) {  // 100,300,500,700
          System.out.print(i + " ");
		}
          System.out.println("---------------");
		for (int i : copy.oddArray) {  // 200,400,600
			System.out.print(i + " ");
		}

	}

	static Result copyArray(int[] originalArray) {

		int[][] result = new int[2][];

		int[] evenIndexArray;
		int[] oddIndexArray;

		oddIndexArray = new int[originalArray.length / 2];

		if (originalArray.length % 2 == 0) {
			evenIndexArray = new int[originalArray.length / 2];
		} else {
			evenIndexArray = new int[(originalArray.length / 2) + 1];
		}

		int evenIndex = 0;
		int oddIndex = 0;
		for (int i = 0; i < originalArray.length; i++) {
			if (i % 2 == 0) {
				evenIndexArray[evenIndex] = originalArray[i];
				evenIndex++;
			} else {
				oddIndexArray[oddIndex] = originalArray[i];
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
