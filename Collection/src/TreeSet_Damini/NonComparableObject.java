package TreeSet_Damini;

import java.util.Comparator;
import java.util.TreeSet;

public class NonComparableObject {
public static void main(String[] args) {
	
	Comparator obj=new Myownsortech();
	
	TreeSet<city> T=new TreeSet<>(obj);
    T.add(new city("Ahmedabad"));
    T.add(new city("Baroda"));
    T.add(new city("Surat"));
    T.add(new city("Mehsana"));
    T.add(new city("Rajkot"));
    System.out.println(T);
}
}
class city
{
	private String cityName;
	
	
city()
{
	}
city(String cityName)
{
	this.cityName=cityName;
	}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
@Override
public String toString() {
	return " [" + cityName + "]";
}

}
class Myownsortech implements Comparator<city>
{

	@Override
	public int compare(city o1, city o2) {
	
		return o1.getCityName().compareTo(o2.getCityName());
	}
	
	}
