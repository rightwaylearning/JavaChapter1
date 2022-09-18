package IntroOfCollection_Jivan;

import java.util.ArrayList;

public class Array_VS_Collection {

	public static void main(String[] args) {

		Student[] arr = new Student[4];
		arr[0] = new Student();
		arr[1] = new Student();
		arr[2] = new Student();
		arr[3] = new Student();
		//////////////////////////

		ArrayList al = new ArrayList();
		int[] arr1 = new int[5];
		// Student s = new Student();
		// al.add(s);
		al.add(new City());
		al.add(new Student());
		al.add(new Employee());
		al.add(new Student());
		al.add(new Student());
		System.out.println(al.size());
		
	}
}
