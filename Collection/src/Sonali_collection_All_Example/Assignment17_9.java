package Sonali_collection_All_Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Assignment17_9 {

	public static void main(String[] args) {
		List<Students> list = new ArrayList<>();

		List<String> sonalexams = new ArrayList<>();
		
		sonalexams.add("NEET");
		sonalexams.add("JEE");
		sonalexams.add("MH-CET");
		sonalexams.add("CAT");

		list.add(new Students(1, "sonal", sonalexams));

		List<String> raniexams = new ArrayList<>();
		raniexams.add("NEET");
		raniexams.add("JEE");

		list.add(new Students(1, "Rani", raniexams));

		List<String> Pinkiiexams = new ArrayList<>();
		Pinkiiexams.add("NEET");
		Pinkiiexams.add("MH-CET");
		Pinkiiexams.add("CAT");

		list.add(new Students(1, "Pinkii", Pinkiiexams));
     System.out.println(list);
     
     Map<String, List<String>> map = new HashMap<>();
     Iterator<Students> itr = list.iterator();
     while(itr.hasNext()) {
    	 Students obj = itr.next();
    	 List<String> exams = obj.getExams();
    	 
    	 Iterator<String> inneritr = exams.iterator();
    	while(inneritr.hasNext()) {
    		String exam = inneritr.next();
    		if(map.containsKey(exam)) {
    			
    		}else {
    			
    			List<String> names = new ArrayList<>();
    		names.add(obj.getName());
    			map.put(exam, names);
    		}
    	}
     }
	}
}


