package damini_LinkedList;

import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		
	
	
	LinkedList<Integer> ll=new LinkedList<Integer>();
	 
	ll.add(10);
	ll.add(20);
	ll.add(40);
	ll.add(50);
	
	System.out.println(ll);
	System.out.println(ll.removeLast());
	
	
	Stack<Integer> s=new Stack<Integer>();
	s.push(100);
	s.push(200);
	s.push(400);
	s.push(500);
	
	System.out.println(s);
	System.out.println(ll.addAll(s));
	
	
	}
}
