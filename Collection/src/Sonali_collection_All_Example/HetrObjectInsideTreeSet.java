package Sonali_collection_All_Example;

import java.util.Comparator;
import java.util.TreeSet;

public class HetrObjectInsideTreeSet {
	public static void main(String[] args) {
		TreeSet t = new TreeSet( new MyOwnSorting());
		t.add(new String("abc"));
		t.add(new StringBuilder("lmn"));
		t.add(new StringBuffer("pqr"));
		System.out.println(t);
		
	}

}
class MyOwnSorting implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String s =o1.toString();
		String s1 = o1.toString();
		return s.compareTo(s1);
	}
}