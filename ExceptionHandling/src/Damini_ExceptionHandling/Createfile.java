package Damini_ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class Createfile {

	public static void main(String[] args) {
		System.out.println("....start..");
		File f=new File("");
		try {
			f.createNewFile();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		System.out.println("......end......");
	}
}
