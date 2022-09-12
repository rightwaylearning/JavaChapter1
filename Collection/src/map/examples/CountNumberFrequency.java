package map.examples;

import java.util.HashMap;
import java.util.Map;

public class CountNumberFrequency {

	public static void main(String[] args) {
		
		int[] arr = {1,2,1,3,5,4,3,4,7,8,1};
		
		HashMap<Integer,Integer> map = new HashMap<>();
		System.out.println(map);
		
		for (int i : arr) {
			if(map.containsKey(i) == false) {
				map.put(i, 1);
			}else {
				Integer v = map.get(i);
				  v++;
				map.put(i, v);
			}
		}
		
		System.out.println(map);
	}
}
