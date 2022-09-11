package Sonali_collection_All_Example;

import java.util.TreeSet;

public class StudentInfoOutput {
	
	public static void main(String[] args) {
		TreeSet<StudentInfo> s = new TreeSet();
		s.add(new StudentInfo("Sonali",23));
		s.add(new StudentInfo("Rani",2));
		s.add(new StudentInfo("Rupali",12));
		s.add(new StudentInfo("Priya",33));
		s.add(new StudentInfo("Pinkiii",50));
		System.out.println(s);
	}

}
