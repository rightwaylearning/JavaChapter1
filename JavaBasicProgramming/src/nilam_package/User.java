package nilam_package;

public class User {

	void dosum (int a,int b) {
		Calculater c =new Calculater();
		int sum = c.dosum(a, b);
		System.out.println(sum);
	}
		
	 void domul (float x ,float y) {
		 Calculater c = new Calculater();
		 float f = c.domul(x, y);
		 System.out.println(f);
		 
	 }
		 

}
