package Kalpesh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentData {
	public static void main(String[] args) {
		
		List<Student> s = new ArrayList<Student>();
		
		Student s1 = new Student("KJ",11,90.56d);
		s.add(s1);
		Student s2 = new Student("AP",12,87.88d);
		s.add(s2);
		Student s3 = new Student("OT",13,60.66d);
		s.add(s3);
		Student s4 = new Student("VK",14 ,70.44d);
		s.add(s4);
		Student s5 = new Student("RK",15,66.55d);
		s.add(s5);
		Student s6 = new Student("RR",16,55.55d);
	    s.add(s6);
	    Student s7 = new Student("MM",17,40.55d);
	    s.add(s7);
	    Student s8 = new Student("KK",18,50.55d);
	    s.add(s8);
		
		Iterator<Student> itr = s.iterator();
		while (itr.hasNext()) {
			
			Student ss = itr.next();
			
			 if(ss.getStudentPercentage()>=60);
			
			
			System.out.println(ss.getStudentPercentage());
			System.out.println(ss.getStudentName());
			System.out.println(ss.getStudentRollNumber());
			System.out.println("------------------------------");
		}
		
	}

}
