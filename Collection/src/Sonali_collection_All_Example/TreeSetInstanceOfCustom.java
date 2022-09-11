package Sonali_collection_All_Example;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetInstanceOfCustom {
	
	public static void main(String[] args) {
		TreeSet<Bank> t = new TreeSet<>(new  Mycity());
		t.add(new Bank("SBI" , "Shrigonda"));
		t.add(new Bank("Central" , "Pune"));
		t.add(new Bank("ICIC" , "Nagar"));
		t.add(new Bank("Maharastra" , "Mubmbai"));
		System.out.println(t);
		
	}
}
class Bank{
	private String Bname;
	private String Bcity;
	public Bank(String bname, String bcity) {
		super();
		Bname = bname;
		Bcity = bcity;
	}
	Bank(){
		
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public String getBcity() {
		return Bcity;
	}
	public void setBcity(String bcity) {
		Bcity = bcity;
	}
	@Override
	public String toString() {
		return " [" + Bname + ", " + Bcity + "]";
	}
	
}

class Mycity implements Comparator<Bank>{
	 @Override
	public int compare(Bank o1, Bank o2) {
	
		//return -o1.getBname().compareTo(o2.getBname());
		return -o1.getBcity().compareTo(o2.getBcity());
	}
}