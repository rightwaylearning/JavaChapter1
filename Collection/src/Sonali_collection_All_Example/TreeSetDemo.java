package Sonali_collection_All_Example;

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		TreeSet ts = new TreeSet<>();
		ts.add(10);
		ts.add(30);
		ts.add(40);
		ts.add(20);
		ts.add(60);
		ts.add(90);
		ts.add(50);
		//ts.add(null); // Null pointer Exception
		//ts.add("sonali");// classCastException
		System.out.println(ts);
		
	}

}
