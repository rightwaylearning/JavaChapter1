package test.sample;
class Z{
	Integer a =1000;
	String s = "hasgdfjhasgjdkgfasjkdgfjd";
	
	@Override
	public void finalize() throws Throwable {
		System.out.println("I am here to do final operation");
	}
}
public class FinalizeMethodDemo {

	public static void main(String[] args) throws Throwable {
		
	    Z z = new Z();
	    z = null;
	    System.gc();
	    Thread.sleep(500);
	    System.out.println(">>>>>>>>>. end >>>>>>>>>>");
	}
	
	
}
