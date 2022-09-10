package Array_List_Examples_Jivan;

import java.util.ArrayList;

public class ArrayList_Number_Search_Program {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10); al.add(20); al.add(30); al.add(40);
		al.add(50); al.add(60);
		
		boolean flag = al.contains(500);
		System.out.println(flag);
		
		// int i = 10;
		// Integer ii = new Integer(i);
		
		// byte b= 10;
		// Byte b1 = new Byte(b);
	}

}
