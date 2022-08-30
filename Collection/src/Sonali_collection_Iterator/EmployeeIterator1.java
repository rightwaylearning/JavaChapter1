package Sonali_collection_Iterator;

import java.util.Iterator;
import java.util.LinkedList;

final public class EmployeeIterator1 {
	private LinkedList<EmployeeIterator> iterator;
	
	
	
	

	public EmployeeIterator1(LinkedList<EmployeeIterator> iterator) {
		super();
		this.iterator = iterator;
	}





	public void push (EmployeeIterator data) {
		if (data != null) {
			this.iterator.addFirst(data);
		}
	}
	
	public EmployeeIterator pop() {
		if (this.iterator.isEmpty()) {
			System.out.println("Sorry!! Stack is empty, please push first.");
			return null;
		} else {
			return this.iterator.removeFirst();
		}
		
	}
 
	
	public void viewStack() {
		Iterator <EmployeeIterator > itr1 = this.iterator.listIterator();
		while(itr1.hasNext()) {
			
				
			}
		
			System.out.println(itr1.next());
		}
	}
 
	