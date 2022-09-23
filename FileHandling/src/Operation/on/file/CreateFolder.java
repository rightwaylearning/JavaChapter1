package Operation.on.file;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) throws Exception {
		
		File f = new File("my_new_dir");
		 f.mkdir();
        File f1 = new File("abc.txt");
        f.createNewFile();
        
        System.out.println(f.isFile());  // false
        System.out.println(f.isDirectory()); // true
        System.out.println(f1.isFile()); //true
        System.out.println(f1.isDirectory()); // false
		
	}
}
