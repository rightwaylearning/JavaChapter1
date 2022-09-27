package Akshay_Assignment_of_ListofStudentName17_Sep_2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Controller {

	public static void main(String[] args) {
		
		List <Student> list = new ArrayList <>();
		
		List<String> AkshayExam = new ArrayList <>();
		AkshayExam.add("JEE");
		AkshayExam.add("MH-CET");
		list.add(new Student (10,"Akshay Tejale",AkshayExam));
		
		List<String> SahilExam = new ArrayList <>();
		SahilExam.add("CAT");
		SahilExam.add("NEET");
		list.add(new Student (20,"Sahil Bagade",SahilExam));
		
		
		List<String> PoonamExam = new ArrayList<>();
		PoonamExam.add("MH-CET");
		PoonamExam.add("CAT");
		list.add(new Student (30,"Poonam Jadhav",PoonamExam));
		
		//------------------------------------------------------------
		
		Map <String, List<String>> map = new HashMap <> ();
		
		Iterator <Student> itr = list.iterator();
		while (itr.hasNext()) {
			
			Student obj = itr.next();
			List<String> exams = obj.getExam();
			
			Iterator <String> innerItr = exams.iterator();
			while (innerItr.hasNext()) {
				
				String exam = innerItr.next();
				
				if (map.containsKey(exam)==false) {
					
					List<String> names = new ArrayList<>();
					names.add(obj.getStudentName());
					map.put(exam, names);
				}
				else {
					
					List<String> names = map.get(exam);
					names.add(obj.getStudentName());
					map.put(exam, names);
				}
			}
		}
		System.out.println(map);
	}
}
