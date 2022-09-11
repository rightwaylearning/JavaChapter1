package Sonali_collection_All_Example;

import java.util.Comparator;
import java.util.TreeSet;

public class NonComparableInsideTreeSet  {
	
	public static void main(String[] args) {
		
		TreeSet<City> c =new  TreeSet<>(new  OwnWay());
		c.add(new City("pune"));
		c.add(new City("Mumbai"));
		c.add(new City("Nagar"));
		c.add(new City("Delhi"));
		System.out.println(c);
		
		
	}


}
class City{
	 private String CityName;
	 
	 City(){}

	public City(String cityName) {
		super();
		CityName = cityName;
	}

	public String getCityName() {
		return CityName;
	}

	public void setCityName(String cityName) {
		CityName = cityName;
	}

	@Override
	public String toString() {
		return " [" + CityName + "]";
	}
	 
}
class OwnWay implements Comparator<City>{
	@Override
	public int compare(City o1, City o2) {
		return -o1.getCityName().compareTo(o2.getCityName());
	}
	
}
   