package Nilam_map_Example;

import java.util.HashMap;

public class CountCharacter {
	public static void main(String[] args) {

		String str = "hi hello hello i am nilam ";
		char[] arr = str.toCharArray();

		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : arr) {

			if (map.containsKey(c) == false) {
				map.put(c, 1);
			} else {
				Integer v = map.get(c);
				v++;
				map.put(c, v);
			}
		}
		System.out.println(map);
	}

}
