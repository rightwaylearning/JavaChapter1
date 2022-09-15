package assignment_14_09_2022;

import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateObjectFromList {

	public static void main(String[] args) {
		
		ArrayList<Student> array = new ArrayList<>();
		array.add(new Student(1,"A"));
		array.add(new Student(11,"B"));
		array.add(new Student(12,"A"));
		array.add(new Student(13,"A"));
		array.add(new Student(1,"C"));
		
	 HashMap<String, Integer> map = new HashMap<>();
	 
	  for(Student s : array) {
		  
		  if(map.containsKey(s.name)) {
			  
			  Integer cnt = map.get(s.name);
			  cnt++;
			  map.put(s.name,cnt);
			  
		  }else {
			  map.put(s.name, 1);
		  }
	  }
	 System.out.println(map);
	}
}

class Student{
	Integer rollNumber;
	String name;
	
	public Student(Integer rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}
		
}