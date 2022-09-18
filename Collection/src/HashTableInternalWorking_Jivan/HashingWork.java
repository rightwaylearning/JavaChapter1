package HashTableInternalWorking_Jivan;

import java.util.HashMap;

public class HashingWork {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		// default capacity  // 16, bucket size = capacity of map object
	//	String s = "master";
		map.put("zab",  10);
		System.out.println("zab".hashCode()%16);
		
		map.put("tat",  10);
		System.out.println("tat".hashCode()%16);
		
		map.put("you",  10);
		System.out.println("you".hashCode()%16);
		
		map.put("i",  10);
		System.out.println("i".hashCode()%16);
		
		map.put("k",  20);
		System.out.println("k".hashCode()%16);
		
		System.out.println(map);
		System.out.println(map.get("k"));
	}

}
