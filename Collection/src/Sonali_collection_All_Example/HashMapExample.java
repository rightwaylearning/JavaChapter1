package Sonali_collection_All_Example;

import java.util.HashMap;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "sonal");
		map.put(1, "priya");
		map.put(2, "sonal");
		map.put(3, "sonal");
		map.put(4, "pinkii");
		map.put(5, "pooja");
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get(3));
	}

}
