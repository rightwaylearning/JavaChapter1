package Basic_Info;

public class BasicExceptionHandlingDemo {
	
	public static void main(String[] args) {
		
		try {
			int i = 10/0;
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
