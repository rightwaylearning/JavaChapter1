package Akshay_Assignments;

import java.io.File;

public class Assignment_26092022 {
	public static void main(String[] args) throws Exception {
		
		File f = new File ("D:\\FilehandlingAssignment\\file_1.text");
		if(!f.exists()) {
			f.createNewFile();
		}
		
		File f1 = new File ("D:\\FilehandlingAssignment\\file_2.text");
		if(!f1.exists()) {
			f1.createNewFile();
		}
	
		
	}

}
