package Akshay_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList <Student> ();
		
		Student s1 = new Student ("Akshay Tejale", 25, 50.00);
		al.add(s1);
		
		Student s2 = new Student ("Sahil Bagade", 26, 50.50);
		al.add(s2);
		
		Student s3 = new Student ("Vishal Sawalkar",27,48.48);
		al.add(s3);
		
		Student s4 = new Student ("Sachin Chaudhari", 28, 40.42);
		al.add(s4);
		
		Student s5 = new Student ("Ganesh Jadhav", 29, 35.32);
		al.add(s5);
	
		
		Iterator<Student> itr = al.iterator();
		
		while (itr.hasNext()) {
			
			Student s = itr.next();
			
			if (50.00 <= s.getMarks()) {
			
			System.out.println("Student Name is =  "+s.getName());
			System.out.println("Roll Number is =  "+s.getRollNum());
			System.out.println("Total Marks is =  "+s.getMarks());
			System.out.println("===================================================");
		}
	}

}
	
}
	
