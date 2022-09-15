package map.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(10, "Anupama");
		map.put(20, "Anupama");
		map.put(30, null);
		map.put(40, null);
		map.put(50, null);
		
		System.out.println(map.size()); //4
		System.out.println(map);
		
	     System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		HashMap<Integer, Student> map1 = new HashMap<>();
		
		map1.put(1,new Student(1,"Arjun"));
		map1.put(2,new Student(2, "bhim"));
		map1.put(3,new Student(3, "Nakul"));
		
		System.out.println(map1);
		
		//=========================
		//map.clear();  // it will remove all object from map
		// System.out.println(map);
		
		System.out.println(map.containsKey(30));
		System.out.println(map.containsKey(100));
		System.out.println(map.containsValue("Anupama"));
		
		// put, get, containsKey,containsValue
		
		//map.isEmpty();; true
	}
}

class Student{
	
	private Integer rollNumber;
	private String name;
	
	public Student(Integer rollNumber,String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}

	@Override
	public String toString() {
		return " (" + name + "," + rollNumber + ")";
	}
	
	
	//List<Student> list = new ArrayList<>();
	
	
}