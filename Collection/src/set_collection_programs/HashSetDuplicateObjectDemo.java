package set_collection_programs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class Student{
	int a ;
	int b;
	public Student(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
		
	@Override
	public String toString() {
		return "Student [a=" + a + ", b=" + b + "]";
	}
}

public class HashSetDuplicateObjectDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		System.out.println(hs.add(10));
		
		System.out.println(hs.add(20));
		
		System.out.println(hs.add(30));
		
		System.out.println(hs.add(10));
		
		System.out.println(hs.size()); // 3
		// =======================================
		Set<String> hashSet= new HashSet<>();
		
		hashSet.add("abc");
		
		hashSet.add("abc");
		
	 		
		System.out.println(hashSet);  // 1
	//	===========================================
				
		LinkedHashSet<Integer>  lh= new LinkedHashSet<>();
		
		lh.add(10);lh.add(20);lh.add(20);lh.add(30);lh.add(10);
		lh.add(40);
		
		System.out.println(lh);
		
		//================================
		
		int[] arr = {10,20,30,45,89,45,10,10,30};
		// 10,20,30,45,89
		// 45,10,30
		// remove duplicate & tell me which are duplicate number
		
		LinkedHashSet<Integer> uniqueItem = new LinkedHashSet<>();
		LinkedHashSet<Integer> duplicateItem = new LinkedHashSet<>();
		
		for (int i : arr) {
			boolean flag = uniqueItem.add(i);
			
			if(flag == false) {
				duplicateItem.add(i);
			}
		}
		System.out.println(uniqueItem);
		System.out.println(duplicateItem);
	}
}
