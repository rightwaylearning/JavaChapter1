package Sonali_collection_All_Example;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<String, Integer> t = new TreeMap<>(new MyCompartor());
		t.put("XXX", 10);
		t.put("AAA", 20);
		t.put("ZZZ", 30);
		t.put("LLL", 40);

		System.out.println(t);

	}

}

class MyCompartor implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		return -s1.compareTo(s2);
	}

}