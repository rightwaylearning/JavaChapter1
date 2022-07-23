package communication_of_classes;

public class User {
	
	void doSum(int x, int y) {
		Cal c = new Cal();
		int sum = c.doAdd(x, y);
		System.out.println(sum);
	}
	
	void doDivision(double d, double n) {
		 Cal c = new Cal();
		 double result = c.doDivision(d, n);
		 System.out.println(result);
		
	}
}
