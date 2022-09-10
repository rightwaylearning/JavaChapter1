package Sonali_collection_Iterator;

import java.util.HashMap;
import java.util.Map;

public class Map_Fre {
	
	public static void main(String[] args) {
		 Integer [] arr = {4,3,2,4,3,2,4,6,8,7,9};
		 
		 Map<Integer, Integer> map = new HashMap<>();
		 
		for (Integer num : arr) {
			
			if(map.containsKey(num)) {
				Integer v=map.get(num);
				v=v+1;
				map.put(num, v);
				
			}else {
				map.put(num, 1);
			}
		}
		System.out.println(map);
	}

}
