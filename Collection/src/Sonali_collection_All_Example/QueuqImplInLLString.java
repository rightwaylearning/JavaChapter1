package Sonali_collection_All_Example;

import java.util.LinkedList;

public class QueuqImplInLLString {
	LinkedList<String> string;

	QueuqImplInLLString() {
		this.string = new LinkedList<>();
	}

	void addObject(String s) {
		this.string.addFirst(s);
	}

	String getObject(String s) {
		if (this.string.isEmpty()) {
			return null;
		} else {
			return this.string.removeFirst();
		}
	}

	public static void main(String[] args) {
		QueuqImplInLLString queue = new QueuqImplInLLString();
		queue.addObject("ABC");
		queue.addObject("PQR");
		queue.addObject("LMN");
		queue.addObject("XYZ");
		queue.addObject("IJK");
		System.out.println(queue.string);
		System.out.println(queue.string.peek());
		System.out.println(queue.string);
	}
}
