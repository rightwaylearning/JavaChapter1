package LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;

final public class StudentStack {

	private LinkedList<StudentInfo> stack;

	StudentStack() {
		this.stack = new LinkedList<StudentInfo>();
	}

	public void push(StudentInfo data) {
		if (data != null) {
			this.stack.addFirst(data);
		}
	}

	public StudentInfo pop() {
		if (this.stack.isEmpty()) {
			System.out.println("Sorry!! Stack is empty, please push first.");
			return null;
		} else {
			return this.stack.removeFirst();
		}
	}
	
	public void viewStack() {
		Iterator<StudentInfo> itr = this.stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
