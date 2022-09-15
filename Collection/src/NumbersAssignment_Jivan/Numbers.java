package NumbersAssignment_Jivan;

import java.util.HashMap;

public class Numbers {
	
	public static void main(String[] args) {
		
		long a[]= {1l,1l,2l,3l,3l,4l,4l,1l,1l,2l,3l,4l,5l,5l};
		
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
