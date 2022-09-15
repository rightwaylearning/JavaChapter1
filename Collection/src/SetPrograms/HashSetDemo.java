package SetPrograms;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Student> set = new HashSet<>();
		
		set.add(new Student(10));
		System.out.println(set.add(new Student(10)));
		System.out.println(set.size());
	}
}

class Student{
	Integer i;
	Student(Integer i){
		this.i =i;
	}
	
@Override

	public int hashCode() {
		return this.i;
	}
	
	@Override
public boolean equals(Object obj) {
		Student s = (Student)obj;
		return this.i.equals(s.i);
	}
}
