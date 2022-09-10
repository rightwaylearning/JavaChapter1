package Poonam_TreeSet_Demo;

import java.util.TreeSet;

//import SetPrograms.Employee;
//import SetPrograms.StudentInfo;

public class TreeSet_Demo {
	
	public static void main(String[] args) {
		
		System.out.println("*********************************");
		
		TreeSet num = new TreeSet();
		
		num.add(10);
		num.add(20);
		num.add(1);
		num.add(8);
		num.add(5);
		
		System.out.println(num);
		
		System.out.println("*********************************");
		
		TreeSet<String> s = new TreeSet<>();
		
		s.add("zA");
		s.add("mH");
		s.add("aL");
		s.add("Zz");
		
		System.out.println(s);
		
		System.out.println("*********************************");
		Integer i= new Integer(10);
		Integer j=new Integer(5);
		
		int result = i.compareTo(j);
		
		System.out.println(result);
		
		System.out.println("AA".compareTo("zz"));
		
		System.out.println("*********************************");
		
		// storing non Comparable object inside TreeSet
//		
//		TreeSet<Employee> tree = new TreeSet<>();
//		tree.add(new Employee("A",12));
//		tree.add(new Employee("N",2));
//		tree.add(new Employee("J",1));
//		tree.add(new Employee("R",7));
//		
//		System.out.println(tree);
		
//	    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
//	
//	   TreeSet<StudentInfo> stud = new TreeSet<>();
//	   
//	   stud.add(new StudentInfo("Omkar","Pawar"));
//	   stud.add(new StudentInfo("Rahul","Jadhav"));
//	   stud.add(new StudentInfo("Omkar","Pacharne"));
//	   
//	   System.out.println(stud);
//		
	}

}
