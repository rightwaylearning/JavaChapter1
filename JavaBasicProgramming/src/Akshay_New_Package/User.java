package Akshay_New_Package;

public class User {
	
	void doSum(int x, int y) {
		Cal c = new Cal();
		int sum = c.doAdd(x, y);
		System.out.println(sum);
	}

	void doDivision(int p, int q) {
		Cal c = new Cal ();
		double result = c.doDivision(p, q);
		System.out.println(result);
			
	}
}
