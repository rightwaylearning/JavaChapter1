package Object_Oriented_Examples_Jivan;

class MenuCardImpl implements MenuCard{

	@Override
	public void paneerTikkaMasala() {
		System.out.println("very nice curry");
		
	}

	@Override
	public void tandoorRoti() {
		System.out.println("nice test");
		
	}
	
}

public class AbstractionDemo {
	
	public static void main(String[] args) {
		MenuCardImpl obj = new MenuCardImpl();
		
		Customer c = new Customer();
		c.Order(obj);;
		
	}

}
