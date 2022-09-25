package Nilam_map_Example;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IndentityHashMapDemo {
	public static void main(String[] args) {
		// IdentityHashMap use double equal operator insted of equals method 
		HashMap<Integer, String> hmap= new HashMap<>();
		hmap.put(10, "first");
		hmap.put(10, "second");
		System.out.println(hmap);
		
		System.out.println("......>>>>>>>>>>>>>>>>>>>>>>>>>");
		IdentityHashMap<Integer, String> Imap = new IdentityHashMap<>();
		Integer i = new Integer(10);
		Integer j = new Integer(10);
		Imap.put(i, "first");
		Imap.put(j, "second");
		System.out.println(Imap);
		
		
	} 

}
