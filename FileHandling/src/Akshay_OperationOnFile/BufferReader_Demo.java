package Akshay_OperationOnFile;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader_Demo {

	public static void main(String[] args) throws Exception {

		// Example 1
		BufferedReader br = new BufferedReader(new FileReader("merge.txt"));
		String Line = br.readLine();

		while (Line != null) {

			System.out.println(Line);
			Line = br.readLine();
		}
		br.close();
		System.out.println("============================================");

		// Example 2
		BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
		String line1 = br1.readLine();

		while (line1 != null) {
			System.out.println(line1);
			line1 = br1.readLine();
		}
		br1.close();
		System.out.println("============================================");

	}

}
