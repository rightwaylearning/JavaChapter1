package MapExamples_Jivan;

import java.util.HashMap;

public class CountCharacter {
	
	public static void main(String[] args) {
		
		String str = "Hi Hello How Are You, Hi I am Jivan and I am fine";
		String arr[]=str.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		
		for (String c : arr) {
		
			if(map.containsKey(c) == false) {
				map.put(c, 1);
			}else {
				Integer v = map.get(c);
				v++;
				map.put(c,  v);
			}
		}
		
		System.out.println(map);
	}

}

