package Sonali_collection_All_Example;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueDemo {
	
	public static void main(String[] args) {
		 PriorityQueue<Integer> p = new PriorityQueue<>();
		 
		 p.offer(10);
		 p.offer(1);
		 p.offer(2);
		 p.offer(3);
		 p.offer(4);
		 p.offer(5);
		 p.offer(6);
		 p.offer(7);
		
		 System.out.println(p);
		 System.out.println(p.peek());
		 
		 PriorityQueue<String> p1 = new PriorityQueue<>(new MyComparators());
		 p1.offer("ST");
		 p1.offer("AB");
		 p1.offer("CD");
		 p1.offer("LM");
		 p1.offer("PQ");
		 p1.offer("RS");
		
		 System.out.println(p1);
		 //System.out.println(p1.peek());
		
	}

}
class MyComparators implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		
		return s1.compareTo(s2);
	}
}