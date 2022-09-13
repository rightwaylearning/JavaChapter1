package Nilam_map_Example;

import java.util.HashMap;

public class CountNumberFrequency {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,1,2,7,5};
		
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i : arr) {
			if(map.containsKey(i) == false ) {
				map.put(i, 1);
			}else {Integer v = map.get(i);
			v++;
			map.put(i, v);
			}
		}
		System.out.println(map);
		
	}

}

//class FrequencyOfdigit {
//	
//	public static void main(String[] args) {
//		
//		int num = 1122233442;
//		HashMap<Integer, Integer> map = new HashMap<>();
//		
//		while (num >0) {
//			int digit = num % 10;
//			if (map.containsKey(digit)==false) {
//				map.put(digit,1);
//				
//			}else {Integer i = map.get(digit);
//				i++;
//				map.put(digit,i);
//				
//			}
//			num = num/10;
//		}
//	
//		System.out.println(map);
//	}
//}