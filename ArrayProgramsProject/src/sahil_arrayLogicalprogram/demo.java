package sahil_arrayLogicalprogram;
public class demo {
	public static void main(String[] args) {
		int[] num = { 10, 20, 20, 1, 1, 5, 4, 6, 8, 7, 5, 4, 10 };

		int max = 0;
		for (int n : num) {
			if (n > max) {
				max = n;
               }
			  }
		System.out.println(max);

		int secondmax = 0;
		for (int n :num) {
		if (n>secondmax && n != max) {
			secondmax = n;
		}
	}
		System.out.println(secondmax);
	}	
}
