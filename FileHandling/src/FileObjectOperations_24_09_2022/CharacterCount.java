package FileObjectOperations_24_09_2022;

import java.io.File;

public class CharacterCount {

	public static void main(String[] args) throws Exception{
		
		File f = new File("abc.txt");
		
		System.out.println(f.length());
		
		f.delete();
	}
}
