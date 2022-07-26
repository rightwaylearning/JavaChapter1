package Sahil_main;

import main_array.Student;

public class array {
     public static void main(String[] args) {
		int  [] a= new int [5];
		    
		a [0] = 100;
		a [1] = 200;
		a [2] = 300;
		a [3] = 400;
		a [4] = 500;
		System.out.println(a [4]);
		System.out.println(a[3]);
		System.out.println(a[2]);
		System.out.println(a [1]);
		System.out.println(a [0]);
		
		Student[] s = new Student[5]; 
		s [0]= new Student();
		s[0].name= "sahil";
		
		s [1]= new Student();
		s [1].name="akshay";
		
		s[2] = new Student();
	    s[2].name= "sachin";
	    
	    s[3] = new Student();
	    s [3].name= "kalpesh";
         
	    s[4] = new Student();
	    s[4].name = "vishal";
	    
	    s[0].showMyName();
	    s[1].showMyName();
	    s[2].showMyName();
	    s[3].showMyName();
	    s[4].showMyName();

		
	}
}
