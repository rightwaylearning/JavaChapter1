package NilamCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDuplicateObjectDemo {
	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		hs.add(35);
		hs.add(30);
		hs.add(40);

		System.out.println(hs);
		HashSet<Integer> hset = new HashSet<>();

		System.out.println(hset.add(10));
		System.out.println(hset.add(20));
		System.out.println(hset.add(30));
		System.out.println(hset.add(10));
		System.out.println(hset.add(35));
		System.out.println(hset.add(10));
		System.out.println(hset.add(10));

		System.out.println("============================================");
		HashSet<String> str = new HashSet<>();
		str.add("abc");
		str.add("abc");
		str.add("pqr");
		str.add("ttr");
		str.add("hhh");

		System.out.println(str);
		System.out.println(str.size());

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		LinkedHashSet<Integer> lh = new LinkedHashSet<>();
		lh.add(11);
		lh.add(22);
		lh.add(33);
		lh.add(44);
		lh.add(11);
		lh.add(55);
		lh.add(66);
		lh.add(33);
		System.out.println(lh);
		System.out.println(lh.size());

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		int[] arr = { 10, 20, 30, 10, 40, 30, 50, 60, 40 };

		LinkedHashSet<Integer> Uniqitem = new LinkedHashSet<>();
		LinkedHashSet<Integer> Duplicateitem = new LinkedHashSet<>();

		for (Integer i : arr) {
			boolean flag = Uniqitem.add(i);

			if (flag == false) {
				Duplicateitem.add(i);

			}
		}
		System.out.println(Uniqitem);
		System.out.println(Duplicateitem);

	}
}
