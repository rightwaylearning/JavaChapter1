package Sonali_collection_Iterator;

public class ArrayReverse {
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		// System.out.println();  
	        System.out.println("Array in reverse order: ");  
	        //Loop through the array in reverse order  
	        for (int i = arr.length-1; i >= 0; i--) {  
	            System.out.print(arr[i] + " ");  
	        }  
	    }  
	}  
