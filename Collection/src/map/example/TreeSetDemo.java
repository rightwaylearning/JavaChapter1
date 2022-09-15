package map.example;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		
		TreeMap<String , Integer>  map = new TreeMap();
		// DNSO >>>>> Bz String class implements Comparable
			map.put("ZZ", 1);
			map.put("MM", 1);
			map.put("LL", 1);
			map.put("BB", 1);
			map.put("RR", 1);
		
		 System.out.println(map);
		 
		 // if I wand desc order above list
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"); 
		
		 TreeMap<String , Integer>  map1 = new TreeMap(new MyWaySorting());
			map1.put("ZZ", 1);
			map1.put("MM", 11);
			map1.put("LL", 12);
			map1.put("BB", 13);
			map1.put("RR", 14);
		System.out.println(map1);
		
		// custom key like Student
		System.out.println(">>>>>>>>>>>>>>>>");
		TreeMap<Student1, Integer> obj = new TreeMap<>(new MyOwnWayImpl());
		obj.put(new Student1(12,"SS"), 12);
		obj.put(new Student1(13,"MM"), 12);
		obj.put(new Student1(2,"LL"), 2);
		obj.put(new Student1(1,"TT"), 12);
		System.out.println(obj);
	}
}

class MyWaySorting implements Comparator<String>{
	
	@Override
	public int compare(String o1, String o2) {
		
		return -o1.compareTo(o2);
	}
}

class Student1 implements Comparable{
	Integer rollNumer;
	String name;
	
     Student1(Integer rollNumer, String name) {
		 this.rollNumer = rollNumer;
		 this.name = name;
	}

	@Override
	public String toString() {
		return "[" + rollNumer + ", " + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student1 s = (Student1)o;
		  return this.name.compareTo(s.name);
	}    
     
}

class MyOwnWayImpl implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		
	  return -o1.rollNumer.compareTo(o2.rollNumer);
	}
	
}
