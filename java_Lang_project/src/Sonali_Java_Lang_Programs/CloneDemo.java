package Sonali_Java_Lang_Programs;

public class CloneDemo implements Cloneable {
	int a;
	int b;

	CloneDemo(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneDemo c = new CloneDemo(10, 20);
		CloneDemo c1 = (CloneDemo) c.clone();
		CloneDemo c2 = new CloneDemo(100, 200);
		System.out.println(c2.a);
		System.out.println(c2.b);
		System.out.println(c1.a);
		System.out.println(c1.b);
	}

}
