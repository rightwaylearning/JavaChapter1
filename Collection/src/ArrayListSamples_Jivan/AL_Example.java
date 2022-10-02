package ArrayListSamples_Jivan;

import java.util.ArrayList;

public class AL_Example {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		al.add(1, 15);
		System.out.println(al);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
		
					ArrayList color = new ArrayList();
					color.add("red");
					color.add("blue");
		
		al.addAll(color);
		System.out.println(al);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
		
					ArrayList days = new ArrayList();
					days.add("sunday");
					days.add("saturday");
					
		al.addAll(3, days);
		System.out.println(al);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
	
		System.out.println("contains('purple') = " + al.contains("purple"));
		System.out.println("al.containsAll(days) "+ al.containsAll(days));
		System.out.println("al.size()" + al.size());
		System.out.println("al.isEmpty() " + al.isEmpty());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
//		al.clear();
		System.out.println(al);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
//		al.ensureCapacity(10);
		System.out.println(al.get(3));
		System.out.println("al.get(3) = " + al.get(3));
		al.remove("red");
		al.remove(0);
		System.out.println(al);
		al.removeAll(days);
		System.out.println(al);
		
	}

}
