package Sonali_collection_All_Example;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class ComparableDemo {
	public static void main(String[] args) {
		
		TreeSet<Emp> tr = new TreeSet<>(new MyComapartor());
		tr.add(new Emp("sonali" , 1));
		tr.add(new Emp("rani" , 2));
		tr.add(new Emp("priya" , 3));
		tr.add(new Emp("pinkii" , 4));
		tr.add(new Emp("sona" , 5));
		System.out.println(tr);
		
	}

	
	

	
}
class Emp{
	String Name;
	Integer RollNo;
	public Emp(String name, Integer rollNo) {
		super();
		this.Name = name;
		this.RollNo = rollNo;
	}
	Emp(){
		
	}
	@Override
	public String toString() {
		return " [" + Name + ", " + RollNo + "]";
	}
	
		
}
class MyComapartor implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}
	
}