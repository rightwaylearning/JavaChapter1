package MapExamples_Jivan;

import java.util.HashMap;

public class CountCharacter {
	
	public static void main(String[] args) {
		
		String str = "Hi Hello How Are You";
		char[] arr = str.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char c : arr) {
		
			if(map.CotainsKey(c) == false) {
				map.put(c, v)
			}else {
				Integer v = map.get(c);
				v++;
				map.put(c,  v);
			}
		}
	}

}
