package Damini_Hashset;

import java.util.HashMap;

public class HashingWrok {
public static void main(String[] args) {
	HashMap<String,Integer> map=new HashMap<>();
	
	map.put("da",21);
	System.out.println("da".hashCode()%16);
	map.put("mn",25);
	System.out.println("mn".hashCode()%16);
	map.put( "pq",29);
	System.out.println("pq".hashCode()%16);
	map.put( "wv",25);
	System.out.println("wv".hashCode()%16);
	map.put( "er",23);
	System.out.println("er".hashCode()%16);
	map.put( "ty",29);
	System.out.println("ty".hashCode()%16);
	System.out.println(map);
	System.out.println(map.get("wv"));
}
}
