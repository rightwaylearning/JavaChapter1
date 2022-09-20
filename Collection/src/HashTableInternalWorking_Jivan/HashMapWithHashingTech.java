package HashTableInternalWorking_Jivan;

import java.util.HashMap;

public class HashMapWithHashingTech {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "A");
		System.out.println(new Integer(1).hashCode() % 16);
		
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		map.put(17,"H");
		map.put(20, "HH");
		map.put(4, "XYZ");
		System.out.println(map);
	}
}
