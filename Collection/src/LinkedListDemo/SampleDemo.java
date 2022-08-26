   package LinkedListDemo;

import java.util.LinkedList;

public class SampleDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer>  ll = new LinkedList<>();
		ll.add(10);ll.add(20);ll.add(30);ll.add(40);
		
		
		ll.addFirst(100);
		ll.addFirst(200);
		ll.addFirst(300);
		
		
		
		System.out.println(ll.getFirst());
	}
}
