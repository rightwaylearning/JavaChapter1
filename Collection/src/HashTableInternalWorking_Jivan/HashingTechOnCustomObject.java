package HashTableInternalWorking_Jivan;

import java.util.HashMap;
import java.util.Set;

class Student{
	Integer rollNumber;
	String name;
	
	Student(Integer rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj){
		Student s = (Student)obj;
		if(this.name.equals(s.name) && this.rollNumber.equals(s.rollNumber));
		return false;
	}
	
	public int hashCode() {
		return this.name.hashCode() + this.rollNumber.hashCode();
	}
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + "]";
	}
}

public class HashingTechOnCustomObject {

	public static void main(String[] args) {
		
		HashMap<Student, Integer> map = new HashMap<>();
		
		Student s = new Student(23, "Aa");
		map.put(s,  23);
		System.out.println(s.hashCode() % 16);
		
		Student s1 = new Student(24, "Bb");
		map.put(s1,  200);
		System.out.println(s1.hashCode() % 16);
		
		Student s2 = new Student(48, "Mm");
		map.put(s2,  300);
		System.out.println(s2.hashCode() % 16);
		
		Student s3 = new Student(23, "Aa");
		map.put(s3,  400);
		System.out.println(s3.hashCode() % 16);
		
	//	System.out.println(map);
		Set<Student> k = map.keySet();
		
		for(Student w: k) {
			System.out.println(w + ">>" + map.get(w));
		}
	}
}
