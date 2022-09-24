package FileObjectOperations_24_09_2022;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) throws Exception {
		
		File f = new File("abc.java");
		
		if(!f.exists()) {
			f.createNewFile();
		}
		System.out.println(f.getAbsolutePath());
       // H:\JavaChapter1JulyBatch\JavaChapter1\java_Lang_project\abc.java
		
		File f1 = new File("NewProject");
		if(!f1.exists()) {
			f1.mkdir();
		}
		System.out.println(f1.getAbsolutePath());
		
       //H:\JavaChapter1JulyBatch\JavaChapter1\java_Lang_project\NewProject

		 File f2 = new File("D:\\newtest\\test123.txt");
		 f2.createNewFile();
		 
		 //========================================
		 
		 File f3 = new File("D:\\newtest","first.txt");
		 f3.createNewFile();
		 
		 //========================================
		 
		 File f4 = new File("D:\\newtest");
		 File f5 = new File(f4,"nefiletest1233.txt");
		 f5.createNewFile();
	}
}
