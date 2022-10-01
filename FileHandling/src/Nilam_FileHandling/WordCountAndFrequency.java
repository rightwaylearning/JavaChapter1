package Nilam_FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class WordCountAndFrequency {
	public static void main(String[] args) throws Exception {
		Map<String, Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new FileReader("nilam1.txt"));
		int wordCount = 0;
		String line = br.readLine();

		while (line != null) {

			String[] arr = line.split(" ");
			wordCount = wordCount + arr.length;
			for (String word : arr) {

				if (map.get(word) == null) {

					map.put(word, 1);

				} else {
					Integer i = map.get(word);
					i++;
					map.put(word, i);
				}
			}
			line = br.readLine();
		}

		System.out.println(wordCount);
		System.out.println(map);
		br.close();

	}

}
