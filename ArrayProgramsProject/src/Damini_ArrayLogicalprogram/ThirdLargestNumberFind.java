package Damini_ArrayLogicalprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThirdLargestNumberFind {
	public static void main(String[] args) {
		int arr[]= {10,34,67,90,78,90,89};
		
		Set<Integer> set =new HashSet<>();
		
		for (int a : arr) {
			set.add(a);
		}
		System.out.println(set);
		
		List<Integer> list = new ArrayList<>(set);
		
		Collections.sort(list);
		
		System.out.println(list);
		System.out.println("max = "+list.get(list.size() -1));
		System.out.println("max = "+list.get(list.size() -2));
		System.out.println("max= "+list.get(list.size()-3));
	}

}
