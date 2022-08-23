package nikhil_introductionofcolectionexample;

import java.util.ArrayList;

public class array_vs_collection {
	
	public static void main(String[] args) {
		
		student[]arr = new student[10];
		
		int[]arr1 = new int[5];
		
		arr[0]= new student();
		arr[1]= new student();
	 // arr[2]= new employee();
 	//	arr[3]= new city ();   in array data type should be same
		
		
		
		
		ArrayList arr2 = new ArrayList();
		
		arr2.add(new student());
		arr2.add(new student());
		arr2.add(new employee());
		arr2.add(new student ());
		arr2.add(new city());
		
		// in array list different data type is recommended
		
		
		
		
		


		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
