package defaultvariablesvalue;

import java.io.PrintStream;

public class ArrayElementDefaultController {

	public static void main(String[] args) {
		
		ArrayElementDefault a = new ArrayElementDefault();
		
		a.arr = new int[5];
		System.out.println(a.arr[0]); // 0
		
		a.s = new Student[5];
		System.out.println(a.s[0]); // null
		
		ArrayElementDefault.b = new byte[5];
		
		System.out.println(ArrayElementDefault.b[0]); // 0
		
		System.out.println("Hello");

		a.m1();
				
	}
}
