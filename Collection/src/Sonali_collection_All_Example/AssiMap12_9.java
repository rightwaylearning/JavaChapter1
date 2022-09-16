package Sonali_collection_All_Example;

import java.util.HashMap;

public class AssiMap12_9 {

	public static void main(String[] args) {
		long[] a= {11233441123455l};
		HashMap<Long,Long> map=new HashMap<>();
		System.out.println(map);
		for (long l:a) {
			if(map.containsKey(l)==false)
			{
				map.put(l, 1l);
			}
			else
			{
				Long v=map.get(l);
				v++;
				map.put(l, v);
			}
		}
		System.out.println(map);
	}
	}
	
