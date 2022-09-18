package Hashtabel.internal.working;

import java.util.HashMap;

public class HashingWork {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		// default capacity  // 16 , bucket size = capacity of map object
	
		map.put("zab", 10); //11
		System.out.println("zab".hashCode()%16);
		
		map.put("tat", 10);// 7
		System.out.println("tat".hashCode()%16);
		
		map.put("you", 10);//15
		System.out.println("you".hashCode()%16);
		
		map.put("i", 10);  //9
		System.out.println("i".hashCode()%16);
		
		map.put("K", 20); // 11
		System.out.println("k".hashCode()%16);
	    
		System.out.println(map);
		
	    // put
	    // 1] find out hashcode of key 
	    // 2] int h = s.hashCode();
	    // 3] find out correct bucket location using mode operator
	      //  e.g  hashcode(key) % capacity of map
	    
	    
	    System.out.println(map.get("K")); // 11
	
	}
}
