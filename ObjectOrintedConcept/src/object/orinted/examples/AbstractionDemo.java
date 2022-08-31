package object.orinted.examples;



class MenuCardImpl implements MenuCard{

	@Override
	public void paneerTikaMasala() {
		System.out.println(" ver nice curry");
	}

	@Override
	public void tandoorRotti() {
		System.out.println("nice Test");
	}
	
}


public class AbstractionDemo {

	public static void main(String[] args) {
		
		Customer c= new Customer();
		c.Order(new  MenuCardImpl());
		
	}
}
