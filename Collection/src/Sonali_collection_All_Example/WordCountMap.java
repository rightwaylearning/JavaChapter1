package Sonali_collection_All_Example;

import java.util.HashMap;

public class WordCountMap {
	public static void main(String[] args) {
		String s = "hiii how are you i am fine dont warry";
		String[] str = s.split(" ");

		HashMap<String, Integer> map = new HashMap<>();
		System.out.println(map);

		for (String word : str) {
			if (map.containsKey(word) == false) {
				map.put(word, 1);

			} else {
				Integer v = map.get(word);
				v++;
				map.put(word, v);

			}
		}
		System.out.println(map);
	}

}
