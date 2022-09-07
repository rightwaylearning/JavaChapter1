package damini_set6092022;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet {

	public static void main(String[] args) {
		
		Set hash=new LinkedHashSet<>();
		hash.add(20);
		hash.add(30);
		hash.add(10);
		hash.add(20);
		hash.add("Damini");
		hash.add(null);
		System.out.println(hash);
	}
}
