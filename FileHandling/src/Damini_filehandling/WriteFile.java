package Damini_filehandling;

import java.io.File;
import java.io.FileWriter;

public class WriteFile {

	public static void main(String[] args)throws Exception {
		File f=new File("abc.txt");
		FileWriter fr=new FileWriter(f,true);
		fr.write(19);
		fr.write("\n");
		
		char[] name= {'D','A','M','I'};
		fr.write(name);
		fr.write("\n");
		fr.write("good night");
		fr.write("\n");
		fr.flush();
		fr.close();
	}
}
