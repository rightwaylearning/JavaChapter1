package QueuePrograms_Jivan;

import java.util.LinkedList;

public class QueueImplLL {
	
	LinkedList<Integer> list;
	QueueImplLL() {
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
		QueueImplLL q = new QueueImplLL();
		q.addObject(1000);
		q.addObject(200);
		q.addObject(20000);
		q.addObject(2);
		q.addObject(1000);
		
		System.out.println(q.list);
		System.out.println(q.getObject());
		System.out.println(q.list);
		System.out.println(9999);
		System.out.println(q.getObject());
		System.out.println(q.list);
	}

}
