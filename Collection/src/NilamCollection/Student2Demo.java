package NilamCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student2Demo {
	public static void main(String[] args) {
		
		List<Student2> al = new ArrayList<Student2>();
		Student2 s2 = new Student2("ab",20, 65.0F);
		al.add(s2);
		Student2 s3 = new Student2("ww",21, 40.0F);
		al.add(s3);
		Student2 s4 = new Student2("dd",22, 56.0F);
		al.add(s4);
		Student2 s5 = new Student2("tr",23, 55.0F);
		al.add(s5);
		Student2 s6 = new Student2("gh",24, 71.0F);
		al.add(s6);
	
		Iterator<Student2>itr = al.iterator();
		while(itr.hasNext()) {
			Student2 a = itr.next();
			if(a.getpercentage()<=55) {
				System.out.println(a.getpercentage());
				
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 

		
		
		
	}

}
