package map.example;

import java.util.HashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, StringBuffer> map = new HashMap();
		map.put(1, new StringBuffer("Sachin"));
		map.put(2, new StringBuffer("Mahesh"));
		map.put(3, new StringBuffer("Latha"));
		map.put(4, new StringBuffer("Yamini"));
		map.put(5, new StringBuffer("Pushpa"));
		map.put(1, new StringBuffer("sai krishna"));
		map.put(2, new StringBuffer("shrinivas"));
		
		System.out.println(map);
	}
}
