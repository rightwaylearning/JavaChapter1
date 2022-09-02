package sahil_setDemo;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateFrom {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);
		list.add(103);
		list.add(102);
		list.add(101);
		System.out.println(list.size());
		System.out.println(list);

		LinkedHashSet<Integer> num = new LinkedHashSet<>(list);// 16
		System.out.println(num.size());
		System.out.println(num);
		
		
		// duplicate not allow
		// what happen if we insert duplicate object inside set
		// insertion order not following	

}
}
