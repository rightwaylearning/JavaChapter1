package main_array;

public class BasicOfArray {

	public static void main(String[] args) {
		
		int[] a = new int[5]; // valid index 0 to 4
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		System.out.println(a[2]);
		a[2] = 300;
		System.out.println(a[2]);
		
		
		float[] f  = new float[10]; // from 0 to 9 are valid index
		
		f[0] = 10.10F;
		f[1] = 10;
	//	f[10] = 90; runtime error that is Exception
		
		System.out.println(f[0]);
		
		
		Student[] s = new Student[5];  // valid index 0 to 4
		
		s[0] = new Student();
		    s[0].name ="damini";
		    
		s[1] = new Student();
		    s[1].name = "poonam";
		    
		s[2] =  new Student();
		    s[2].name = "Akshay";
		    
		s[3] = new Student();
		    s[3].name = "Ajay";
		
		s[4] = new Student();
		    s[4].name = "Manish";
		
		
		s[1].showMyName();
		
		s[0].showMyName();
		
		
		
		
		
		
		
		
		
	}
}
