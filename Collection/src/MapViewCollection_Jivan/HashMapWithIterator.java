package MapViewCollection_Jivan;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashMapWithIterator {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		
		Set<Integer> s = map.keySet();
		Collection<String> list = (List<String>)map.values();
		System.out.println(list);
		Iterator<Integer> itr = s.iterator();
		
		while(itr.hasNext()) {
			Integer key = itr.next();
		    System.out.println(key +":"+map.get(key));
		}
	}
}
