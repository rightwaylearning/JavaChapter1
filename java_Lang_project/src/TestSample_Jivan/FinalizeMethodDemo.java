package TestSample_Jivan;

class Z{
	Integer a = 1000;
	String s = "engvut hvryglmtnrgiumwo";
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("I am here to do final operation");
	}
}

public class FinalizeMethodDemo {
	
	public static void main(String[] args) throws Throwable {
		
		Z z = new Z();
		z = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(">>>>>> end >>>>>>>");
	}
}
	
