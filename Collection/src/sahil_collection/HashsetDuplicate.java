package sahil_collection;

import java.util.HashSet;

public class HashsetDuplicate {
private	String name;
private	Integer ID;

public HashsetDuplicate(String name, Integer iD) {
	super();
	this.name = name;
	ID = iD;
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

@Override
public String toString() {
	return "HashsetDuplicate [ + name + "  + ID + "]";
}

class Employee{
	public void main(String[] args) {
		HashSet<HashsetDuplicate> it = new HashSet<>();
		
		HashsetDuplicate e = new HashsetDuplicate("sahil", 15);
		it.add(e);
		HashsetDuplicate e1 = new HashsetDuplicate("akshye", 13);
		it.add(e1);
		HashsetDuplicate e2 = new HashsetDuplicate("nike", 15);
		it.add(e2);
		HashsetDuplicate e3 = new HashsetDuplicate("akshye", 12);
		it.add(e3);
		System.out.println(it.size('');
		System.out.println(it);
	}
}

}
