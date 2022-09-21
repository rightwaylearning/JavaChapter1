package Sonali_collection_All_Example;

import java.util.HashMap;
import java.util.Map;

public class HashMapWithHashingTech {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "aa");
		System.out.println("10".hashCode() % 16);
		map.put(1, "bb");
		System.out.println("1".hashCode() % 16);
		map.put(3, "bb");
		System.out.println("3".hashCode() % 16);
		map.put(5, "bb");
		System.out.println("5".hashCode() % 16);

		map.put(6, "AA");
		System.out.println(new Integer(6).hashCode() % 16);
		// System.out.println(map);
	}

}
