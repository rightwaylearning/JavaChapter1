package student.controller;

import java.util.List;

import model.Student;
import student.service.StudentService;

public class StudentController {

	public static void main(String[] args) {
		
		StudentService service = new StudentService();
		List<Student> list = service.getAllData();
		
	}
}
