package Sonali_File_Handling;

import java.io.File;

public class FileDemo {
	public static void main(String[] args)throws Exception {
		File f = new File("myfile.txt");
		if(!f.exists()) {
			f.createNewFile();
			System.out.println(f);
			System.out.println(f.getAbsolutePath());
			
		}
		
		File f1 = new File("MyDirectory");
		if(!f1.exists()) {
			f1.mkdir();
			System.out.println(f1);
			System.out.println(f1.getAbsolutePath());
		}
		
		//D:\JavaChapter1\FileHandling\WorkingDirectory
		File f2 = new File("//D:\\JavaChapter1\\FileHandling\\WorkingDirectory\\NewProject");
		f2.createNewFile();
		System.out.println(f2.getAbsolutePath());
	
	
	File f3 = new File("//D:\\JavaChapter1\\FileHandling\\WorkingDirectory","FileDemo.txt");
	f3.createNewFile();
	System.out.println(f3);
	
	
	File f4 = new File("//D:\\JavaChapter1\\FileHandling\\WorkingDirectory");
	File f5 = new File(f4,"NewFile");
	f5.createNewFile();
	System.out.println(f5);
	

}
}