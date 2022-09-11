package Object_Oriented_Examples_Jivan;

interface MenuCard{
	 void paneerTikkaMasala();
	 void tandoorRoti();
}

public class Customer {
	
	void Order(MenuCard card) {
		
		card.paneerTikkaMasala();
		card.tandoorRoti();
		
	}

}
