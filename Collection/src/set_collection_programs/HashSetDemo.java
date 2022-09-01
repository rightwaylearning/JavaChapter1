package set_collection_programs;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<>();  // 16
	
		// duplicate not allow
		// what happen if we insert duplicate object inside set
		// insertion order not following
		
		s.add(10);
	    s.add(20);
	    s.add(30);s.add(10);s.add(20);
	    
	    System.out.println(s.size());
	    System.out.println(s);
	    
	    
	    
	}
	
}
