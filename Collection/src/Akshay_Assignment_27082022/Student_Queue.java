package Akshay_Assignment_27082022;

import java.util.Iterator;
import java.util.LinkedList;

final public class Student_Queue {

	private LinkedList<Student_info> queue;

	Student_Queue (){
		this.queue = new LinkedList<Student_info>();
	}

	public void push(Student_info data) {

		if (data != null) {
			
			this.queue.addLast(data);
			
//			this.queue.addFirst(data);
		}
	}

	public Student_info pop() {

		if (this.queue.isEmpty()) {

			System.out.println("\"Sorry!! Queue is empty, please push first.\"");
			return null;
		} else {
			return this.queue.removeLast();
//			return this.queue.removeFirst();
		}
	}

	public void viewStack() {
		Iterator<Student_info> itr = this.queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
