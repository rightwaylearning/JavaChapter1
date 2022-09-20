package Poonam_Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import sahil_introofCollection.allVies;

class Student{
	       
	      Integer RollNum;
	      String StudName;
	      
	      Student(){}
	      
//	      Student(  Integer RollNum,String StudName) {
//			
//	    	  this.RollNum=RollNum;
//	    	  this.StudName=StudName;
//		}
	 
	 }
 
   public class Asgnmt_Student_ExamDetails {

	    public static void main(String[] args) {
			
	    	LinkedList l = new LinkedList();
	    	
	    	l.add("MH-CET");
	    	l.add("JEE");
	    	l.add("NEET");
	    	l.add("CAT");
	    	
	     System.out.println(l);
	     
	     Student s1= new Student(1, "A");
	     l.add(s1);
	     Student s2= new Student(2, "B");
	     l.add(s2);
         Student s3= new Student(3, "C");
         l.add(s3);
         Student s4= new Student(4, "D");
         l.add(s4);
         Student s5= new Student(5, "E");
         l.add(s5);
	        
//         System.out.println(s1);
//         System.out.println(s2);
//         System.out.println(s3);
//         System.out.println(s4);
//         System.out.println(s5);
//	     
		     
         Iterator<Student> itr=s.iterator();
         while(itr.hasNext())
         {
        	 Stuednt s=itr.next();
        	 
         }
		}

  }
