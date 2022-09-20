package Sonali_collection_All_Example;

import java.util.Hashtable;

public class HashTableDemo {
	
	public static void main(String[] args) {
		
		Hashtable<String, Integer> hs = new Hashtable<>();
		hs.put("A", 1);
		System.out.println("A".hashCode()%11);
		hs.put("B", 2);
		System.out.println("B".hashCode()%11);
		hs.put("C", 3);
		System.out.println("C".hashCode()%11);
		hs.put("D", 4);
		System.out.println("D".hashCode()%11);
		hs.put("E", 5);
		System.out.println("E".hashCode()%11);
		hs.put("F", 6);
		System.out.println("F".hashCode()%11);
		System.out.println(hs);
	}
}
