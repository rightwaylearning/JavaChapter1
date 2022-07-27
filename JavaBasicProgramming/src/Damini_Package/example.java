package Damini_Package;

public class example {
	
	int a;
	int b;
	
	void Show()
	{
		
		System.out.println(a);
		System.out.println(b);
	}
	
	void ShowUp()
	{
		
		int a=20;
		int b=40;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(this.a);
		System.out.println(this.b);
	}

	
	void initData(int x,int y)
	{
		a= x;
		b= y;
	}
	
	void init(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
}
