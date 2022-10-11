package Basic_Info;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) {
		
		System.out.println(">>>>> Start <<<<<");
		
		File f = new File("abc.txt");
//		File f = new File(" ");
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println(">>>>>  End  <<<<<");
		
	}

}
