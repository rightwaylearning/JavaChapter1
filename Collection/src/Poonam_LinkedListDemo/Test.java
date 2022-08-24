package Poonam_LinkedListDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll= new LinkedList<>();
		
		ll.add(10);
		ll.add(20);
		ll.add(null);
		ll.add(30);
		ll.add(50);
		ll.add(40);
		
		ArrayList<Integer> al = new ArrayList<>(ll);
		
		System.out.println(al.get(4));
		
	}

}
