package Nilam_FileHandling;

import java.io.File;

public class CountFolderAndFiles {
	public static void main(String[] args) {
		
		File f = new File("E:\\");
		int foldercnt =0;
		int filecnt =0;
		String[] names = f.list();
		
		for (String name : names) {
			File f1 = new File(f, name);
			if (f1.isDirectory()){
				foldercnt++;
				System.out.println(name+">>> directory");
				
			}else if(f1.isFile()) {
				filecnt++;
			System.out.println(name+">>> file" );
			
			}
			
		}
		System.out.println(foldercnt);
		System.out.println(filecnt);
	}

}
