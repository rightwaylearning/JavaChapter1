package Sonali_File_Handling;


import java.io.PrintWriter;

public class SquareOfArrayElements {

	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("square.txt");
		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < arr.length; i++) {
			pw.println(arr[i] + " = " + arr[i] * arr[i]);

		}
		pw.close();
	}

}
