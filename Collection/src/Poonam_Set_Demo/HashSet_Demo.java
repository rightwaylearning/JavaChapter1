package Poonam_Set_Demo;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Demo {
	
	public static void main(String[] args) {
		
		
		Set<Integer> s = new HashSet<>();
		
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(100);
		s.add(400);
		s.add(500);
		
		System.out.println(s.size());
		System.out.println(s);
		
		
	}

}
