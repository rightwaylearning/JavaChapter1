package Damini_ReferenceVariable;

class E
{
	int s=20;
	int r=30;
	
	}
class F extends E
{
	int s=40;
	int r=60;
	
	void print()
	{
		System.out.println(s);
		System.out.println(r);
		System.out.println(this.s);
		System.out.println(this.r);
		System.out.println(super.s);
		System.out.println(super.r);
	}
	
	}

public class class_property {
	
public static void main(String[] args) {
	//case 1
	E e=new E();
	//System.out.println(e.s); 10
	//System.out.println(e.r); 20
	F f=new F();
	//System.out.println(f.s); 40
	//System.out.println(f.r); 60
	f.print();
			
}
}
