package Akshay_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentDemo {
	
	public static void main(String[] args) {
		
		List<Student> al = new ArrayList <Student> ();
		
		Student s1 = new Student ("Akshay Tejale", 25);
		al.add(s1);
		
		Student s2 = new Student ("Sahil Bagade", 26);
		al.add(s2);
		
		Iterator<Student> itr = al.iterator();
		
		while (itr.hasNext()) {
			
			Student s = itr.next();
			
			System.out.println("Student Name is =  "+s.getName());
			System.out.println("Roll Number is =  "+s.getRollNum());
		}
	}

}
