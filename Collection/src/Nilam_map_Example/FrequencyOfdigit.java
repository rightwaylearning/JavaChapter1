package Nilam_map_Example;

import java.util.HashMap;

public class FrequencyOfdigit {

	public static void main(String[] args) {

		int num = 1122233442;
		HashMap<Integer, Integer> map = new HashMap<>();

		while (num > 0) {
			int digit = num % 10;
			if (map.containsKey(digit) == false) {
				map.put(digit, 1);

			} else {
				Integer i = map.get(digit);
				i++;
				map.put(digit, i);

			}
			num = num / 10;
		}

		System.out.println(map);
	}
}
