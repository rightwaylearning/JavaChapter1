package damini_set6092022;

import java.util.HashMap;

public class MapExample {
	
public static void main(String[] args)
{
	HashMap<Integer,String> map=new HashMap<>();
	
	String returnValue=map.put(1, "Damini");
	System.out.println(returnValue);
	returnValue=map.put(1, "Amar");
	System.out.println(returnValue);
	returnValue=map.put(2, "Durva");
	System.out.println(returnValue);
	returnValue=map.put(2, "Purav");
	System.out.println(returnValue);
	
	
}
}
