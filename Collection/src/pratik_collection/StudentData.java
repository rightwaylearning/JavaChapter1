package pratik_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentData {
	public static void main(String[] args) {
		ArrayList<Student> a=new ArrayList<Student>();
		
	Student s=new Student("Frank",20,80.9f);
	a.add(s);
	Student s1=new Student("Allen",21,90.9f);
	a.add(s1);
	Student s3=new Student("ab",22,54.60f);
	a.add(s3);
	Student s4=new Student("ram",24,59.9f);
	a.add(s4);
	Iterator<Student> i=a.iterator();
	while(i.hasNext()){
		Student ss=i.next();
		if(ss.getPercentage()>=60) {
		System.out.println(ss.getName());
		System.out.println(ss.getPercentage());
		System.out.println(ss.getRollNumber());
		System.out.println();
	}
	}

		}
}
