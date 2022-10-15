package Damini_ExceptionHandling;

import java.io.File;

public class fileDemo {

	public static void main(String[] args)throws Exception {
		System.out.println(">>>>start>......");
		File f=new File("sdf.txt");
		f.createNewFile();
		System.out.println(">>>>>>>end>>>>");
	}
}
