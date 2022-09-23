package Sonali_collection_All_Example;


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
		//System.out.println(p.remove());
		//System.out.println(p.element());
		PriorityQueue q = new PriorityQueue<>();
		for(int i=0;i<10;i++) {
			q.offer(i);
			System.out.print(i);
			System.out.println(q.poll());
			System.out.println(q);
			
		}

	}


}


