package Sonali_collection_All_Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomizedSoting {
	public static void main(String[] args) {
		ArrayList l = new ArrayList<>();
		l.add("A");
		l.add("S");
		l.add("P");
		l.add("O");
		// l.add(new Integer(10));
		// l.add("null");
		System.out.println("before sorting "+l);
		Collections.sort(l, new MyComparators1());
		System.out.println("After sorting "+l);
		System.out.println(Collections.binarySearch(l,"A",new MyComparators1()));
		System.out.println(Collections.binarySearch(l,"Z",new MyComparators1()));

	}

}

class MyComparators1 implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		return s1.compareTo(s2);

	}
}