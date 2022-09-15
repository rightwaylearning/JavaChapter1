package TreeSet_Damini;

import java.util.Comparator;
import java.util.TreeSet;

public class HetroInTreeset {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(mywaysorting());
		t.add(new String("abc"));
		t.add(new String("lmn"));
		t.add(new String("lkm"));
		System.out.println(t);
	}

	
}

class mywaysorting implements Comparator {
	public int compare(Object o1, Object o2) {
		String s = o1.toString();
		String s1 = o2.toString();

		return s.compareTo(s1);
	};
}
