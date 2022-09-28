package Sonali_HandleException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

public class FileDemo {
	public static void main(String[] args) throws Exception {

		File f = new File("ABC.txt");
		f.createNewFile();
		System.out.println(f);
		HashMap<String, Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new FileReader(f));
		int wordCount = 0;
		String str = br.readLine();
		System.out.println(str);

		while (str != null) {
			String[] arr = str.split(" ");
			wordCount = wordCount + arr.length;

			for (String s : arr) {
				if (map.get(s) == null) {
					map.put(s, 1);
				} else {
					Integer f1 = map.get(s);

					f1++;
					map.put(s, f1);
				}
			}

			str = br.readLine();
		}
		System.out.println("wordCount  " + wordCount);
		System.out.println(map);
		br.close();

	}

}
