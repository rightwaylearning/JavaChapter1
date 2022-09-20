package assignment.example.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ListOfStudentName {
    // MH-CET, JEE, NEET, CAT
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
					List<String> sahilExams = new ArrayList<>();
					sahilExams.add("JEE"); sahilExams.add("NEET");
		list.add(new Student(10, "Sahil", sahilExams));
					List<String> animeshExams = new ArrayList<>();
					animeshExams.add("JEE"); animeshExams.add("NEET");animeshExams.add("MH-CET");
        list.add(new Student(11, "Animesh", animeshExams));
			        List<String> joeExams = new ArrayList<>();
			        joeExams.add("JEE"); joeExams.add("NEET");joeExams.add("MH-CET");
			        joeExams.add("CAT");
        list.add(new Student(12, "JOE", joeExams));
        //---------------------------------------------------------
        Map<String, List<String>> map = new HashMap<>();
        
        Iterator<Student> itr = list.iterator();
        while(itr.hasNext()) {
        	
        	Student obj = itr.next();
        	List<String> exams = obj.getExams();
        	
        	Iterator<String> innerItr = exams.iterator();
        	
        	while(innerItr.hasNext()) {
        		
                String exam = innerItr.next();
        
                   if(map.containsKey(exam) == false) {
	        			List<String> names = new ArrayList<>();
	        			names.add(obj.getStudentName());
	        			map.put(exam, names);
                   }else {
                	   List<String> names =  map.get(exam);
                	   names.add(obj.getStudentName());
                	   map.put(exam, names);
                   }
        		
        	}
        }
		System.out.println(map);
	}
}
