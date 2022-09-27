package Sonali_File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class WordCountFrequency {
	public static void main(String[] args) throws Exception {
		HashMap<String, Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new FileReader("Data.txt"));
		int wordCount = 0;
		String line = br.readLine();
		while(line != null) {
			String[] arr =  line.split(" ");
			wordCount  = wordCount + arr.length;
			
			 for(String s :arr) {
				 if(map.get(s) == null) {
					 map.put(s, 1);
				 }else {
					 Integer f = map.get(
							 s);
					 f++;
					 map.put(s, f);
				 }
			 }
			
			
			line = br.readLine();
		}
		System.out.println("wordCount  "+ wordCount);
		System.out.println(map);
		br.close();
		
	}
}
