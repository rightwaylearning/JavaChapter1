package MapExamples_Jivan;

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<StringBuilder> tree = new TreeSet();
		tree.add(new StringBuilder("Rohit"));
		tree.add(new StringBuilder("Rahul"));
		tree.add(new StringBuilder("Virat"));
		tree.add(new StringBuilder("Sky"));
		tree.add(new StringBuilder("Hardik"));
		tree.add(new StringBuilder("DK"));
		
		System.out.println(tree);
		
	}

}


