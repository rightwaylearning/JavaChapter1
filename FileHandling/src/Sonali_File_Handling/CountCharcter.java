package Sonali_File_Handling;

import java.io.File;

public class CountCharcter {
	public static void main(String[] args)throws Exception {
		File f = new File("hello Good Morning.txt");
		f.createNewFile();
		System.out.println(f);
		System.out.println(f.length());
}
}