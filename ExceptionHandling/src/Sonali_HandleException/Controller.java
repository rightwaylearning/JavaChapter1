package Sonali_HandleException;

public class Controller {
	public static void main(String[] args) {
		System.out.println("Good Morning");
		User u = new User();
		
	//	u.c = new Cal();
		
		int a;
		int b;
		
			try {
		u.c.Sum(10, 20);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(">>>>>>End>>>>>");
	}

}
