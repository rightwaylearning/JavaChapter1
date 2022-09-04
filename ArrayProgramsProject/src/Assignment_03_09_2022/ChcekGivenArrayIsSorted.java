package Assignment_03_09_2022;

public class ChcekGivenArrayIsSorted {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 5, 5, 5, 6, 100 }; // 10 >> 0-9

		boolean f = true;
		boolean asc = false;
		boolean desc = false;

		for (int i = 0; i < arr.length - 1; i++) {

			if (!desc) {
				
				if ((arr[i] < arr[i + 1])) {
					asc = true;
					f= true;
				} else {
					f = false;
				}
			}

			if (!asc) {
				
				if (arr[i] > arr[i + 1]) {
					desc = true;
					f= true;
				} else {
					f = false;
				}
			}

		}
		
		// sorting

		if (f) {
			System.out.println("Sorted array in asc oredr " + asc);
			System.out.println("Sorted array in desc oredr " + desc);
		} else {
			System.out.println("Sorry");
		}
	}
}
