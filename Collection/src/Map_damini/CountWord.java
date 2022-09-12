package Map_damini;

import java.util.HashMap;

public class CountWord {

	public static void main(String[] args) {
		String str="heloo damini how are you are you fine";
		String arr[]=str.split(" ");
		HashMap<String,Integer> map=new HashMap<>();
		
		for (String W : arr) {
			if(map.containsKey(W)==false)
			{
				map.put(W, 1);
				
			}
			else
			{
				Integer i=map.get(W);
				i++;
				map.put(W,i);
				
			}
				
			
		}
		System.out.println(map);
	}
}
