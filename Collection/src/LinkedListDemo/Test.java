package LinkedListDemo;

import java.util.ArrayList;
import java.util.LinkedList;

class Student {
	String name;
	int rollNumber;
	float percenatge;
	
	public Student(String name, int rollNumber, float percenatge) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.percenatge = percenatge;
	}

	@Override
	public String toString() {
		return "{"+ name + ", " + rollNumber + "," + percenatge + "}";
	}
	
}
public class Test {

	public static void main(String[] args) {
		
		StudentInfo s= new StudentInfo("AB",23,78.00F);
		System.out.println(s);  // s.toString();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(10);
		ll.add(20);
		ll.add(50);
		ll.add(40);
		ll.add(50);
		ll.add(null);
		
		ArrayList<Integer> al = new ArrayList<>(ll);
		
		System.out.println(ll.toString());
		
	}
}
