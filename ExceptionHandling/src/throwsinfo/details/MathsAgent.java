package throwsinfo.details;

public class MathsAgent {

	void doOperation(int a, int b) {
		System.out.println("operation start");
		
		MathsOperation m = new MathsOperation();
		m.doMathsOpertaion(a, b);
		System.out.println("operation end");
	}
}
