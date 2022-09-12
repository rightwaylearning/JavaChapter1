package map.examples;

import java.util.HashMap;
import java.util.HashSet;

public class MapDemo {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map = new HashMap<>();
		
		// K & V both should object 
		// key never duplicate,
		// value , any thing u can insert
		
		String d = map.put(1, "Sagar");  // null
		
		String r = map.put(2, "swapnil"); // not null
		
		String r1 = map.put(3, "mahesh"); // not null
		
		System.out.println(map.containsKey(20));
		   
		  System.out.println(map.get(3));
		
		System.out.println(map.size());  //  31
	}
}
