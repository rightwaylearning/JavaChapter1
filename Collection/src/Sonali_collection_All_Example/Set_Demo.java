package Sonali_collection_All_Example;

import java.util.HashSet;
import java.util.Set;

public class Set_Demo {
	// insertion order not allow
	// duplicate not allow
	// null allow but 1 time
	// hetro allow
	public static void main(String[] args) {
		Set s = new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(20);
		s.add(10);
		s.add(30);
		s.add("sonali");
		s.add(null);
		s.add(null);

		System.out.println(s);
	}

}
