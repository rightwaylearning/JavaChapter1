package Damini_ArrayLogicalprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BignumberFindOutUsingUtility {

	public static void main(String[] args) {
		
		int[] arr= {90,34,56,2,2,6,90,8,3};
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int a: arr)
			set.add(a);
		System.out.println(set);
		
		List<Integer> list =new ArrayList<>(set);
		
	    Collections.sort(list);
	    System.out.println("max="+list.get(list.size()-1));
	    System.out.println("max="+list.get(list.size()-2));
	

	}
}
