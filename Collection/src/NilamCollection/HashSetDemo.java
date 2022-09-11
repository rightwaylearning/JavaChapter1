package NilamCollection;

import java.util.HashSet;

public class HashSetDemo {
	
	// insertion order not preserve
	//duplicate not allow 
	// null insertion allow but only one time.
	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<>();
		h.add(10);
		h.add(20);
		h.add(10);
		h.add(30);
		h.add(40);
		h.add(50);
		System.out.println(h);
		System.out.println(h.size());
		
		
	}

}
