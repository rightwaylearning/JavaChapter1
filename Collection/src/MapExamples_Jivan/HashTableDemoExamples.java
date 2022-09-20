package MapExamples_Jivan;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemoExamples {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<>();
		HashMap<Integer, String> ht1 = new HashMap<>();
		ht.put(1, "AA");
		ht.put(2, "BB");
		ht.put(3, "CC"); 
		ht.put(4, "DD");
		ht.put(5, "EE");
		ht1.put(12, "null");
		System.out.println(ht);
		System.out.println(ht1);
	}
}
