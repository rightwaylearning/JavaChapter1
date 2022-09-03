package sahil_setDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		List<String> unm = new ArrayList<>();

		unm.add("sahil");
		unm.add("parksh");
		unm.add("hemant");
		unm.add("akshya");
		unm.add("sahil");
		unm.add("akshya");
		unm.add("parksh");
         //option 1 
		List<String> remove = new ArrayList<>();

		for (String item : unm) {
			if (remove.contains(item) == false) {
				remove.add(item);
System.out.println(unm);
System.out.println(unm.size());
			}
		}
		// // option 2 to remove duplicate

		Set<String> set = new HashSet<>(unm);
		System.out.println(set);

		LinkedHashSet<String> a1 = new LinkedHashSet<>(unm);// 16
		System.out.println(a1.size());
		System.out.println(a1);
	}
}
