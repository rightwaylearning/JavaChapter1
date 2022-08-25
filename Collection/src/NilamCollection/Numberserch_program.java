package NilamCollection;

import java.util.ArrayList;

public class Numberserch_program {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(0);
		boolean flag = al.contains(50);
		System.out.println(flag);

	}

}
