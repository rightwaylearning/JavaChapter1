package Sonali_collection_All_Example;

import java.util.HashMap;

public class HashTable {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("AA", 1);
		System.out.println("AA".hashCode() % 16);
		map.put("pp", 2);
		System.out.println("MA".hashCode() % 16);
		map.put("CC", 3);
		System.out.println("bat".hashCode() % 16);
		map.put("tat", 4);
		System.out.println("tat".hashCode() % 16);
		map.put("EE", 5);
		System.out.println("cat".hashCode() % 16);
		
		System.out.println(map.get("CC"));
	}
}