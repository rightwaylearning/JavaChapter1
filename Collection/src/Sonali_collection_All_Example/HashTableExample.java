package Sonali_collection_All_Example;

import java.util.Hashtable;

public class HashTableExample {
	
	public static void main(String[] args) {
		Hashtable h = new Hashtable<>();
		h.put(new Temp(5), "A");
		h.put(new Temp(2),"B"); 
		h.put(new Temp(6),"C"); 
		h.put(new Temp(15),"D"); 
		h.put(new Temp(23),"E"); 
		h.put(new Temp(16),"F"); 
		System.out.println(h);
	}

}
class Temp{
	int i;

	public Temp(int i) {
		super();
		this.i = i;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return i;
	}

	@Override
	public String toString() {
		return "Temp [i=" + i + "]";
	}

	
	
}