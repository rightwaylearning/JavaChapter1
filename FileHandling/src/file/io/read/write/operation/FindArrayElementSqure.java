package file.io.read.write.operation;

import java.io.PrintWriter;

public class FindArrayElementSqure  {

	public static void main(String[] args) throws Exception {
		
		PrintWriter pw = new PrintWriter("output.txt");
		int[] arr = {2,4,6,7,8,10};
		for (int i = 0; i < arr.length; i++) {
			 pw.println(arr[i] + "  = "+arr[i]*arr[i]);
		}
		pw.close();
	}
}
