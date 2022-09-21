package Sonali_collection_All_Example;

import java.util.List;

public class Course {
	String Name;
	String exams;
	@Override
	public String toString() {
		return "[" + Name + ", " + exams + "]";
	}
	public Course(String name, String exams) {
		super();
		this.Name = name;
		this.exams = exams;
	}
	 
}
	
