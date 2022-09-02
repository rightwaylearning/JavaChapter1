package set_collection_programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromAL {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);list.add(20);list.add(10)
		;list.add(10);list.add(30);
		list.add(20);list.add(40);list.add(10);
		
		System.out.println(list);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>(list);
		System.out.println(lhs);
	}
}
