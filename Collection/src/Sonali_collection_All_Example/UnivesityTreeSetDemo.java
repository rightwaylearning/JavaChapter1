package Sonali_collection_All_Example;

public class UnivesityTreeSetDemo implements Comparable {
	String UniName;
	String uniCity;
	
	 UnivesityTreeSetDemo(){
	 }
	public UnivesityTreeSetDemo(String uniName, String uniCity) {
		super();
		UniName = uniName;
		this.uniCity = uniCity;
		
	}
	public String getUniName() {
		return UniName;
	}
	public void setUniName(String uniName) {
		UniName = uniName;
	}
	public String getUniCity() {
		return uniCity;
	}
	public void setUniCity(String uniCity) {
		this.uniCity = uniCity;
	}
	@Override
	public String toString() {
		return "[" + UniName + ", " + uniCity + "]";
	}
	@Override
	public boolean equals(Object obj) {
		UnivesityTreeSetDemo U = (UnivesityTreeSetDemo)obj;
		if(this.UniName.equals(U.UniName)&& (this.uniCity.equals(U.UniName))) {
			return true;
		}
		return false;
		
	}
	@Override
	public int hashCode() {
		
		return this.UniName.hashCode() + this.uniCity.hashCode();
	}
  @Override
public int compareTo(Object o) {
	  UnivesityTreeSetDemo U = (UnivesityTreeSetDemo)o;
	 return -this.UniName.compareTo(U.UniName);
	 
	
}
	}


