package Nilam_map_Example;

import java.util.HashMap;

public class WordCount {
	public static void main(String[] args) {
		String str = " hi hello how are you i am very good ";
		String[] arr = str.split(" ");

		HashMap<String, Integer> hmap = new HashMap<>();

		for (String s : arr) {

			if (hmap.containsKey(s) == false) {
				hmap.put(s, 1);
			} else {
				Integer v = hmap.get(s);
				v++;
				hmap.put(s, v);
			}

		}
		System.out.println(hmap);
	}

}
