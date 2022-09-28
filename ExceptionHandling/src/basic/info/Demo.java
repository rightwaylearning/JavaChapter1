package basic.info;

import java.io.File;

public class Demo {

	public static void main(String[] args) throws Exception {
		System.out.println(">>>> start >>>>>>");
		File f= new File("lmn.txt");
		f.createNewFile();
		System.out.println(">>>>>>>>.. end  >>>>>>>>");
	}
	
	
}
