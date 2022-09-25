package Nilam_Utility_Functionality;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemoThredsafe {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		List slist = Collections.synchronizedList(list);

		Set<Integer> s = new HashSet<>();
		Set sset = Collections.synchronizedSet(s);

		ArrayList<String> al = new ArrayList<>();
		al.add("AB");
		al.add("BB");
		al.add("CC");
		al.add("DD");
		al.add("HH");
		al.add("GG");
		System.out.println(al);

		Collections.sort(al);

		int[] arr = { 10, 34, 20, 44, 30, 50, 40 };
		for (int i : arr) {
			Arrays.sort(arr);

			System.out.println(i);
		}
	}

}
