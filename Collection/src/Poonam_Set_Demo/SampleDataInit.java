package Poonam_Set_Demo;

import java.util.ArrayList;
import java.util.List;

class Student{
	String name;
	Integer rollNumer;
	List<String> exams;
	
	public Student(String name, Integer rollNumer, List<String> exams) {
		super();
		this.name = name;
		this.rollNumer = rollNumer;
		this.exams = exams;
	}
	
}


public class SampleDataInit {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();  l.add("NEET");   l.add("SET");  l.add("MHT");	
	   
		String st = new String("abc");
	    Integer i = new Integer(10);
		
	    Student s = new Student(st,i,l);
		
		
	}
	
}
