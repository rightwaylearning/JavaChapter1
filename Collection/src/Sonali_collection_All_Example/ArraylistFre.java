package Sonali_collection_All_Example;

import java.util.ArrayList;
import java.util.HashMap;

public class ArraylistFre {
	public static void CountFrequencies(ArrayList<String> list) {
		HashMap<String, Integer> map = new HashMap<>();
		System.out.println(map);
		for (String str : list) {

			if (map.containsKey(str) == false) {
				map.put(str, 0);
			} else {
				Integer v = map.get(str);
				v++;
				map.put(str, v);
				System.out.println(list);
			}

		}
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("sonali");
		list.add("pooja");
		list.add("sonali");
		list.add("pooja");
		list.add("Priya");
		list.add("Rups");
		list.add("Rani");
		CountFrequencies(list);

	}
}