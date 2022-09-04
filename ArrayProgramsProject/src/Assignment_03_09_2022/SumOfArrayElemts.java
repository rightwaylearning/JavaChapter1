package Assignment_03_09_2022;

public class SumOfArrayElemts {

	public static void main(String[] args) {
		
		int[] arr = {10,20,3,5,78,90,34};
		 int sum = 0;
		 
		 for (int i : arr) {
		   sum = sum + i;
		 }
		System.out.println(sum);
	}
}
