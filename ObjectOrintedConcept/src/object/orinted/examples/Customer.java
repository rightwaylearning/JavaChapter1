package object.orinted.examples;

interface MenuCard{
	 void paneerTikaMasala();
	 void tandoorRotti();
}

public class Customer {

	void Order(MenuCard card) {
		
		card.paneerTikaMasala();
		card.tandoorRotti();
	}
}
