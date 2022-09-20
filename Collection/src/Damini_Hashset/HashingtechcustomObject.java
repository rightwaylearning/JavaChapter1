package Damini_Hashset;

import java.util.HashMap;
import java.util.Set;

class Student
{
	Integer rollNumber;
	String name;
	
	public Student(Integer rollNumber,String name)
	{
		this.name=name;
		this.rollNumber=rollNumber;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode()+this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		Student s1 = (Student) obj;
		if(this.name.equals(s1.name)&&this.rollNumber.equals(s1.rollNumber))
		{
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return " [" + rollNumber + "," + name + "]";
	}
	
	
	}
public class HashingtechcustomObject {
public static void main(String[] args) {
	HashMap<Student,Integer> map=new HashMap<>();
	
	Student s=new Student(12,"AA");
	map.put(s, 100);
	System.out.println(s.hashCode()%16);
	
	Student s1=new Student(14,"BB");
	map.put(s, 200);
	System.out.println(s.hashCode()%16);
	
	Student s2=new Student(18,"CC");
	map.put(s, 300);
	System.out.println(s.hashCode()%16);
	
	Student s3=new Student(17,"AA");
	map.put(s, 400);
	System.out.println(s.hashCode()%16);
	
	Set<Student>k=map.keySet();
	for (Student student : k) {
		System.out.println(student+">>"+map.get(student));
		
	}
			
	
	
}
}
