package Hashtabel.internal.working;

import java.util.HashMap;

public class hashMapwithhashingTech {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map= new HashMap<>();
		
		map.put(1,"A");  // 1
		System.out.println(new Integer(1).hashCode() % 16);
		map.put(2,"B");  // 2
		map.put(3,"C");  // 3
		map.put(4,"D");  // 4
		map.put(5,"E");  // 5
		map.put(17, "H"); // 17%16 >> 1
		map.put(20, "HH"); // 4
		map.put(4, "xyz"); // 4%16 >>> 4
		
		System.out.println(map);
		
	}
}
