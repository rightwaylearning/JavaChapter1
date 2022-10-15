package Sonali_collection_All_Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("A");
		l.add("S");
		l.add("P");
		l.add("R");
		l.add("G");
		l.add("V");
		System.out.println(l);// before sorting [A, S, P, R, G, V]
		Collections.sort(l);
		System.out.println(l);// after soting [A, G, P, R, S, V]
		System.out.println(Collections.binarySearch(l, "A"));
		System.out.println(Collections.binarySearch(l, "X"));
		

	}

}