package Basic_Info_Jivan;

import java.io.File;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		System.out.println("<<<<<<<<< Start >>>>>>>>>");
		File f = new File("lmn.txt");
		f.createNewFile();
		System.out.println("<<<<<<<<<  End  >>>>>>>>>");
		}
}
