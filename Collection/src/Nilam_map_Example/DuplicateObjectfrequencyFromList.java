package Nilam_map_Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DuplicateObjectfrequencyFromList {
	public static void main(String[] args) {

		List<Student> l = new ArrayList<>();
		l.add(new Student(10, "AA"));
		l.add(new Student(10, "AA"));
		l.add(new Student(10, "bb"));
		l.add(new Student(10, "bb"));
		l.add(new Student(10, "CC"));
		l.add(new Student(10, "CC"));
		l.add(new Student(10, "DD"));

		HashMap<String, Integer> map = new HashMap<>();
		for (Student s : l) {

			if (map.containsKey(s.name)) {
				Integer i = map.get(s.name);
				i++;
				map.put(s.name, i);

			} else {
				map.get(s.name);
				map.put(s.name, 1);

			}
		}
		System.out.println(map);
	}

}

class Student {
	Integer rollNumber;
	String name;

	public Student(Integer rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}

	@Override
	public String toString() {
		return " [" + rollNumber + " " + name + "]";
	}

}