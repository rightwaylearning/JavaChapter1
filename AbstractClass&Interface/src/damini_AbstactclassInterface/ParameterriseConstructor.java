package damini_AbstactclassInterface;


class D
{
	int a;
	int b;
	
	D()
	{
		System.out.println("i m parent object");
	}
	D(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	}
class E extends D
{
	int x;
	int y;
	
	E(int x,int y,int a,int b)
	{
		super(x,y);
		this.a=a;
		this.b=b;
	}
	E()
	{
		super(4,5);
		System.out.println("i m child");
		System.out.println(x);
		System.out.println(y);
	}
	}
	
	
public class ParameterriseConstructor {
	
	
	
	public static void main(String[] args) {
		E e=new E(20,50,67,90);
		System.out.println(e);
	}

	 
}
