package queue.programs;

import java.util.PriorityQueue;

public class DemoOfPriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> obj = new PriorityQueue();
		// insert order 
		// DNSO
		// NULL
		// if u are depend on DNSO then ur object should be HOM & Comparable
		obj.offer(300);
		obj.offer(100);
		obj.offer(10);
		obj.offer(400);
		
		System.out.println(obj);
		System.out.println(obj.remove());
		System.out.println(obj);
	}
	
}
