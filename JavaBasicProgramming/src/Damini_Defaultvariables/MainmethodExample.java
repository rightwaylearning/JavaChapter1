package Damini_Defaultvariables;

public class MainmethodExample {
	
	void sum(int...num) {
		int sum=0;
		
		for(int a:num)
		{
			sum=sum+a;
		}
		System.out.println("i m vre argument");
		System.out.println(sum);
	}
	void sum(int a,int b)
	{
		System.out.println("I hv parameter");
	}

}
