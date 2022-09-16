package identity.hashmap.programs;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IndentityHashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		Integer i = new Integer(10);
		Integer j = new Integer(10);
		map.put(i, "first");
		map.put(j, "first");
		System.out.println(map);
		System.out.println(">>>>>>>>>>>>>>>>");
		IdentityHashMap<Integer, String> idea =new IdentityHashMap<>();
		idea.put(i, "first");
		idea.put(j, "first");
		System.out.println(idea);
		
	}
}
