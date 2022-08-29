package Akshay_Assignment_27082022;

import java.util.Iterator;
import java.util.LinkedList;

final public class Student_stack {

	private LinkedList<Student_info> stack;

	Student_stack() {

		this.stack = new LinkedList<Student_info>();
	}

	public void push(Student_info data) {

		if (data != null) {

			this.stack.addFirst(data);
		}
	}

	public Student_info pop() {

		if (this.stack.isEmpty()) {

			System.out.println("\"Sorry!! Stack is empty, please push first.\"");
			return null;
		} else {
			return this.stack.removeFirst();
		}
	}

	public void viewStack() {
		Iterator<Student_info> itr = this.stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
