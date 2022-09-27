package file.io.read.write.operation_Jivan;

import java.io.PrintWriter;

public class FindArrayElementSquare {
	
	public static void main(String[] args) throws Exception {
		
		PrintWriter pw = new PrintWriter("output.txt");
		int[] arr = {2, 4, 6, 8, 10};
		for (int i = 0; i < arr.length; i++) {
			pw.println(arr[i] +" = " + arr[i]*arr[i]);
		}
		pw.close();
	}
}
