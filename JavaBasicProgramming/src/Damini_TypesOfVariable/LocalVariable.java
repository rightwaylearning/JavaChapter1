package Damini_TypesOfVariable;

public class LocalVariable {
	CollageModel s1()
	{
		String s="damini";
		int a=10;
		int b=20;
		
		CollageModel Model=new CollageModel();
		Model.info=s;
		Model.data1=a;
		Model.data2=b;
		
		
		
		
		return Model;
	}
	public static void main(String[] args) {
		
		LocalVariable ab=new LocalVariable();
		CollageModel data = ab.s1();
		System.out.println(data.info);
		System.out.println(data.data1);
		System.out.println(data.data2);
		
	}

}
