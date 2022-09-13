package Akshay_MapExamples;

import java.util.HashMap;

public class Count_Character {
	
	public static void main(String[] args) {
		
		String str = "Hello friends I am Akshay Tejale";
		
		char[] arr = str.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap <>();
		
		for (char c : arr) {
			
			if ( map.containsKey(c) == false) {
				
				map.put(c, 1);
			}
			else {
				Integer A = map.get(c);
				A++;
				map.put(c, A);
			}
		}
		
		System.out.println(map);
	}

}
