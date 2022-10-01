package test.sample;

public class CloneDemo implements Cloneable{
	int a;
	int b;

	CloneDemo(int a, int b) {
		this.a = a;
		this.b = b;
	}
  
	public static void main(String[] args) throws CloneNotSupportedException {

		CloneDemo c = new CloneDemo(10,20);
		
		CloneDemo c1 = (CloneDemo)c.clone();
		
		c.a =100;
		c.b = 200;
		
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
	}

}
