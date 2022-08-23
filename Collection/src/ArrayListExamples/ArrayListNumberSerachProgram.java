package ArrayListExamples;

import java.util.ArrayList;

public class ArrayListNumberSerachProgram {

	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(10); al.add(20);al.add(30);al.add(40);
		al.add(50);al.add(60);
		
		boolean flag = al.contains(500);
		System.out.println(flag);
	}
}
