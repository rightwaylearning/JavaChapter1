package basic.info;

public class Controller {

	public static void main(String[] args) {
		System.out.println("good morning....");
		User u= new User();
	//	u.c = new Cal();
		int a = 10;
		int b =20;
		try {
		  u.c.sum(a, b);
		}catch(NullPointerException e) {
			u.c = new Cal();
			u.c.sum(a, b);
		}
		System.out.println("program is completed......");
	}
}
