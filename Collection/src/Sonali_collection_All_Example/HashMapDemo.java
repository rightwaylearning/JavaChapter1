package Sonali_collection_All_Example;

import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "AA");
		map.put(1, "BB");
		map.put(2, "CC");
		map.put(3, "DD");
		map.put(4, "EE");
		map.put(5, "FF");
		map.put(2, "GG");
		map.put(6, "HH");
		System.out.println(map);
	}

}
