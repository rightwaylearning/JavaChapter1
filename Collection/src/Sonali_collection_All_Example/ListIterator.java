package Sonali_collection_All_Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			al.add(i);
		}
		System.out.println(al);

		// only odd number print

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer i1 = itr.next();
			if (i1 % 2 == 0) {
				itr.remove();
			}
		}
		System.out.println(al);

		// even number
		/*
		 * Iterator<Integer> itr2 = al.iterator(); while (itr2.hasNext()) { Integer i1 =
		 * itr2.next(); if (i1 % 2 == 1) { itr2.remove(); } } System.out.println(al);
		 */
		System.out.println("----------------");

		List<Integer> ll = new LinkedList<>();
		for (int i = 1; i <= 20; i++) {
			ll.add(i);
		}
		System.out.println(ll);

		Iterator<Integer> itr3 = ll.iterator();
		while (itr3.hasNext()) {
			Integer i1 = itr3.next();
			if (i1 % 2 == 1) {
				itr3.remove();
			}

		}
		System.out.println(ll);
	}
}


