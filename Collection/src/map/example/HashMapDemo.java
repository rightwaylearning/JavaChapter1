package map.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
		System.out.println(">>>>>>>>>>>>>>>>>>");
		
		HashMap<Student , String> map2 = new HashMap<>();
		map2.put(new Student(10,"A"), "A");
		map2.put(new Student(10,"A"), "A");
		map2.put(new Student(10,"A"), "A");
		
		System.out.println(map2.size());
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		
		Employee e = new Employee(10);
		HashSet<Employee> set3 = new HashSet<>();
		set3.add(e);set3.add(new Employee(10));set3.add(e);set3.add(e);
		System.out.println(set3.size());
	
		
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
	public int hashCode() {
		return this.rollNumber.hashCode() + this.name.hashCode() + 100;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Student s = (Student)obj;
		
		if(this.rollNumber.equals(s.rollNumber) && this.name.equals(s.name)) {
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return " (" + name + "," + rollNumber + ")";
	}
}

class Employee{
	
	Integer empId;
	
	Employee(Integer empId){
		this.empId = empId;
	}
	
}
	



