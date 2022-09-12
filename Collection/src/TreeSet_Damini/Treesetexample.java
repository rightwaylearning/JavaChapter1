package TreeSet_Damini;

import java.util.TreeSet;

public class Treesetexample {

	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<>();
		t.add(1);
		t.add(10);
		t.add(8);
		t.add(60);
		t.add(100);
		System.out.println(t);
		System.out.println("-------------------");
		
		TreeSet<Student> t1=new TreeSet<>();
		t1.add(new Student("A",35.5));
		t1.add(new Student("B",60.6));
		t1.add(new Student("A",39.4));
		t1.add(new Student("A",84.90));
		
		System.out.println(t1);
		
		
	}
	
}
