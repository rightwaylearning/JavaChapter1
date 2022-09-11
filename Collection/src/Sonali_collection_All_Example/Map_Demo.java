package Sonali_collection_All_Example;

import java.util.HashMap;
import java.util.Map;

public class Map_Demo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "sonali");
		map.put(2, "priyanka");
		map.put(3, "sonali");
		map.put(4, "priyanka");
		map.put(5, "sonali");
		map.put(6, "priyanka");
		map.put(7, "sonali");
		map.put(8, "priyanka");

		System.out.println(map);

		String returnvalue = map.put(10, "sona");
		System.out.println(returnvalue);
		returnvalue = map.put(10, "rupa");
		System.out.println(returnvalue);

	}

}
