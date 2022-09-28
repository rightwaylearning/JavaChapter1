package Sonali_File_Handling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferdWriterDemo {

	public static void main(String[] args) throws Exception {

		BufferedWriter bw = new BufferedWriter(new FileWriter("Data.txt"));

		bw.write("ABC");
		bw.newLine();
		bw.write('A');
		bw.newLine();
		bw.write(100);
		bw.flush();
		bw.close();

	}

}
