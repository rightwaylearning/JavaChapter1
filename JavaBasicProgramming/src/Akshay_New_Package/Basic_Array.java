package Akshay_New_Package;

public class Basic_Array {
	
	public static void main(String[] args) {
		
//		Array of int data type
		
		int [] a = new int [5];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		System.out.println("Array of int");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("---------------------");
		
//		Array of Float Data Type
		
		float [] b = new float [2];
		
		b[0] = 10.10F;
		b[1] = 10;
		
		System.out.println("Array of float");
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println("---------------------");
		
//		Array of Reference Data type
		
		ColorsOfArray [] c = new ColorsOfArray [5];
		
		c[0] = new ColorsOfArray ();
		c[0].name = "1. Yello";
		
		c[1] = new ColorsOfArray ();
		c[1].name = "2. Blue";
		
		c[2] = new ColorsOfArray ();
		c[2].name = "3. Red";
		
		c[3] = new ColorsOfArray ();
		c[3].name = "4. Green";
		
		c[4] = new ColorsOfArray ();
		c[4].name = "5. White";
		
		System.out.println("Reference Data Type\n");
		
		for (int i=0; i<5; i++)
			c[i].showMyName();
		
//		c[0].showMyName();
//		c[1].showMyName();
//		c[2].showMyName();
//		c[3].showMyName();
//		c[4].showMyName();
		}
	}
