package Damini_Array_Object;

import main_array.Student;

public class basicArray {
	
	public static void main(String[] args) {
		
		int[] a=new int[5];
		
		a[1]=10;
		a[0]=20;
		a[3]=40;
		a[2]=60;
		a[4]=30;
		
		System.out.println(a[2]);
		
		a[2]=100;
		System.out.println(a[2]);
		
		float f[]=new float[10];
		f[0] = 10.10F;
		f[1] = 10;
	//	f[10] = 90; runtime error that is Exception
		
		System.out.println(f[0]);
		
		
		Student[] s = new Student[5];  // valid index 0 to 4
		
		s[0] = new Student();
		    s[0].name ="damini";
		    
		s[1] = new Student();
		    s[1].name = "poonam";
		    
	
		
		s[0].showMyName();
		
		
		
		
		
		
	}
	

}
