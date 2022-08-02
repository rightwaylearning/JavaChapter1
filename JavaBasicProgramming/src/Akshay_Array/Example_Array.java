package Akshay_Array;

public class Example_Array {
	
	public void test () {}

	public static void main(String[] args) {
		
		int [][] arr = new int [3][4];
		
		int[] a = new int [3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		arr[0] = a;
		
		//------------------------------------
		
		arr[0][0] = 500;
		arr[0][1] = 600;
		arr[0][2] = 950;
		arr[0][3] = 980;
		
//		arr[1][0] = 700;
//		arr[1][1] = 800;
//		
//		arr[2][0] = 900;
//		arr[2][1] = 1000;
//		
//		arr[3][0] = 1100;
//		arr[3][1] = 1200;
		
		System.out.println(arr[0][1]);
	}
}
