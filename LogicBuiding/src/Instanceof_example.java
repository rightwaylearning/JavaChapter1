
public class Instanceof_example {

	public static void main(String[] args) {
		Test t = new Test();
		Sample s = new Sample();
		
		if(t instanceof Sample) {
			System.out.println("Correct");
		}else {
			System.out.println("sorry");
		}
	}
}
