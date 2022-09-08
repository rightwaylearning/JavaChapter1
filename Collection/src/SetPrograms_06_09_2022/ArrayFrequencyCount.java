package SetPrograms_06_09_2022;

import java.util.HashMap;
import java.util.Map;

public class ArrayFrequencyCount {

	public static void main(String[] args) {

		Integer[] arr = { 10, 20, 30, 10, 20, 30, 20, 45, 67 };

		Map<Integer, Integer> map = new HashMap<>();
		
		
		for (Integer num : arr) {

			if (map.containsKey(num)) {

				Integer v = map.get(num);
				v = v + 1;
				map.put(num, v);

			} else {
				map.put(num, 1);
			}

		}
		System.out.println(map);
	}
}
