package Kalpesh;

import java.util.LinkedList;
import java.util.ListIterator;

import pratik_collection_empArray.Employee;

public class Guards_Controller {
	
	public static void main(String[] args) {
		
		Guards [] G = new Guards[10];
		
		G[0] = new Guards("KJ" , 11 , 1223565654l ,50000.00);
		
		
		G[1] = new Guards("AP" , 12 , 657895654l ,450000.00);
		
		G[2] = new Guards("OT" , 13 , 1223565654l ,37000.00);
		
		
		G[3] = new Guards("AW" , 14 , 12235656556l ,34500.00);
		
		G[4] = new Guards("VK" , 15 , 8675908543L ,47000.00);
		
		G[5] = new Guards("RK" ,16 , 1223675954l ,32500.00);
		
		
		LinkedList<Guards> G1 = new LinkedList<Guards>();
		G1.add(G[0]);
		G1.add(G[1]);
		G1.add(G[2]);
		G1.add(G[3]);
		G1.add(G[4]);
		G1.add(G[5]);
		
		
		
		ListIterator<Guards> ll = G1.listIterator();
		while (ll.hasNext()) {
			Guards  Gs= ll.next();
			
			if (Gs.getGuardSallery() >=10000.00 && Gs.getGuardSallery()<40000.00);{
			Double NewSallery = Gs.getGuardSallery() + (Gs.getGuardSallery() * 5)/100;
			Gs.setGuardSallery(NewSallery);
			ll.set(Gs); 
		
			}
			else if (Gs.getGuardSallery() >=10000.00 && Gs.getGuardSallery()<40000.00);{
			Double NewSallery1 = Gs.getGuardSallery() + (Gs.getGuardSallery() * 10)/100;
			Gs.setGuardSallery(NewSallery1);
			ll.set(Gs);
//	
			
					
		System.out.println(ll);	
					
					
					
	}	
					
//					  Double NewSallery = p1.getProfesserId() +(p1.getProfesserSallery() * 5)/100;
//            p1.setProfesserSallery(NewSallery);
//            itr.set(p1);
		
		}
	
}

}