package Sonali_collection_All_Example;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add(null);
		hs.add(40);
		hs.add(50);
		hs.add(null);
		hs.add("sonali");
		System.out.println(hs);
		System.out.println(hs.add(10));
		System.out.println(hs.add(50));
		System.out.println(hs.add(100));
	}

}
