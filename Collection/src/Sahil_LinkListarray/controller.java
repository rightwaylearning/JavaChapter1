package Sahil_LinkListarray;

import java.util.Iterator;
import java.util.LinkedList;

import sahil_introofCollection.Student;

public class controller {
public static void main(String[] args) {
	LinkedList<student>s=new LinkedList<student>();
	
	student s1 = new student();
	s1.name = "sahil";
	s1.std= "java";
	s1.passingpercentage= 96.30;
	s1.passyear = 2022;
     s.addLast(s1);
     
	 student s2 = new student();
	 s2.name= "akshay";
	 s2.std = "java";
	 s2.passingpercentage =98.84;
	 s2.passyear = 2022;
	 s.add(s2);
	 
	 student s3 = new student();
     s3.name ="rahul";
     s3.std = "java";
     s3.passingpercentage = 98.30;
     s3.passyear = 2022;
     s.add(s3);
     
	 student s4 = new student();
	 s4.name = " nikhil";
	 s4.std = "java";
	 s4.passingpercentage = 89.30;
	 s4.passyear = 2022;
	 s.add(s4);
		

	 

	
}
}
