package Damini_setPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet_Demo {

	public static void main(String[] args) {
		HashSet<String> h= new HashSet<>();
		
		h.add("Damini");
		h.add("Durva");
		h.add("Amar");
		h.add("Dolly");
		h.add(null);
		h.add("Damini");
		
		System.out.println(h);
		
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("Damini");
		lhs.add("Damini");
		lhs.add("Durva");
		lhs.add("Amar");
		lhs.add("Dolly");
		lhs.add(null);
	
		System.out.println(lhs);
	}
}
