package MapExamples_Jivan;

import java.util.HashMap;

public class MapDemo {
	
	public static void main(String[] args) {
				
		HashMap<Integer, String> map = new HashMap<>();
		
		// K & V both should object 
		// key never duplicate
		// value, any thing you can insert
		
		String d = map.put(1, "Sagar");  // null
		
		String r = map.put(1,  "Swapnil");  // not null Sagar
		
		String r1 = map.put(1,  "Mahesh");  // null Mahesh
		
		//map.put(1, "Sagar");
		//map.put(2, "Sachin");
		//map.put(3, "Rohan");
		//map.put(4, "Jivan");
		
		//HashSet<Integer> set = new HashSet<>();
	//	set.add(1);
				
		//set.add(1);
		
		//set.add(1);
		
		System.out.println(map.size());
		
		
	}

}
