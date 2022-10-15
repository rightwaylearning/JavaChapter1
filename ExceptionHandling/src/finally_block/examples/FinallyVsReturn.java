package finally_block.examples;

public class FinallyVsReturn {

	int getNum() {
		
		try {
			return 10/0;
		}catch(Exception e) {
			return 10/0;
		}finally {
			return 10/3;
		}
		
		
	}
	
	public static void main(String[] args) {
		FinallyVsReturn f = new FinallyVsReturn();
		System.out.println(f.getNum());
	}
}
