package IteratorClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<>();
		List<Integer> ll = new LinkedList<>();
		for(int i = 1; i <=20; i++) {
			al.add(i);
			ll.add(i);
		}
		System.out.println(al);
		
		// keep only even number in list
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			if(i%2 == 1) {
				itr.remove();
			}
		}
		
		System.out.println(al);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		ListIterator<Integer> itr1 = ll.listIterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
		System.out.println(">>>>>>>>>>>>");
		if(itr1.hasNext() == false) {
			while(itr1.hasPrevious()) {
				System.out.println(itr1.previous());
			}
		}
		
		// ListIterator
		// 1] hasNext
		// 2] next
		// 3] remove
		// 4] hasRevious
		// 5] previous
		// 6] nextIndex
		// 7] previousIndex
		// 8] set
		// 9] add
		
		// add 1 in all odd number of list
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(ll);
		
		ListIterator<Integer> itr2 = ll.listIterator();
		
		while(itr2.hasNext()) {
			Integer i = itr2.next();
			if(i%2 ==1) {
				itr2.set(i+1);
			}
		}
		
		System.out.println(ll);
	}
}
