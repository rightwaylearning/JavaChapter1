                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            package ArrayBigNumberfindout;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int[] arr= {90,34,56,2,6,90,8,3};
		         // 2,3,6,8,34,56,90,90
		Arrays.sort(arr);
	//	System.out.println("max = "+arr[arr.length-1]);
	//	System.out.println("second max = "+arr[arr.length-2]);
//		
//		for (int i : arr) {
//			System.out.println(i);
//		}
		
		// don't use readymade functionality
		
		
		int[] num= {10,3,4,6,9,34,67,89,89,89,1,4,7};
		
		int max = num[0];
		
		for(int n:num) {
		   if(n > max) {
			   max =n;
		   }	
		}
	  // max = 89
		
		int second_max = num[0];
		for(int n : num) {
			if(n > second_max && n != max) {
				second_max = n;
			}
		}
		
		System.out.println("max = "+ max);
		System.out.println("second_max = "+ second_max);
		
		// min
        int min = num[0];
		
		for(int n:num) {
		   if(n < min) {
			   min =n;
		   }	
		}
		System.out.println("min = "+min);
		
	}
}
