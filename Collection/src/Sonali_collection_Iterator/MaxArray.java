package Sonali_collection_Iterator;


public class MaxArray {
	public static void main(String[] args) {
		
		 
        int [] arr = new int [] {20,40,50,40,300,500,400,300,500};  
        
        int max = arr[0];  
       
        for (int i = 0; i < arr.length; i++) {  
           
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max); 
	
        
	}
}

