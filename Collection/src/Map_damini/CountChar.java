package Map_damini;

import java.util.HashMap;

public class CountChar {

	public static void main(String[] args) {
		
		String s="hello damini how are you";
		
		char[] arr=s.toCharArray();
		HashMap<Character,Integer> map=new HashMap<>();
		
		for(char ch:arr)
		{
			if(map.containsKey(ch)==false)
			{
				map.put(ch,1);
			}
			else
			{
				Integer v=map.get(ch);
				v++;
				map.put(ch, v);
			}
				
		}
		System.out.println(map);
	}
}
