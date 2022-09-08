package damini_set6092022;

import java.util.HashMap;
import java.util.Map;

public class ArrayFrequncy {

	public static void main(String[] args) {
		Integer ar[] = {10,20,40,50,10,30,40,20};
		
		Map<Integer,Integer> m=new HashMap<>();
		
		for (Integer num: ar)
		{
			if(m.containsKey(num))
			{
				Integer v=m.get(num);
				v=v+1;
				m.put(num, v);
				
			}
			else
			{
				m.put(num, 1);
			}
		}
		System.out.println(m);
		
	}
}
