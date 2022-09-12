package sahil_collection;


import java.util.TreeSet;

public class ControllerEmo {
	public static void main(String[] args)  {
		TreeSet<Employeee> m = new TreeSet<>(new ControllerEmo ());

		m.add(new Employeee ("sahil",21));
		m.add(new Employeee ("nike",25));
		m.add(new Employeee ("akshye",21));

		m.add(new Employeee ("poonam",27));
		System.out.println(m);

	}
	
	

}
