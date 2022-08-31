import java.util.Stack;

public class Stack_demo {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		
		System.out.println(s);
		
		Integer r = s.peek();            //s.pop();
		System.out.println(r);
		System.out.println(s);
		
		System.out.println(s.search(200));
		
		// push
		// pop
		// peek
		// serach(Object o)
		// empty()
	}
}
