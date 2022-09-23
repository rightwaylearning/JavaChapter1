package queue.programs;

import java.util.LinkedList;
import java.util.List;

public class QueueImplInLL {

	LinkedList<Integer> list;
	QueueImplInLL(){
		this.list = new LinkedList<>();
	}
	
	void addObject(Integer i) {
		this.list.addLast(i);
	}
	
	Integer getObject() {
		if(this.list.isEmpty()) {
			return null;
		}

		return list.removeFirst();
		
	}
	
	public static void main(String[] args) {
		QueueImplInLL q = new QueueImplInLL();	
		q.addObject(1000);
		q.addObject(200);
		q.addObject(20000);
		q.addObject(2);
		System.out.println(q.list);
		System.out.println(q.getObject());
		System.out.println(q.list);
		q.addObject(9999);
		System.out.println(q.getObject());
		System.out.println(q.list);
	}
}
