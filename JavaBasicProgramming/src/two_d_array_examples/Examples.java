package two_d_array_examples;

public class Examples {

	public static void main(String[] args) {

		int[][] arr = new int[3][2]; 
		
		
		    int[] a = new int[2];
		         a[0] = 10;
		         a[1] = 20;
		         
	    arr[0] = a;
		 
	// ----------------------------------------------	 

		 arr[1][0] = 30;
		 arr[1][1] = 100;

		 arr[2][0] = 200;
		 arr[2][1] = 300;
		 
		 System.out.println(arr[1][1]);
		
		  
	}

}
