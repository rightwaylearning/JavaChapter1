package Kalpesh;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Professer_Controller {

	public static void main(String[] args) {

		List<Professer> p = new ArrayList<>();
		p.add(new Professer("VK", 11, 23000.00));

		p.add(new Professer("KJ", 12, 25000.00));

		p.add(new Professer("Ap", 13, 26000.00));

		p.add(new Professer("OT", 14, 47000.00));

		p.add(new Professer("AW", 15, 44000.00));

		//System.out.println(p);
		
		ListIterator<Professer> itr = p.listIterator(); 
		
	while (itr.hasNext()){
			Professer p1 = itr.next();
			
			
			if (p1.getProfesserSallery() >=10000.00 && p1.getProfesserSallery() <= 500000.00) {
                Double NewSallery = p1.getProfesserId() +(p1.getProfesserSallery() * 5)/100;
                p1.setProfesserSallery(NewSallery);
                itr.set(p1);
                System.out.println(p1);
			}
			
			else if (p1.getProfesserSallery() >=30000.00 && p1.getProfesserSallery() <= 40000.00) {
                Double NewSallery = p1.getProfesserId() +(p1.getProfesserSallery() * 5)/100;
                p1.setProfesserSallery(NewSallery);
                itr.set(p1);
                System.out.println(p1);
			}
			
			
			
			
			
	}
	}

}