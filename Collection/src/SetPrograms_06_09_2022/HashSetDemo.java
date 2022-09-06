package SetPrograms_06_09_2022;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		Set hashSet = new LinkedHashSet();
		hashSet.add(45);
        hashSet.add(20);
		hashSet.add(10);
		hashSet.add(1);
		hashSet.add("abc");
		hashSet.add(null);
		System.out.println(hashSet);
		
		
		
	}
}
