package Student.controller_Jivan;

import java.util.List;

import Model.Student;
import Student.service.StudentService;

public class StudentController {

	public static void main(String[] args) {
		
		StudentService service = new StudentService();
		
		List<Student> list = service.getAllData();
		
		
	}
}
