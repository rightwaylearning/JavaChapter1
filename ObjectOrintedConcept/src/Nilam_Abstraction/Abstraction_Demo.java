package Nilam_Abstraction;

class MenucardImpl implements Menucard {

	public void paneer() {
		System.out.println("very good ");

	}

	public void rotti() {
		System.out.println("nice");

	}

	public void rice() {
		System.out.println("very nice");
	}
}

public class Abstraction_Demo {
	public static void main(String[] args) {
		
		Customer c = new Customer();
            c.Order(new MenucardImpl());
		
	}

}
