package Nilam_Abstraction;
interface Menucard{
	
	 
	  void paneer();
	  void rotti();
	 void rice();
	 
	 
 }
public class Customer {
	
	void Order(Menucard card) {
		
		card.paneer();
		card.rotti();
		card.rice();
	}

}
