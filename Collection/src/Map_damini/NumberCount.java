package Map_damini;

import java.util.HashMap;

public class NumberCount {
public static void main(String[] args) {
	int arr[]= {1,2,1,3,5,4,3,4,7,8,1};
	
	HashMap<Integer,Integer> hm=new HashMap<>();
	System.out.println(hm);
	for(int i:arr)
	{
		if(hm.containsKey(i)==false)
		{
			hm.put(i,1);
		}
		else
		{
			Integer r=hm.get(i);
			r++;
			hm.put(i, r);
		}
		
	}
	System.out.println(hm);
}
}
