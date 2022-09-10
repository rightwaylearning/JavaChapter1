package SetPrograms;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet num = new TreeSet();
		
		// insertion order not allow bz of DNSO
		// duplicate not allow 
		// null insertion not allow
		// HERO not allow or HOMO
		// inserted object should Comparable  // 9
		
		num.add(10);
		num.add(1);
	//	num.add(null); null insertion not allow OW Runtime exception will through
		num.add(7);
		num.add(6);
		num.add(1);
	//	num.add("sachin"); HERO objects we can't insert
		
		System.out.println(num);  //[1,6,7,10]
		
		TreeSet<String> t = new TreeSet<>();
		t.add("MM");
		t.add("BB");
		t.add("aa");
		t.add("ZZ");
		t.add("AA");
		t.add("aA");
		System.out.println(t);
		
		// 8 + wrapper classes + 1 String  = 9
		// 9 >> duplicate find out >> hashCode() equals()
		// 9 >> Comparable (I) >> java.lang.Comparable 
		                         // int comparteTo(Object o)
		
	//======================= KT how TressSEt arrange DNSO
		
		Integer i = new Integer(10);
		
		Integer j = new Integer(10);  //  10,10
		
		int r=  i.compareTo(j);  // DNSO
		// -1 if order is fine
		System.out.println(r);
		
		System.out.println("AA".compareTo("AA"));  // AA,ZZ
		
  // we are storing non Comparable object inside TreeSet
		
		System.out.println(">>>>>>>>>>>>>>>>");
		
		TreeSet<Employee> tree = new TreeSet<>();
		
		tree.add(new Employee("Animesh",12));
		tree.add(new Employee("Nkesh",2));
		tree.add(new Employee("JOhn",1));
		tree.add(new Employee("Rahul",7));
		
		System.out.println(tree);
		
	    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
	
	   TreeSet<StudentInfo> stud = new TreeSet<>();
	   
	   stud.add(new StudentInfo("Omkar","Pawar"));
	   stud.add(new StudentInfo("Rahul","Jadhav"));
	   stud.add(new StudentInfo("Omkar","Pacharne"));
	   
	   System.out.println(stud);
		
	}
}
