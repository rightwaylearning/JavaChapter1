package QueuePrograms_Jivan;

import java.util.PriorityQueue;

public class DemoOfPriorityQueue {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> obj = new PriorityQueue<Integer>();
		// insertion order
		// DNSO
		// null
		// if u are depend on DNSO then your obj should be homo and comparable
		obj.offer(10);
		obj.offer(123);
		obj.offer(100);
		obj.offer(1000);
		obj.offer(1);
		obj.offer(1001);
		obj.offer(300);
		System.out.println(obj);
		System.out.println(obj.peek());
	//	System.out.println(obj.poll());
		System.out.println(obj.remove());
		System.out.println(obj);
		
		
	}
}
