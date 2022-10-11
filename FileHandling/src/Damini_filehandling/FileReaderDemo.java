package Damini_filehandling;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args)throws Exception{
		File f=new File("abc.txt");
		FileReader ft=new FileReader(f);
		int i=ft.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=ft.read();
		}
		ft.close();
		
		File f1=new File("abc.txt");
		FileReader ft1=new FileReader(f1);
		
		int len=(int)f.length();
		char[] ar=new char[len];
		
		ft1.read(ar);
		for(char ch:ar)
		{
			System.out.print(ch);
		}
		ft1.close();
		
	}
}
