package map.examples;

import java.util.HashMap;

public class WordCount {

	public static void main(String[] args) {
		String str = "hi hello hi how are you are you fine";

		String[] arr = str.split(" ");
	
		HashMap<String, Integer> map = new HashMap<>();
		
		for (String word : arr) {
			
			if(map.containsKey(word) == false) {
				map.put(word, 1);
			}else {
				Integer count = map.get(word);
				count++;
				map.put(word, count);
			}
		}
		System.out.println(map);
	}
}
