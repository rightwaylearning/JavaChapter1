package Sonali_collection_All_Example;

import java.util.HashMap;
import java.util.Map;

class Banks {
	String Name;
	 Integer AcNumber;

	public Banks(String name, Integer acNumber) {
		super();
		this.Name = name;
		this.AcNumber = acNumber;
	}

	public Banks() {

	}

	@Override
	public String toString() {
		return "[" + Name + ", " + AcNumber + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Banks b = (Banks) obj;
		if (this.Name.equals(b.Name) && (this.AcNumber.equals(b.AcNumber))) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public int hashCode() {
		return this.Name.hashCode() + this.AcNumber.hashCode();
	}
}

public class HashingWithCustomClass {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		Banks bank = new Banks("SBI", 1);
		map.put("bank",100);
		Banks bank1 = new Banks("Central", 2);
		map.put("bank",200);
		Banks bank2 = new Banks("ICICI", 3);
		map.put("bank",300);
		Banks bank3 = new Banks("Canera", 4);
		map.put("bank",400);
		System.out.println(map);
	
}

}
