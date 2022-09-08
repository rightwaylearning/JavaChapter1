package Sonali_collection_Iterator;


public class MaxArray {
	public static void main(String[] args) {
		
		 
        int [] arr = new int [] {20,40,50,40,300,400,300,500};  
        
        int max = arr[0];  
       
        for (int i = 0; i < arr.length; i++) {  
           
           if(arr[i] > max)  
               max = arr[i];  
        }  
      //  System.out.println("Largest element present in given array: " + max); 
	
        
	
	  int Second_max = arr[0];  
      
      for (int i = 0; i < arr.length; i++) {  
         
         if(arr[i] >Second_max)  
            Second_max = arr[i];  
      }  
      System.out.println(Second_max);
     
      int third_max=arr[0];
      for(int i=0;i<arr.length;i++) {
    	  if(arr[i]>third_max)
    		  third_max=arr[i];
    	  
      }
     // System.out.println("Largest element present in given array:"+third_max);
      //System.out.println("Largest element present in given array: " + max); 
      //System.out.println("Largest element present in given array: " + Second_max);
	
      
}
}

