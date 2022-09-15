package nilam_SetProgram;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSEtDemoWithComparator {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>(new MyOwnSorting());

		t.add(10);
		t.add(100);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);

		System.out.println(t);

	}
}

class MyOwnSorting implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if (i1 < i2) {
			return 1;
		} else if (i1 > i2) {
			return -1;
		}
		return 0;
	}
}
