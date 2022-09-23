package Sonali_collection_All_Example;

import java.util.LinkedList;

public class OuequImplementInLL {

	LinkedList<Integer> list;

	OuequImplementInLL() {
		this.list = new LinkedList<>();
	}

	void addObject(Integer i) {
		this.list.addLast(i);
	}

	Integer getObject(Integer i) {
		if (this.list.isEmpty()) {
			return null;
		} else {
			return this.list.removeFirst();

		}
		
	}
	public static void main(String[] args) {
		
		OuequImplementInLL queue = new OuequImplementInLL();
		queue.addObject(70);
		queue.addObject(10);
		queue.addObject(20);
		queue.addObject(30);
		queue.addObject(40);
		queue.addObject(50);
		System.out.println(queue.list);
		System.out.println(queue.list.peek());
		System.out.println(queue.list.poll());
		System.out.println(queue.list);
		System.out.println(queue.list.remove());
		System.out.println(queue.list);
		
	}
}

