package file.io.read.write.operation;

import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) throws Exception {
		
		File f = new File("abc1.txt");
		
		FileWriter fw = new FileWriter(f,true);
		//                             ("only name")
		//                             (File ref) 
		//                             (File ref,boolean append)
		//                             (Strin name,boolean append)
		
		fw.write(100);
		fw.write("\n");
		
		char[] name = {'J','O','E'};
		fw.write(name);
		fw.write("\n");
		
		fw.write("good morning");
		fw.write("\n");
		fw.flush();
		fw.close();
	}
}
