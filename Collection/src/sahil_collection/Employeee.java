package sahil_collection;

import java.util.Comparator;

public class Employeee {
private String name;
private Integer ID;

public Employeee() {
	
}
public Employeee(String name, Integer iD) {
	super();
	this.name = name;
	ID = iD;
}

@Override
public String toString() {
	return "Employeee [name=" + name + ", ID=" + ID + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getID() {
	return ID;
}

public void setID(Integer iD) {
	ID = iD;
}
class ControllerEmo implements Comparator<Employeee>{

	@Override
	public int compare(Employeee o1, Employeee o2) {
		
		return o1.getID().compareTo(o2.getID());
	}

}
 }


