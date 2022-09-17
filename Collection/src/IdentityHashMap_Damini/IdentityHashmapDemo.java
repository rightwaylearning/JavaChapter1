package IdentityHashMap_Damini;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashmapDemo {
public static void main(String[] args) {
	HashMap<Integer, String> hs=new HashMap<>();
	
	Integer i=new Integer(20);
	Integer j=new Integer(20);
	hs.put(i, "First");
	hs.put(j, "First");
	System.out.println(hs);
	System.out.println("---------------------");
	
	IdentityHashMap<Integer,String> hs1=new IdentityHashMap<>();
	
	hs1.put(i, "first");
	hs1.put(j, "first");
	System.out.println(hs1);
}
}
