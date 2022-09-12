package Map_damini;

import java.util.HashMap;

public class MapDemoexample {
public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<>();
	
	        // K & V both should object 
			// key never duplicate,
			// value , any thing u can insert
	   String a=map.put(1, "DAMINI");
	   String b=map.put(2, "Durva");
	   String c=map.put(3, "Amar");
	   String s=map.put(4, "Payal");
	   System.out.println(map);
	   System.out.println(map.containsKey(3));
	   System.out.println(map.get(2));
	   System.out.println(map.size());
	   
			
}
}
