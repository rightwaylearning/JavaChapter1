package Sonali_collection_All_Example;

import java.util.Comparator;
import java.util.TreeSet;

public class CollegeOutput {
	
	public static void main(String[] args) {
		TreeSet<College> tr = new TreeSet<>(new MyCollege());
		
		tr.add(new College("Chhatrpati" , "Shrigonda"));
		tr.add(new College("New Arts" , "Nagar"));
		tr.add(new College("Dy patil" , "pune"));
		tr.add(new College("Dada Patil" ,  "Karjat"));
		System.out.println(tr);
	}

}
class College{
	private String ClgName;
	private String ClgCity;
	
	College(){
		
	}

	public College(String clgName, String clgCity) {
		
		this.ClgName = clgName;
		this.ClgCity = clgCity;
	}

	public String getClgName() {
		return ClgName;
	}

	public void setClgName(String clgName) {
		ClgName = clgName;
	}

	public String getClgCity() {
		return ClgCity;
	}

	public void setClgCity(String clgCity) {
		ClgCity = clgCity;
	}

	@Override
	public String toString() {
		return " [" + ClgName + ", " + ClgCity + "]";
	}
}
	
	
		class MyCollege implements Comparator<College>{
			@Override
			public int compare(College o1, College o2) {
				return o1.getClgName().compareTo(o2.getClgName());
		}
	}

