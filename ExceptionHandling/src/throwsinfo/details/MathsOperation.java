package throwsinfo.details;

import java.io.File;

public class MathsOperation {

	void doMathsOpertaion(int a, int b) {
		
		int sum = a + b;
		System.out.println("sum = " + sum);

		int div = a / b;
		File f = new File("");
		try {
		f.createNewFile();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("div = " + div);

		int sub = a - b;
		System.out.println("sub = " + sub);

		int mul = a * b;
		System.out.println("mul = " + mul);
		
	}
}
