package Sonali_collection_All_Example;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityDemo {

	public static void main(String[] args) {

		PriorityQueue p = new PriorityQueue();
		p.offer("Z");
		p.offer("A");
		p.offer("S");
		p.offer("T");
		p.offer("R");
		p.offer("B");
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p.poll());

	}

}
