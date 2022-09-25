package Sonali_File_Handling;

import java.io.File;

public class CountFolderAndFiles {
	public static void main(String[] args) {
		File f = new File("D:\\");
		int folderCnt =0;
		 int fileCnt = 0;
		 String[] names = f.list();
		
		 for (String name : names) {
			 
			 File f1 = new File(f, name);
            if(f1.isDirectory()) {
           	 folderCnt++;
           	 System.out.println(name +" >>     Directory"  );
            }else if(f1.isFile()) {
           	 fileCnt++;
           	 System.out.println(name +" >>     file"  );
            }
		 }
		 System.out.println(folderCnt);
		 System.out.println(fileCnt);
		 
	}
}
