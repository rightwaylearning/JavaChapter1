package ArrayListExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentDemo {

	public static void main(String[] args) {
		
		List<Student> al = new ArrayList<Student>();
		
		Student s1= new Student("A", 23);
		al.add(s1);
		Student s2= new Student("B", 23);
		al.add(s2);
		
		Iterator<Student> itr = al.iterator();
		
		while(itr.hasNext()) {
			Student s = itr.next();
			System.out.println(s.getName());
			System.out.println(s.getRollNumber());
			System.out.println(">>>>>>>");
		}
						
	}
}
