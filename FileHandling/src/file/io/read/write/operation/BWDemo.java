package file.io.read.write.operation;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BWDemo {

	public static void main(String[] args) throws Exception {
		
		BufferedWriter br = new BufferedWriter(new FileWriter("test.txt",true));
		br.write('A');
		br.newLine();
		br.write("hello Good morning");
		br.newLine();
		br.write('B');
		br.flush();
		br.close();
	}
}
