package Nilam_Abstraction;

public class MathOpNewImpl implements MathOperation {

	public int doAddition(int a, int b) {
		int r1 = a + b;
		return r1;

	}

	public int doSubstraction(int x, int y) {

		int r2 = x - y;
//	return r2;
		if (x >= y) {
			return r2;

		} else
			return 0;
	}

}
