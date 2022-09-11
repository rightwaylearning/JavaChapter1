package Sonali_collection_All_Example;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MaxNumber {
	
	public static void main(String[] args) {
		int max;
		Set<Integer> s = new HashSet<>();
		s.add(100);
		s.add(80);
		s.add(20);
		s.add(80);
		s.add(100);
		s.add(90);
		System.out.println("present Emenent:" +s);
		 Object obj = Collections.max(s);
		 System.out.println(obj);
		
	}

}
