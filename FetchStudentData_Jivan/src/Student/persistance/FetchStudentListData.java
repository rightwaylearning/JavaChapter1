package Student.persistance;

import java.util.ArrayList;
import java.util.List;

import Model.Student;

public class FetchStudentListData {
		
	public List<Student> getStudentList() {
		
		List<Student> studentList = new ArrayList<Student>();

		Student s1 = new Student("A", 14, 85.40f);
		studentList.add(s1);

		Student s2 = new Student("B", 24, 65.74f);
		studentList.add(s2);

		Student s3 = new Student("C", 25, 69.74f);
		studentList.add(s3);

		Student s4 = new Student("D", 34, 68.74f);
		studentList.add(s4);

		Student s5 = new Student("E", 27, 61.74f);
		studentList.add(s5);
		
		return studentList;
	}

}
