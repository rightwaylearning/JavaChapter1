package nilam_arrayexample;

public class Array_syntax {
	
	public static void main(String[] arg) {
		
	int[] a;  // declaration 
	a= new int [4]; // memmory allocation//object creation/construction
	
	a[0]= 1;
	a[1]=2;
	a[3]=3;   ///data initialization
	
	int[] a1 = {1,2,3,4};
	System.out.println(a1.length);
	System.out.println(a1[0]);
	
	double[] a2 = {10,'A',45454545L,10.10f,}; //upcasting
	 char[] ch = {'A','B','C'};
	 
	 double[] a3 = {10,'A',45454545L,10.10f,};	 
	 
	// char[]ch = double[]a3//=====not possible upcasting witharray type 
	                            // upcasting possible for aaray size and array element
	
	
	}

}
