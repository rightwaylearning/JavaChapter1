package Student.service;

import java.util.List;

import Model.Student;
import Student.persistance.FetchStudentListData;

public class StudentService {

	public List<Student> getAllData() {
		FetchStudentListData obj = new FetchStudentListData();
		List<Student> data = obj.getStudentList();
		return data;
	}
}
