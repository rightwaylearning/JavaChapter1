package Padmashree_Collection;
import java.util.ArrayList;


public class Arraylist_Demo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		al.add("Madhuri");
		System.out.println(al);
		System.out.println("Second number: "+al.get(2));
		System.out.println("Size of arraylist:"+ al.size());
		System.out.println("Arraylist is Empty: "+al.isEmpty());
		al.remove(3);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		System.out.println("Size of arraylist:"+ al.size());
		System.out.println("Arraylist is Empty: "+al.isEmpty());
	}
}
