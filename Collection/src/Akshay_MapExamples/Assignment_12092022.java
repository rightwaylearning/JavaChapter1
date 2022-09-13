package Akshay_MapExamples;

import java.util.HashMap;

public class Assignment_12092022 {

	public static void main(String[] args) {

		Long value = 112233441123455L;
		Long b;

		HashMap<Long, Integer> a = new HashMap<>();

		while (value > 0) {

			b = value % 10;
			value = value / 10;

			if (a.containsKey(b) == false) {
				a.put(b, 1);

			} else {
				
				Integer v = a.get(b);
				v++;
				a.put(b, v);
			}
		}
		
		System.out.println(a);
	}
}
