package Sonali_collection_All_Example;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
	public static void main(String[] args) {
		TreeSet<Car> tree = new TreeSet<>(new MyCar());
		tree.add(new Car("BMW" , 2345));
		tree.add(new Car("Shift" , 2875));
		tree.add(new Car("Scorpio" , 7365));
		tree.add(new Car("Maruti" , 6745));
		System.out.println(tree);
	}

}
class Car{
	private String CarName;
	private Integer CarNo;
	
	Car(){
		
	}

	public Car(String carName, Integer carNo) {
		super();
		CarName = carName;
		CarNo = carNo;
	}

	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}

	public Integer getCarNo() {
		return CarNo;
	}

	public void setCarNo(Integer carNo) {
		CarNo = carNo;
	}

	@Override
	public String toString() {
		return " [" + CarName + ", " + CarNo + "]";
	}
	
}

class MyCar implements Comparator<Car>{
	 @Override
	public int compare(Car o1, Car o2) {
		//return o1.getCarNo().compareTo(o2.getCarNo());
		return o1.getCarName().compareTo(o2.getCarName());
	}
}