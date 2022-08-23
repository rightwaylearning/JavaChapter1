package student.service;

import java.util.List;

import model.Student;
import student.persistance.FetachStudentListData;

public class StudentService {


	public List<Student> getAllData() {
		FetachStudentListData obj= new FetachStudentListData();
		List<Student> data = obj.getStudentList();
		return data;
	}
	
}
