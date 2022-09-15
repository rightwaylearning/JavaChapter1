package Sonali_collection_All_Example;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap t = new TreeMap(new MyComparator());
		t.put(1, "AB");
		t.put(2, "cd");
		t.put(3, "A");
		t.put(4, "B");
		t.put(5, "C");
		t.put(6, "D");
		t.put(100, "ZZZ");
		t.put(103, "YYY");
		t.put(101, "XXX");
		t.put(104, 106);
		t.put(107, null);

		System.out.println(t);
	}

}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}

}