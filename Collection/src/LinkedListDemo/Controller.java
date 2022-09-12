package LinkedListDemo;

public class Controller {

	public static void main(String[] args) {
		
		StudentStack stack = new StudentStack();
		
		  StudentInfo s = new StudentInfo("A",23,56.78);
		  stack.push(s);
		  
		  StudentInfo s1 = new StudentInfo("B",24,36.10);
		  stack.push(s1);
		  
		  
		  StudentInfo s2 = new StudentInfo("C",25,76.71);
		  stack.push(s2);
		  
		  StudentInfo s3 = new StudentInfo("D",26,78.70);
		  stack.push(s3);
		  
		  stack.viewStack();
		  
		  System.out.println(">>>>>>>>>>>>>");
		  stack.pop(); stack.pop(); stack.pop();//stack.pop();
		 // stack.pop();
		  
		  stack.viewStack();
		
	}
}
