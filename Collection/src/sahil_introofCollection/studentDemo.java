package sahil_introofCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




public class studentDemo {
	public static void main(String[] args) {
		List<Student> s = new ArrayList<Student> ();
		Student s1 = new Student ("sahil", "java", 101, 85.50, 2022);
		s.add(s1);
		Student s2 = new Student ("akshay", "java", 102, 88.60, 2022);
        s.add(s2);
		Student s7 = new Student ("kalpesh", "java", 101, 54.50, 2022);
        s.add(s7);
		Student s3 = new Student ("ronit", "java", 107, 89.20, 2022);
        s.add(s3);
		Student s4 = new Student ("damini", "java", 104, 85.50, 2022);
		s.add(s4);
		Student s5 = new Student ("kalpna", "java", 105, 85.50, 2022);
		s.add(s5);
		Student s6 = new Student ("rahul", "java", 106, 55.50, 2022);
        s.add(s6);
    
		Iterator<Student> itr = s.iterator();
	 while (itr.hasNext()) {
		 Student b = itr.next();
		 System.out.println(b.getStudentName());
		 System.out.println(b.getStudentClass());
		 System.out.println(b.getStudentRollNumber());
		System.out.println(b.getStudentpercentage());
		 System.out.println(b.getStudentPassingYear());
		 System.out.println("=============================");
			
		 int i=60;
	     while(i<b.getStudentpercentage()) {
	    	 System.out.println(b.getStudentpercentage());
	    	 i++;
	     }

	     }

			}

		 
		 
				
				}
		



	 


		


	


