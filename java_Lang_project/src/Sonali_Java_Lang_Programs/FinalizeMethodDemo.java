package Sonali_Java_Lang_Programs;
class T{
	Integer i =10;
	String s ="Sonali";
	@Override
	protected void finalize() throws Throwable {
		System.out.println("I am working finalize method");
	}
}

public class FinalizeMethodDemo {
	public static void main(String[] args) throws Throwable {
		T t = new T();
		System.gc();
		Thread.sleep(2000);
		new T().finalize();
		System.out.println("<<<<<<<<<<<<<<<<<<<end .>>>>>>>>>>>>>>>>>>>>>>>");
	}

}
