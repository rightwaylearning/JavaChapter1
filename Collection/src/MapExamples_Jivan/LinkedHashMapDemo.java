package MapExamples_Jivan;

import java.util.HashMap;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer, StringBuffer> map = new HashMap();
		map.put(1,  new StringBuffer("Sachin"));
		map.put(2,  new StringBuffer("Jivan"));
		map.put(3,  new StringBuffer("Sahil"));
		map.put(4,  new StringBuffer("Yamini"));
		map.put(5,  new StringBuffer("Gautami"));
		map.put(1,  new StringBuffer("Damini"));
		map.put(2,  new StringBuffer("Tanvi"));
		
		System.out.println(map);
		
	}

}
