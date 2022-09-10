package Sonali_collection_Iterator;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemoWithDuplicate {

	public static void main(String[] args) {
		HashSet<Student> s = new HashSet<>();
		Student s1 = new Student("sonali", 23);
		s.add(s1);
		Student s2 = new Student("sonali", 23);
		s.add(s2);
		Student s3 = new Student("sonali", 23);
		s.add(s3);
		System.out.println(s);
		System.out.println(s.size());

		Iterator<Student> itr = s.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

class Student {
	String name;
	Integer RollNo;

	public Student(String name, Integer rollNo) {
		super();
		this.name = name;
		RollNo = rollNo;
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if (s.equals(this.name) && s.equals(this.RollNo)) {

			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = this.RollNo.hashCode() + this.name.hashCode();
		return hashCode;
	}

	Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollNo() {
		return RollNo;
	}

	public void setRollNo(Integer rollNo) {
		RollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", RollNo=" + RollNo + "]";
	}

}
