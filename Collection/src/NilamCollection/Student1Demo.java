package NilamCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student1Demo {

	public static void main(String[] args) {

		List<Student1> al = new ArrayList<Student1>();

		Student1 s1 = new Student1();
		s1.studentName = "abc";
		s1.rollNumber = 32;
		s1.percentage = 60.01F;
		al.add(s1);

		Student1 s2 = new Student1();
		s2.studentName = "xyz";
		s2.rollNumber = 31;
		s2.percentage = 65.01F;
		al.add(s2);

		Student1 s3 = new Student1();
		s3.studentName = "fgh";
		s3.rollNumber = 30;
		s3.percentage = 55.01F;
		al.add(s3);

		Student1 s4 = new Student1();
		s4.studentName = "pqr";
		s4.rollNumber = 29;
		s4.percentage = 56.01F;
		al.add(s4);

		Student1 s5 = new Student1();
		s5.studentName = "lmn";
		s5.rollNumber = 28;
		s5.percentage = 61.01F;
		al.add(s5);

		Iterator<Student1> itr = al.iterator();

		while (itr.hasNext()) {
			Student1 s = itr.next();
			if (s.getPercentage() >= 60) {
				System.out.println(s.getStudentName());
				System.out.println(s.getRollNumber());
				System.out.println(s.getPercentage());
				
			}

		}

	}

}
