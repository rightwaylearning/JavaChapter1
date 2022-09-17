package CompileTimePoly.com_Jivan;

class D{
	void m1(Integer a) {
		System.out.println("Integer ref type");
	}
	
	void m1(Byte b) {
		System.out.println("Short ref type");
	}
	
	void m1(short s) {
		System.out.println("Short args");
	}
}

public class Case_4 {
	
	public static void main(String[] args) {
		
		D d = new D();
		d.m1(10);     // int 1] match
		              //     2] upcast
		byte b = 10;  //     3] auto boxing
		d.m1(b);
	}

}
