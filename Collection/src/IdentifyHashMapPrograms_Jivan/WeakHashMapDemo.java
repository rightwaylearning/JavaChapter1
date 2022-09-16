package IdentifyHashMapPrograms_Jivan;

import java.util.HashMap;

public class WeakHashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		String str = new String("Jivan");
		
		map.put(str, 19);
		str = null;
		
		System.out.println(map);
	}

}

