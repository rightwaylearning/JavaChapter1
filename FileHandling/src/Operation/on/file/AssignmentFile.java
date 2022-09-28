package Operation.on.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class AssignmentFile {

	public static void main(String[] args) throws Exception {

		File pw = new File("FirstFile.txt");

		FileReader fr = new FileReader("FirstFile.txt");

		fr.read();
		int i = fr.read();

		while (i != -1) {
			System.out.print((char) i);
			i = fr.read();
		}
		fr.close();
		
		File f = new File("SecondFile.txt");
		FileReader fr1 = new FileReader("SecondFile.txt");
		fr.read();
		int i1 = fr1.read();

		while (i1 != -1) {
			System.out.print((char) i);
			i = fr1.read();
		}
		
		fr1.close();

		

		
	}
}