package tree.set.examples;

import java.util.Comparator;
import java.util.TreeSet;

public class HetroObjectInsideTreeSet {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new MyWaySorting());
		
		t.add(new String("abc"));
		t.add(new StringBuffer("lmn"));
		t.add(new StringBuffer("pqr"));
		
		System.out.println(t);
	}
}

class MyWaySorting implements Comparator{
	
	public int compare(Object o1, Object o2) {
		
		String s = o1.toString();
		String s1= o2.toString();
		
		return s.compareTo(s1);
	};
}
