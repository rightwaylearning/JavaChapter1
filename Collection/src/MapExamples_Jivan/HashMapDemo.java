package MapExamples_Jivan;

import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(10, "Mahesh");
		map.put(20, "Jivan");
		map.put(30, "Satvik");
		map.put(40, "Sahil");
		map.put(50, "Anupama");
		
		System.out.println(map.size());
		System.out.println(map);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>");
		
		HashMap<Integer, Student> map1 = new HashMap<>();
		
		map1.put(1, new Student(1, "Arjun"));
		map1.put(2, new Student(2, "Bhim"));
		map1.put(3, new Student(3, "Nakul"));
		
		System.out.println(map1);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		HashMap<Student, String> map2 = new HashMap();
		
	}
}

class Student{
	private Integer rollNumber;
	private String name;
	
	public Student(Integer rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
		
	}

	@Override
	public String toString() {
		return " [" + rollNumber + ", " + name + "]";
	}

	
}

class Employee{
	
	Integer empId;
	
	Employee(Integer, )
}

 
