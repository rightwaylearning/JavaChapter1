package Damini_Defaultvariables;

public class ArrayDefaultController {

	public static void main(String[] args) {
		
		ArrayDefault arr=new ArrayDefault();
		arr.a=new int[5];
		System.out.println(arr.a[0]);
		
		arr.t=new Test[5];
		System.out.println(arr.t[0]);
		
		ArrayDefault.b=new byte[5];
		System.out.println(arr.b[0]);
		
		
		
		arr.a1();
		
		
	}
}
