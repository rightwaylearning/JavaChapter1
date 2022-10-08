package file.io.read.write.operation_Jivan;

import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) throws Exception {
		
		File f = new File("abc.txt");
		
		FileWriter fw = new FileWriter(f, true);
		//										("only name")
		//										(file ref)
		//										(file ref, boolean append)
		//										(String name, boolean append)
		
		fw.write(100);
		fw.write("\n");
				
		char[] name = {'J', 'O', 'E'};
		fw.write(name);
		fw.write("\n");
		
		fw.write("good morning");
		
		fw.flush();
		fw.close();
			
	}
}
