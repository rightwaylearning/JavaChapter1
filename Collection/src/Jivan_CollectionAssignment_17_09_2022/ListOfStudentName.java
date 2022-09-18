package Jivan_CollectionAssignment_17_09_2022; 

import java.util.ArrayList;
import java.util.List;

public class ListOfStudentName {

	public static void main(String[] args) {
		
		List<StudentsAttendingExams> list = new ArrayList<>();
		
		List<String> sahilExams = new ArrayList<>();
		sahilExams.add("JEE"); sahilExams.add("NEET");
		
		list.add(new StudentsAttendingExams(10, "Sahil", sahilExams));
	}
}
