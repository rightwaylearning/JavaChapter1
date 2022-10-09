package Basic_Info;

public class Demo {

	public static void main(String[] args) {
		System.out.println("<<<<<<<<< Start >>>>>>>>>");
		int n = 0;
		try {
		int r = 10/n;
		} catch(Exception e) {
	//		System.out.println("Exception Occured");
			System.out.println("Exception Managed");
			n = 1;
			Demo.doDivision(n);
		}
		
		System.out.println("<<<<<<<<<  End  >>>>>>>>>");
	}
	
	public static void doDivision(int n) {
		System.out.println(10/n);
	}
}
