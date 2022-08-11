package short_circuit_operator;

public class Controller {

	public static void main(String[] args) {

		OPT o = new OPT();

		boolean r = o.m1() && o.m2();

		System.out.println(r);

		int a = 10;

		int b = 20;

		boolean r1 = (++a > 11) && (++b > 20);
		System.out.println(r1); // false
		System.out.println(a); // 11
		System.out.println(b); // 20
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		
		boolean r2 = (++a > 11) && (++b > 20);
		System.out.println(r2);  // true
		System.out.println(a); // 12
		System.out.println(b); // 21
		
		boolean r3 = (a++ > 11) && (++b > 20);
		System.out.println(r3);  // true
		System.out.println(a); // 13
		System.out.println(b);// 22
		
		int x = 11;
		int y = 11;
		
		boolean r4 = (x++ > 11) && (++y > 11);
		System.out.println(r4); // false
		System.out.println(x); //
		System.out.println(y); //
		
		System.out.println(">>>>>>>>>>>>>>");
		
		
		
		x =10; y =9;
		r = x++ < 10 || y++ >9;
		System.out.println(r); // false
		System.out.println(x); // 11
		System.out.println(y); //10
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
