package tree.set.examples;

import java.util.TreeSet;

public class TreeSetExamples {

	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet<>();
		 
		t.add(1);
		t.add(10);
		t.add(1000);
		t.add(100);
		t.add(20);
		
		System.out.println(t);  
		
		System.out.println(">>>>>>>>>>>>>>>>");
		
		TreeSet<Student> student = new TreeSet<>();
	   
		student.add(new Student("T",95.0));
		student.add(new Student("Hr",35.0));
		student.add(new Student("A",85.0));
		student.add(new Student("B",45.0));
		
		System.out.println(student);
	}
}
