package Nilam_Abstraction;

public class MathOpImpl implements MathOperation {

	public int doAddition(int a, int b) {
		int r = a + b;
		return r;
	}

	public int doSubstraction(int x, int y) {
		int result = x - y;
		return result;
	}
}
