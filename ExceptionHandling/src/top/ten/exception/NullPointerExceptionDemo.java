package top.ten.exception;

import java.util.ArrayList;
import java.util.List;

public class NullPointerExceptionDemo {

	void doFilter(List<Integer> l) {
		
		if(l != null) {
			
		}

	}

	public static void main(String[] args) {

		ArrayList<Integer> list = null;

		if (list != null) {
			list.add(10);
			list.add(30);
			list.add(20);
			list.add(80);

			System.out.println(list);
		}
		System.out.println("done..");

		NullPointerExceptionDemo obj = new NullPointerExceptionDemo();
		if (obj != null) {
			obj.doFilter(list);
		}
	}

}
