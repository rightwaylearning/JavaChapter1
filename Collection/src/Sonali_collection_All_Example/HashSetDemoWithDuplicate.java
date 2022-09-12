package Sonali_collection_All_Example;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemoWithDuplicate {

	public static void main(String[] args) {
		HashSet<StudentInfo> s = new HashSet<>();
		StudentInfo s1 = new StudentInfo("sonali", 23);
		s.add(s1);
		StudentInfo s2 = new StudentInfo("sonali", 23);
		s.add(s2);
		StudentInfo s3 = new StudentInfo("sonali", 23);
		s.add(s3);
		System.out.println(s);
		System.out.println(s.size());

		Iterator<StudentInfo> itr = s.iterator();

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
		StudentInfo s = (StudentInfo) obj;
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
