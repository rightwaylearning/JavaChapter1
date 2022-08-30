package Akshay_Assignment_27082022;

public class Controller{
	
	public static void main(String[] args) {
		
		System.out.println("Stack Method\n");
		Student_stack stack = new Student_stack ();
		
		Student_info s = new Student_info ("A", 25, 30.26);
		stack.push(s);
		
		Student_info s1 = new Student_info ("B", 26, 31.26);
		stack.push(s1);
		
		Student_info s2 = new Student_info ("C", 27, 32.26);
		stack.push(s2);
		
		Student_info s3 = new Student_info ("D", 28, 33.26);
		stack.push(s3);
		
		Student_info s4 = new Student_info ("E", 29, 34.26);
		stack.push(s4);
		
		Student_info s5 = new Student_info ("F", 30, 35.26);
		stack.push(s5);
		
		stack.viewStack();
		
		stack.pop();stack.pop();stack.pop();stack.pop();stack.pop();stack.pop();
		
		stack.viewStack();
		System.out.println("\n***************************************************************\n");
		
	System.out.println("Queue Method\n");	
	
	Student_Queue queue = new Student_Queue ();
	
	Student_info p = new Student_info ("A", 25, 30.26);
	queue.push(p);
	
	Student_info p1 = new Student_info ("B", 26, 31.26);
	queue.push(p1);
	
	Student_info p2 = new Student_info ("C", 27, 32.26);
	queue.push(p2);
	
	Student_info p3 = new Student_info ("D", 28, 33.26);
	queue.push(p3);
	
	Student_info p4 = new Student_info ("E", 29, 34.26);
	queue.push(p4);
	
	Student_info p5 = new Student_info ("F", 30, 35.26);
	queue.push(p5);
	
	queue.viewStack();
	
	queue.pop();queue.pop();queue.pop();queue.pop();queue.pop();queue.pop();
	
	queue.viewStack();
	
}
}