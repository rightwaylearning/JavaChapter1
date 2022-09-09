package Sonali_collection_Iterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		LinkedList l = new LinkedList<>();
		l.add("sonali");
		l.add("Ranii");
		l.add("Priya");
		l.add("Priti");
		l.add("Rups");
		l.add("Didi");

		System.out.println(l);
		ListIterator itr = l.listIterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			if (s.equals("Rups")) {
				itr.remove();
			}
		}
		System.out.println(l);
	}
}
