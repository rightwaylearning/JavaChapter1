package Sonali_collection_All_Example;

import java.util.HashMap;

public class CountNumberFrequencyMap {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 2, 3, 4, 5, 6, 5, 4, 5, 4, 5, 6, 0 };
		HashMap<Integer, Integer> map = new HashMap<>();
		System.out.println(map);
		for (int i : arr) {
			if (map.containsKey(i) == false) {
				map.put(i, 1);
			} else {
				Integer v = map.get(i);
				v++;
				map.put(i, v);

			}

		}
		System.out.println(map);
	}

}