package ArrayListSamples_Jivan;

import java.util.ArrayList;
import java.util.Iterator;

public class AL_View {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		

					ArrayList color = new ArrayList();
					color.add("red");
					color.add("blue");
		
		al.addAll(color);
		
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(">>>>>>>>>>>>>>>>>>>>");

		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		// while
		int i = 0;
		while(i < al.size()) {
			System.out.println(al.get(i));
			i++;
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		
		for(Object o:al) {
			System.out.println(o);
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
