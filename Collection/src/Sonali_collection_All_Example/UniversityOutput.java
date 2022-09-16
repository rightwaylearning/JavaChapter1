package Sonali_collection_All_Example;

import java.util.TreeSet;

public class UniversityOutput {
	public static void main(String[] args) {
		TreeSet< UnivesityTreeSetDemo > t = new TreeSet<>();
		t.add(new UnivesityTreeSetDemo("SPPU" , "Pune"));
		t.add(new UnivesityTreeSetDemo("IIT" , "Mumbai"));
		t.add(new UnivesityTreeSetDemo("Javharlal Neharu" , "New Delhi"));
		t.add(new UnivesityTreeSetDemo("SRM Institute" , "Chennai"));
		System.out.println(t);
	}

}
