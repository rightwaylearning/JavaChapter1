package Map_damini;

import java.util.HashMap;

public class LinkedHashMap {
public static void main(String[] args) {
	HashMap<Integer,StringBuffer> hs=new HashMap<>();
	hs.put(1,new StringBuffer("damini"));
	hs.put(2,new StringBuffer("Amar"));
	hs.put(3,new StringBuffer("Durva"));
	hs.put(4,new StringBuffer("Dolly"));
	hs.put(3,new StringBuffer("Devsya"));
	hs.put(1,new StringBuffer("chanda"));
	
	System.out.println(hs);
}
}
