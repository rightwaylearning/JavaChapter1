package tree.set.examples;

import java.util.Comparator;
import java.util.TreeSet;

public class NoNComparableObjectInsideTreeSet {

	public static void main(String[] args) {

		Comparator obj = new MyOwnSortingTech();
		TreeSet<City> c = new TreeSet<>(obj);
		c.add(new City("Pune"));
		c.add(new City("Mumbai"));
		c.add(new City("Nasik"));
		c.add(new City("New Mumbai"));
		System.out.println(c);
	}
}

class City {
	private String cityName;

	City() {
	}

	City(String cityName) {
		this.cityName = cityName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "[" + cityName + "]";
	}

}

class MyOwnSortingTech implements Comparator<City> {

	@Override
	public int compare(City o1, City o2) {
		return  o1.getCityName().compareTo(o2.getCityName());
	}
}
