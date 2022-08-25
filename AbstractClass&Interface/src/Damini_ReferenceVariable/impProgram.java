package Damini_ReferenceVariable;

class base{
	
	int a=89;
	void s1()
	{
		System.out.println("Base");
	}
}
class derived extends base{
	int a=789;
	void s1()
	{
		System.out.println("derived");
	}
	
}


public class impProgram {
public static void main(String[] args) {
	
	base b=new derived();
	System.out.println(b.a);
	b.s1();
	
	
			
}
}
