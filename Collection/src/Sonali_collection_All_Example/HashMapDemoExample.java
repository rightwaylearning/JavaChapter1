package Sonali_collection_All_Example;

import java.util.HashMap;

public class HashMapDemoExample {
	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<>();
		h.put("A", 1);
		System.out.println("A".hashCode()%16);
		h.put("B", 2);
		System.out.println("B".hashCode()%16);
		h.put("C", 3);
		System.out.println("C".hashCode()%16);
		h.put("D", 4);
		System.out.println("D".hashCode()%16);
		h.put("E", 5);
		System.out.println("E".hashCode()%16);
		h.put("F", 6);
		System.out.println("F".hashCode()%16);
		System.out.println(h);
		
	}

}
