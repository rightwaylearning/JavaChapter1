package basic.info;

import java.io.File;
import java.io.IOException;

public class Test {
 
	void m3() throws Exception {
		System.out.println("i am m3 method start");
		m2();
		System.out.println("i am m3 method end");
	}
	void m2() throws Exception{
		System.out.println("i am m2 method start");
		m1();
		System.out.println("i am m2 method end");
	}
	
	void m1() throws IOException{

		System.out.println("line 1");
		System.out.println("line 2");
		System.out.println("line 3");
		File f = new File("");
		f.createNewFile();
		System.out.println("line 4");
		System.out.println("line 5");
		System.out.println("line 6");
		System.out.println("line 7");

	}
	public static void main(String[] args) throws Exception {
       
		System.out.println("i am main method start");
		Test t= new Test();
		t.m3();
		System.out.println("i am main method end");
	}
}
