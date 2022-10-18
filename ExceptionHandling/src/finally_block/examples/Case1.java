package finally_block.examples;

public class Case1 {

	public static void main(String[] args) {
		
		System.out.println("line no 1");
		
		try {
			System.out.println("line no 2");
			System.out.println("line no 3");
			System.out.println("line no 4");
		}catch (Exception e) {
			System.out.println("line no 5 "+e);
		}finally {
			System.out.println("line no 6");
		}
		
		System.out.println("line no 7");
		System.out.println("program is normally terminated");
		
	}
}
