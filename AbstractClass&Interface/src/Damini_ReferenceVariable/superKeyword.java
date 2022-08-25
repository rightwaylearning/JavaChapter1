package Damini_ReferenceVariable;



	class X
	{
		int a=20;
		int b=30;
		
	}
	class Y extends X
	{
		int c=10;
		int d=50;
	}
	
	public class superKeyword {
		public static void main(String[] args) {
			
			//case 1
			X x=new X();
			System.out.println(x.a);
			System.out.println(x.b);
			//System.out.println(x.c); C.E
			//System.out.println(x.d); C.E
			
			//case 2
			Y y=new Y();
			System.out.println(y.a);
			System.out.println(y.b);
			System.out.println(y.c);
			System.out.println(y.d);
			
			//case 3
			X x1=new Y();
			System.out.println(x1.a);
			System.out.println(x1.b);
			//System.out.println(x1.c); C.E
			//System.out.println(x1.d); C.E
			
			//case 4
			//Y y1=new X(); invalid case
		}
}
