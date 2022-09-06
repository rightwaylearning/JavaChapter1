package SetPrograms_06_09_2022;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		
		// 1]  key -value store  >>> Map
		// 2] duplicate key not allow
		// 3] duplicate value is allow 
		
		
		
		HashMap<Integer, String> map = new HashMap<>();
		
		String returnValue = map.put(1, "Nirmal");
		                                     System.out.println(returnValue);
		returnValue = map.put(1, "Sachin");
	    
		System.out.println(returnValue);
		
		
		
		
		
		
	}
}
