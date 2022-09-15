package Sonali_collection_All_Example;

import java.util.ArrayList;
import java.util.HashMap;
public class HashMapStudentData {
	
	public static void main(String[] args) {

		ArrayList <StudentData> sd =new ArrayList<StudentData>();
		sd.add(new StudentData("Sonal",10));
		sd.add(new StudentData("priya",20));
		sd.add(new StudentData("priti",20));
		
		sd.add(new StudentData("pinki",30));
		sd.add(new StudentData("Sonal",40));
		sd.add(new StudentData("pinkii",50));
		
		 HashMap<String, Integer> map = new HashMap<>();
		 for (StudentData s : sd) {
			 if(map.containsKey(s.Name)) {
				 Integer v = map.get(s.Name);
				 v++;
				 map.put(s.Name, v);
			 }else {
				 map.put(s.Name, 1);
			 }
			
		}

	

	}

}


