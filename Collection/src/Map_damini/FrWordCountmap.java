package Map_damini;

import java.util.HashMap;

public class FrWordCountmap {
public static void main(String[] args) {
	String str="Arjun  Bhim Shadev NakulYudhishir";
	String ar[]=str.split("");
	
	HashMap<String,Integer> map=new HashMap<>();
	
	for (String W : ar) {
		if(map.containsKey(W)==false)
		{
			map.put(W, 1);
		}
		else
		{
			Integer i=map.get(W);
			i++;
			map.put(W, i);
		}
		
	}
	System.out.println(map);
}
}
