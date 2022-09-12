package Map_damini;

import java.util.HashMap;

public class NumberAs {
 public static void main(String[] args) {
	
	long a[]= {11233441123455l};
	HashMap<Long,Long> map=new HashMap<>();
	System.out.println(map);
	for (long l:a) {
		if(map.containsKey(l)==false)
		{
			map.put(l, 1l);
		}
		else
		{
			Long d=map.get(l);
			d++;
			map.put(l, d);
		}
	}
	System.out.println(map);
}
}
