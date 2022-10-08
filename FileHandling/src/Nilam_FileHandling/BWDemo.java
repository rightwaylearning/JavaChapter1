package Nilam_FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BWDemo {
	public static void main(String[] args) throws Exception {

		BufferedWriter bw = new BufferedWriter(new FileWriter("nilam1.txt", true));

		bw.write(100);
		bw.newLine();
		bw.write("hello how are you ");
		bw.newLine();
		bw.write('D');
		bw.newLine();
		bw.flush();
		bw.close();

	}

}
