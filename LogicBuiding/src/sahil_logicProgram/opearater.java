package sahil_logicProgram;

public class opearater {

	public static void main(String[] args) {
		int a = 10 ;
		++a;
		//per incrment
		System.out.println(a);
		
		int b=10;
		b++;
	///	post increment
		
		System.out.println(b);
		int c = 20;
		--c;
		//per dicrement
		System.out.println( c);
		
		int d =20;
		d--;
		//post dicrement
		System.out.println(d);
		
		String s= "sahil";
		//s++;
		// 	Type mismatch cannot convert from String to int

		System.out.println(s);
		
		System.out.println("arithmethik opreter");
		
		 int a2 = 'A';
		 System.out.println(a2);
				System.out.println("=================="); 
		
		int a1 = 'A'+'A';
		System.out.println(a1);
		
		System.out.println("============");
		
		int c1 = 'A'*'A';
		System.out.println(c1);
		System.out.println("===============");
		
		int c2 =  'A'/'A';
		System.out.println(c2);
		
		System.out.println("=================");
		
				int c3 = 'A'%'A';
				System.out.println(c3);
	}
}
