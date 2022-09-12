package Assignment_03_09_2022;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateNumbers {

	public static void main(String[] args) {

		Integer[] arr = { 10, 20,20, 30, 50, 20, 50, 1, 2 };

		List<Integer> list = new ArrayList<>();
	  
		for(int item:arr) {
			if(!list.contains(item)) {
				list.add(item);
			}
		}
		System.out.println(list);
//       
//	Object[] arr1 = list.toArray();
//		
//		for(Object a :arr1) {
//			System.out.println(a);
//		}
	}
}
