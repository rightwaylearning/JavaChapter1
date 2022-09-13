package nilam_SetProgram;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(50);
		//t.add(null);
		t.add(60);
		t.add(20);
		t.add(13);
		t.add(10);
		
		System.out.println(t);
		
		TreeSet<Employee> tree = new TreeSet<>();
		tree.add(new Employee("Advik",2));
		tree.add(new Employee("Ajit",34));
		tree.add(new Employee("Nilam",10));
		tree.add(new Employee("Akshay",20));
		tree.add(new Employee("Rohan",22));
		tree.add(new Employee("Advik",2));
		
		System.out.println(tree);
		
		TreeSet<StudentInfo> tset = new TreeSet<>();
		tset.add(new StudentInfo("omkar", "pacharne"));
		tset.add(new StudentInfo("omkar", "pawar"));
		tset.add(new StudentInfo("omkar", "nagwade"));
		tset.add(new StudentInfo("omkar", "kale"));
		
		System.out.println(tset);
	}

}
