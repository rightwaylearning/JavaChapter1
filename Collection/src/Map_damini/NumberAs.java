package Map_damini;

import java.util.HashMap;

public class NumberAs {
 public static void main(String[] args) {
	
	long a= 11233441123455l;
	long l;
	HashMap<Long,Integer> map=new HashMap<>();
	//System.out.println(map);
	while(a>0) {
		l=a%10;
		l=l/10;
		if(map.containsKey(l)==false)
		{
			map.put(l, 1);
		}
		else
		{
			Integer d=map.get(l);
			d++;
			map.put(l, d);
		}
	}
	System.out.println(map);
}
}
