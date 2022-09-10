package SetPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<>();
		
		h.add("Animesh");
		h.add("nikhil");
		h.add("Animesh");
		h.add(null);
		h.add(null);
		h.add("Nikesh");
		
		System.out.println(h);
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Animesh");
		lhs.add("nikhil");
		lhs.add("Animesh");
		lhs.add(null);
		lhs.add(null);
		lhs.add("Nikesh");
		
		System.out.println(lhs);
		
//		Iterator<String> itr = h.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
	}
}
